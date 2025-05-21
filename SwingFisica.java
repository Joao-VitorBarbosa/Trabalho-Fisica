package com.mycompany.trabalhofisica;

import javax.swing.JOptionPane;

public class SwingFisica extends javax.swing.JFrame {

    public SwingFisica() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        velocidadeFloco = new javax.swing.JLabel();
        txtVelocidadeFloco = new javax.swing.JTextField();
        velocidadeCarro = new javax.swing.JLabel();
        txtVelocidadeCarro = new javax.swing.JTextField();
        jButtonCalcular = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabelAnguloGraus = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabelAngulo = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jButtonResetar = new javax.swing.JButton();
        EixoY = new javax.swing.JLabel();
        EixoX = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calcular Angulo");

        velocidadeFloco.setText("Velocidade do floco de neve (m/s):");

        velocidadeCarro.setText("Velocidade do carro (km/h):");

        txtVelocidadeCarro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVelocidadeCarroActionPerformed(evt);
            }
        });

        jButtonCalcular.setText("Calcular");
        jButtonCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCalcularActionPerformed(evt);
            }
        });

        jLabel1.setText("Angulo θ (em radianos): ");

        jLabel2.setText("Angulo θ (em graus): ");

        jButtonResetar.setForeground(new java.awt.Color(204, 0, 0));
        jButtonResetar.setText("Reset");
        jButtonResetar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonResetarActionPerformed(evt);
            }
        });

        EixoY.setText("(Eixo y = eixo das ordenads)");

        EixoX.setText("(Eixo x = eixo das abscissa)");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(velocidadeFloco, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                            .addComponent(txtVelocidadeFloco)
                            .addComponent(velocidadeCarro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtVelocidadeCarro)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelAngulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelAnguloGraus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(EixoY, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(EixoX, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(65, 65, 65)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButtonCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonResetar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47))))
            .addComponent(jSeparator1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(velocidadeFloco)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(EixoY)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtVelocidadeFloco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addComponent(velocidadeCarro)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jButtonResetar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(EixoX)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtVelocidadeCarro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabelAngulo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabelAnguloGraus, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtVelocidadeCarroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVelocidadeCarroActionPerformed
        // TODO add your handling code here:
  
    }//GEN-LAST:event_txtVelocidadeCarroActionPerformed

    private void jButtonCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCalcularActionPerformed

           try{
 
        if(txtVelocidadeCarro.getText().equals("") || txtVelocidadeFloco.getText().equals("")){

            JOptionPane.showMessageDialog(null, "Preencha os campos corretamente!","Erro", HEIGHT);
            
    }else if(Double.parseDouble(txtVelocidadeCarro.getText()) > 330 || Double.parseDouble(txtVelocidadeFloco.getText()) > 100){
            
    JOptionPane.showMessageDialog(rootPane,"Valores inseridos não condizem com a realidade!", "Aviso", HEIGHT);
    
        }else if(Double.parseDouble(txtVelocidadeCarro.getText()) < 0 || Double.parseDouble(txtVelocidadeFloco.getText()) < 0){
            
            JOptionPane.showMessageDialog(rootPane,"As velocidades devem ser miores do que 0!", "Aviso", HEIGHT);
             
        }else{

            double doubVelocidadeFloco = Double.parseDouble(txtVelocidadeFloco.getText());
            double doubVelocidadeCarro = Double.parseDouble(txtVelocidadeCarro.getText());
            double velocidadeCarroEmMs = doubVelocidadeCarro * 1000 / 3600;
            double anguloRadianos = Math.atan(velocidadeCarroEmMs /doubVelocidadeFloco);
            String stgAnguloRadianos = String.format("%.3f", anguloRadianos);
            double anguloGraus = Math.toDegrees(anguloRadianos);
            String stgAnguloGraus =String.format("%.3f", anguloGraus);
             
            
            jLabelAngulo.setText(stgAnguloRadianos);
            jLabelAnguloGraus.setText(stgAnguloGraus);
            
        }
            }catch(NumberFormatException e){
                
                JOptionPane.showMessageDialog(null, "Digite um numero valido", "Erro", HEIGHT);
            }
           
    }//GEN-LAST:event_jButtonCalcularActionPerformed

    private void jButtonResetarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonResetarActionPerformed
        // TODO add your handling code here:
        
        txtVelocidadeCarro.setText("");
        txtVelocidadeFloco.setText("");
        jLabelAngulo.setText("");
        jLabelAnguloGraus.setText("");
       
    }//GEN-LAST:event_jButtonResetarActionPerformed

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
            java.util.logging.Logger.getLogger(SwingFisica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SwingFisica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SwingFisica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SwingFisica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SwingFisica().setVisible(true);
            }
        });   
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel EixoX;
    private javax.swing.JLabel EixoY;
    private javax.swing.JButton jButtonCalcular;
    private javax.swing.JButton jButtonResetar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelAngulo;
    private javax.swing.JLabel jLabelAnguloGraus;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField txtVelocidadeCarro;
    private javax.swing.JTextField txtVelocidadeFloco;
    private javax.swing.JLabel velocidadeCarro;
    private javax.swing.JLabel velocidadeFloco;
    // End of variables declaration//GEN-END:variables
}
