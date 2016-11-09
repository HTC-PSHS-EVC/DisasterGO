package main;

/**
 *
 * @author cesista
 */
public class DataManager {
    // <editor-fold defaultstate="collapsed" desc="DATA">  
    private int [] resourceDist;
    
    private double [][] roadNetwork;
    private double [][] airNetwork;
    
    private double transferTime;
    
    private double [][] minDist;
    private int [][] minType;       // -1 -> empty
                                    //  0 -> road
                                    //  1 -> air
                                    //  2 -> combo
    // </editor-fold> 
    
    public int INF = 100000;
    
    public DataManager() {
        resourceDist = new int[7];
        
        double [][] defaultRoad = {{  0, 12, 24, 14,INF, 32,INF},
                                   { 12,  0,INF,INF,INF,INF,INF},
                                   { 24,INF,  0,  6, 10,INF,INF},
                                   { 14,INF,  6,  0,INF,INF,INF},
                                   {INF,INF, 10,INF,  0,INF,  7},
                                   { 32,INF,INF,INF,INF,  0,INF},
                                   {INF,INF,INF,INF,  7,INF,  0}};
        double [][] defaultAir  = {{0   , 1.75, 1.75, 1.75, 2   , 1.5 , 2   },
                                   {1.75,    0, 4.25, 5.5 , 5   , 4   , 4.25},
                                   {1.75, 4.25, 0   , 1.25, 5.25, 3.75, 2.75},
                                   {1.75, 5.5 , 1.25,  0  , 1.75, 1.75, 1.25},
                                   {2   , 5   , 5.25, 1.75, 0   , 4   , 1.5 },
                                   {1.5 , 4   , 3.75, 1.75, 4   , 0   , 3.5 },
                                   {2   , 4.25, 2.75, 1.25, 1.5 , 3.5 , 0   }};
        
        roadNetwork = defaultRoad;
        airNetwork  = defaultAir;
        
        transferTime = 3;           //  3 hours of preparation time
        
        minDist = new double [7][7];
        minType = new int    [7][7];
        
        for(int i = 0; i < 7; ++i){
            for(int j = 0; j < 7; ++j){
                minDist[i][j] = INF;
                minType[i][j] = -1;
            }
        }
        
        //calcNewDist();
        //calcAPSP();
    }
    
    //  recalculates the shortest distance between every pair of cities  
    public void calcNewDist(){
        for(int i = 0; i < 7; ++i){
            for(int j = 0; j < 7; ++j){
                if(roadNetwork[i][j] < minDist[i][j]){
                    minDist[i][j] = roadNetwork[i][j];
                    minType[i][j] = 0;
                }
                
                if(airNetwork[i][j] < minDist[i][j]){
                    minDist[i][j] = airNetwork[i][j];
                    minType[i][j] = 1;
                }
                //System.out.print(Double.toString(minDist[i][j]) + " ");
            }
            //System.out.println();
        }
    }
    
    //  calculates the shortest paths between all cities using
    //  Floyd-Warshall's algorithm
    public void calcAPSP(){
        for(int k = 0; k < 7; ++k){
            for(int i = 0; i < 7; ++i){
                for(int j = 0; j < 7; ++j){
                    double sum = minDist[i][k] + minDist[k][j];
                    
                    if(minType[i][k] != minType[k][j])
                        sum += transferTime;
                    
                    if(sum < minDist[i][j]){
                        minDist[i][j] = sum;
                        
                        if(minType[i][k] != minType[k][j])
                            minType[i][j] = 2;
                        else
                            minType[i][j] = minType[i][k];
                    }
                }
            }
        }
        /*
        for(int i = 0; i < 7; ++i){
            for(int j = 0; j < 7; ++j){
                System.out.print(Double.toString(minDist[i][j]) + " ");
            }
            System.out.println();
        }
        */
    }
    
    // <<editor-fold defaultstate="collapsed" desc="get-set of Resource Distribution">
    int getResDist(int city){
        return resourceDist[city];
    }
    
    void setResDist(int city, int value){
        resourceDist[city] = value;
    }
    // </editor-fold>
    
    // <<editor-fold defaultstate="collapsed" desc="Distance Getters"> 
    public double getRoadDist(int city1, int city2){
        return roadNetwork[city1][city2];
    }
    
    public double getAirDist(int city1, int city2){
        return airNetwork[city1][city2];
    }
    
    public double getMinDist(int city1, int city2){
        return minDist[city1][city2];
    }
    // </editor-fold>   
    
    // <<editor-fold defaultstate="collapsed" desc="Path Destroyers"> 
    public void destRoad(int city1, int city2){
        roadNetwork[city1][city2] = INF;
    }
    
    public void destAir(int city1, int city2){
        airNetwork[city1][city2] = INF;
    }   
    // </editor-fold>
    
}
