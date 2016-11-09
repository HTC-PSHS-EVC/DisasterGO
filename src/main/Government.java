package main;
import javax.swing.JOptionPane;
import javax.swing.JLabel;
import java.util.Random;

/**
 *
 * @author Sony VAIO
 */
public class Government extends javax.swing.JFrame {
    
    private DataManager data;
    
    /**
     * Creates new form Government
     */
    public Government() {
        initComponents();
        max.setText(maximum+"%");
    }
    
    private int maximum = 100;
    private int totalpercent=0;
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSpinner7 = new javax.swing.JSpinner();
        Manila = new javax.swing.JLabel();
        Tuguegarao = new javax.swing.JLabel();
        Cagayan = new javax.swing.JLabel();
        Davao = new javax.swing.JLabel();
        Puerto = new javax.swing.JLabel();
        Cebu = new javax.swing.JLabel();
        Tacloban = new javax.swing.JLabel();
        MNL = new javax.swing.JSpinner();
        TUG = new javax.swing.JSpinner();
        TAC = new javax.swing.JSpinner();
        CEB = new javax.swing.JSpinner();
        DAV = new javax.swing.JSpinner();
        CDO = new javax.swing.JSpinner();
        PUE = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        max = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tot = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        AffectedCityText = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Manila.setText("Manila");

        Tuguegarao.setText("Tuguegarao");

        Cagayan.setText("CDO");

        Davao.setText("Davao");

        Puerto.setText("Puerto Princesa");

        Cebu.setText("Cebu");

        Tacloban.setText("Tacloban");

        MNL.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 10));
        MNL.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                MNLStateChanged(evt);
            }
        });

        TUG.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 10));
        TUG.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                TUGStateChanged(evt);
            }
        });

        TAC.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 10));
        TAC.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                TACStateChanged(evt);
            }
        });

        CEB.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 10));
        CEB.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                CEBStateChanged(evt);
            }
        });

        DAV.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 10));
        DAV.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                DAVStateChanged(evt);
            }
        });

        CDO.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 10));
        CDO.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                CDOStateChanged(evt);
            }
        });

        PUE.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 10));
        PUE.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                PUEStateChanged(evt);
            }
        });

        jLabel1.setText("Maximum: ");

        max.setText("100%");

        jLabel3.setText("Total:");

        tot.setText("0%");

        jButton1.setText("Start Simulation");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        AffectedCityText.setText("Affected");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(282, 282, 282)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(DAV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Davao)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(PUE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Puerto)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(max)
                                .addGap(60, 60, 60)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tot))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(33, 33, 33)
                                .addComponent(AffectedCityText)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CDO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(Cagayan)))
                .addGap(200, 200, 200))
            .addGroup(layout.createSequentialGroup()
                .addGap(270, 270, 270)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(MNL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Manila))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(CEB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(Tuguegarao)
                                .addGap(8, 8, 8))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(TUG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Cebu)
                        .addGap(92, 92, 92)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TAC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Tacloban))))
                .addGap(106, 106, 106))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(max)
                    .addComponent(jLabel3)
                    .addComponent(tot))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(TUG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Tuguegarao))
                    .addComponent(MNL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Manila)
                        .addGap(39, 39, 39)
                        .addComponent(CEB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Cebu)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                        .addComponent(PUE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(DAV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(Puerto)
                                .addGap(51, 51, 51)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Davao)
                            .addComponent(Cagayan))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(AffectedCityText))
                        .addGap(25, 25, 25))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(TAC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Tacloban)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(CDO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(90, 90, 90))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private int getInputSum(){
        return (Integer) MNL.getValue() + (Integer) TAC.getValue() + 
               (Integer) CEB.getValue() + (Integer) TUG.getValue() +
               (Integer) PUE.getValue() + (Integer) CDO.getValue() + 
               (Integer) DAV.getValue();
    }
    
    private void MNLStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_MNLStateChanged
        totalpercent = getInputSum();
        
        if(totalpercent > maximum) {
            JOptionPane.showMessageDialog(null, "Maximum Percentage Exceeded");
            MNL.setValue(MNL.getPreviousValue());
        }
        
        tot.setText(Integer.toString(totalpercent) + "%");
    }//GEN-LAST:event_MNLStateChanged

    private void TUGStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_TUGStateChanged
        totalpercent = getInputSum();
        
        if(totalpercent > maximum) {
            JOptionPane.showMessageDialog(null, "Maximum Percentage Exceeded");
            TUG.setValue(TUG.getPreviousValue());
        }
        
        tot.setText(Integer.toString(totalpercent) + "%");
    }//GEN-LAST:event_TUGStateChanged

    private void CEBStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_CEBStateChanged
        totalpercent = getInputSum();
        
        if(totalpercent > maximum) {
            JOptionPane.showMessageDialog(null, "Maximum Percentage Exceeded");
            CEB.setValue(CEB.getPreviousValue());
        }
        
        tot.setText(Integer.toString(totalpercent) + "%");
    }//GEN-LAST:event_CEBStateChanged

    private void TACStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_TACStateChanged
        totalpercent = getInputSum();
        
        if(totalpercent > maximum){
            JOptionPane.showMessageDialog(null, "Maximum Percentage Exceeded");
            TAC.setValue(TAC.getPreviousValue());
        }
        
        tot.setText(Integer.toString(totalpercent) + "%");
    }//GEN-LAST:event_TACStateChanged

    private void PUEStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_PUEStateChanged
        totalpercent = getInputSum();
        
        if(totalpercent > maximum) {
            JOptionPane.showMessageDialog(null, "Maximum Percentage Exceeded");
            PUE.setValue(PUE.getPreviousValue());
        }
        
        tot.setText(Integer.toString(totalpercent) + "%");
    }//GEN-LAST:event_PUEStateChanged

    private void DAVStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_DAVStateChanged
        totalpercent = getInputSum();
        
        if(totalpercent > maximum) {
            JOptionPane.showMessageDialog(null, "Maximum Percentage Exceeded");
            DAV.setValue(DAV.getPreviousValue());
        }
        tot.setText(Integer.toString(totalpercent) + "%");
    }//GEN-LAST:event_DAVStateChanged

    private void CDOStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_CDOStateChanged
        totalpercent = getInputSum();
        
        if(totalpercent > maximum) {
            JOptionPane.showMessageDialog(null, "Maximum Percentage Exceeded");
            CDO.setValue(CDO.getPreviousValue());
        }
        tot.setText(Integer.toString(totalpercent) + "%");
    }//GEN-LAST:event_CDOStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        sim1();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void sim1(){
        Random rand = new Random();
        int totalScore = 0;
        
        for(int desCity = 0; desCity < 7; ++desCity){
            data = new DataManager();
            
            data.setResDist(0, (Integer) MNL.getValue());
            data.setResDist(1, (Integer) TUG.getValue());
            data.setResDist(2, (Integer) TAC.getValue());
            data.setResDist(3, (Integer) CEB.getValue());
            data.setResDist(4, (Integer) DAV.getValue());
            data.setResDist(5, (Integer) PUE.getValue());
            data.setResDist(6, (Integer) CDO.getValue());
            
            //  assume that the affected city's airport gets rekt
            //  50% chance for each road leading to the city to get rekt
            for(int otherCity = 0; otherCity < 7; ++otherCity){
                if(otherCity != desCity){
                    data.destAir(desCity, otherCity);
                    data.destAir(otherCity, desCity);
                    
                    //if(rand.nextDouble() > 0.5){
                    //    data.destRoad(desCity, otherCity);
                    //    data.destRoad(otherCity, desCity);
                    //}
                }
            }
            
            //  recalculate shortest paths
            data.calcNewDist();
            data.calcAPSP();
            
            int score = 0;
            
            for(int otherCity = 0; otherCity < 7; ++otherCity){
                if(otherCity != desCity && 
                   data.getMinDist(desCity, otherCity) < 24){
                    score += data.getResDist(otherCity);
                    //System.out.print(Double.toString(data.getResDist(otherCity)) + " ");
                }
            }
            
            totalScore += score;
            
            System.out.println(Double.toString(score) + " " + Integer.toString(desCity));
            //max.setText(Double.toString(data.getMinDist(, score)))
        }
        
        max.setText(Double.toString(totalScore/7.0) + " ");
    }
    
    int [] getDisasterForecast(){
        int [] desCity = new int [10];
        
        for(int i = 0; i < 10; ++i){
            Random rn = new Random();
            int num = rn.nextInt(7);
            desCity[i] = num;
        }
        
        int [] occur = new int[7];
        for(int i = 0; i < 10; ++i){
            occur[desCity[i]]++;
        }
        
        return occur;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Government.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Government.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Government.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Government.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Government().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AffectedCityText;
    private javax.swing.JSpinner CDO;
    private javax.swing.JSpinner CEB;
    private javax.swing.JLabel Cagayan;
    private javax.swing.JLabel Cebu;
    private javax.swing.JSpinner DAV;
    private javax.swing.JLabel Davao;
    private javax.swing.JSpinner MNL;
    private javax.swing.JLabel Manila;
    private javax.swing.JSpinner PUE;
    private javax.swing.JLabel Puerto;
    private javax.swing.JSpinner TAC;
    private javax.swing.JSpinner TUG;
    private javax.swing.JLabel Tacloban;
    private javax.swing.JLabel Tuguegarao;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSpinner jSpinner7;
    private javax.swing.JLabel max;
    private javax.swing.JLabel tot;
    // End of variables declaration//GEN-END:variables
}
