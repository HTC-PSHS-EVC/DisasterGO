/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author cesista
 */
public class DataManager {
    // <editor-fold defaultstate="collapsed" desc="Road Networks">  
    private int [][] roadNetwork;
    private int [][] airNetwork;
    
    private int [][] minDist;
    private int [][] minType;       // -1 -> empty
                                    //  0 -> road
                                    //  1 -> air
                                    //  2 -> combo
    // </editor-fold> 
    
    public DataManager() {
        int [][] defaultRoad = {{ 0, -1, -1, -1, -1, -1, -1},
                                {-1,  0, -1, -1, -1, -1, -1},
                                {-1, -1,  0, -1, -1, -1, -1},
                                {-1, -1, -1,  0, -1, -1, -1},
                                {-1, -1, -1, -1,  0, -1, -1},
                                {-1, -1, -1, -1, -1,  0, -1},
                                {-1, -1, -1, -1, -1, -1,  0}};
        int [][] defaultAir  = {{ 0, -1, -1, -1, -1, -1, -1},
                                {-1,  0, -1, -1, -1, -1, -1},
                                {-1, -1,  0, -1, -1, -1, -1},
                                {-1, -1, -1,  0, -1, -1, -1},
                                {-1, -1, -1, -1,  0, -1, -1},
                                {-1, -1, -1, -1, -1,  0, -1},
                                {-1, -1, -1, -1, -1, -1,  0}};
        
        this.roadNetwork = defaultRoad;
        this.airNetwork  = defaultAir;
        
        this.minDist = new int [7][7];
        this.minType     = new int [7][7];
    }
    
    //  recalculates the shortest distance between every pair of cities  
    public void calcNewDist(){
        for(int i = 0; i < 7; ++i){
            for(int j = 0; j < 7; ++j){
                if(roadNetwork[i][j] != -1 && 
                   roadNetwork[i][j] > airNetwork[i][j]){
                    minDist[i][j] = roadNetwork[i][j];
                    minType[i][j] = 0;
                }else if(airNetwork[i][j] != -1){
                    minDist[i][j] = airNetwork[i][j];
                    minType[i][j] = 1;
                }else{
                    minDist[i][j] = -1;
                    minType[i][j] = -1;
                }
            }
        }
    }
    
    //  calculates the shortest paths between all cities using
    //  Floyd-Warshall's algorithm
    public void calcAPSP(){
        for(int k = 0; k < 7; ++k){
            for(int i = 0; i < 7; ++i){
                for(int j = 0; j < 7; ++j){
                    minDist[i][j] = -1;
                    minType[i][j] = -1;
                    
                    if(minDist[i][k] != -1 &&
                       minDist[k][j] != -1 &&
                       minDist[i][k] + minDist[k][j] < minDist[i][j]){
                        
                        minDist[i][j] = minDist[i][k] + minDist[k][j];
                        
                        if(minType[i][k] != minType[k][j]){
                            minType[i][j] = 2;
                        }else{
                            minType[i][j] = minType[i][k];
                        }
                    }
                }
            }
        }
    }
    
    // <<editor-fold defaultstate="collapsed" desc="Distance Getters"> 
    public int getRoadDist(int city1, int city2){
        return this.roadNetwork[city1][city2];
    }
    
    public int getAirDist(int city1, int city2){
        return this.airNetwork[city1][city2];
    }
    // </editor-fold>   
    
    // <<editor-fold defaultstate="collapsed" desc="Path Destroyers"> 
    public void destroyRoad(int city1, int city2){
        roadNetwork[city1][city2] = -1;
    }
    
    public void destroyAir(int city1, int city2){
        airNetwork[city1][city2] = -1;
    }   
    // </editor-fold>
    
}
