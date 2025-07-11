/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package aula5carro;

import javax.swing.JOptionPane;

/**
 *
 * @author Rafael55957146
 */
public class TelaCarro extends javax.swing.JFrame {

    //Variaveis
    int velocidade = 0;
    int gasolinaV = 100;
    
    /**
     * Creates new form TelaCarro
     */
    public TelaCarro() {
        initComponents();
        
        //Variaveis desabilitadas
        estado.setEnabled(false);
        gasolina.setEnabled(false);
        velocidadeAumentar.setEnabled(false);
        velocidadeDiminuir.setEnabled(false);
        resultado.setEnabled(false);
        
        // colocando valores iniciais nas variaveis
        estado.setText("Desligado"); 
        gasolina.setText(gasolinaV+"%");
        velocidadeAumentar.setText(velocidade+"km");
        velocidadeDiminuir.setText(velocidade+"km");
        
    }
    
    
    // Texto inicial da tabela resultado("Quadrado Giga")
    public void atualizarResultado() {
    
    resultado.setText(
            
            "Estado: " +estado.getText()+ "\n" +
            "Gasolina: " +gasolina.getText()+ "\n" +
            "Velocidade: " +velocidadeAumentar.getText()

        );
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        estado = new javax.swing.JTextField();
        gasolina = new javax.swing.JTextField();
        velocidadeAumentar = new javax.swing.JTextField();
        velocidadeDiminuir = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        resultado = new javax.swing.JTextArea();
        btnDiminuirVelocidade = new javax.swing.JButton();
        btnAbastecer = new javax.swing.JButton();
        btnAumentarVelocidade = new javax.swing.JButton();
        btnLigadoDesligado = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        estado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estadoActionPerformed(evt);
            }
        });

        velocidadeAumentar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                velocidadeAumentarActionPerformed(evt);
            }
        });

        velocidadeDiminuir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                velocidadeDiminuirActionPerformed(evt);
            }
        });

        resultado.setColumns(20);
        resultado.setRows(5);
        jScrollPane1.setViewportView(resultado);

        btnDiminuirVelocidade.setText("Diminuir Velocidade");
        btnDiminuirVelocidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDiminuirVelocidadeActionPerformed(evt);
            }
        });

        btnAbastecer.setText("Abastecer");
        btnAbastecer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbastecerActionPerformed(evt);
            }
        });

        btnAumentarVelocidade.setText("Aumentar Velocidade");
        btnAumentarVelocidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAumentarVelocidadeActionPerformed(evt);
            }
        });

        btnLigadoDesligado.setText("Ligar/Desligar");
        btnLigadoDesligado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLigadoDesligadoActionPerformed(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Carro");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnAumentarVelocidade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDiminuirVelocidade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAbastecer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnLigadoDesligado, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(velocidadeAumentar)
                            .addComponent(gasolina)
                            .addComponent(velocidadeDiminuir)
                            .addComponent(estado, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(60, 60, 60))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLigadoDesligado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gasolina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAbastecer))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(velocidadeAumentar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAumentarVelocidade))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(velocidadeDiminuir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDiminuirVelocidade))
                .addGap(35, 35, 35)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void estadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estadoActionPerformed
        
    }//GEN-LAST:event_estadoActionPerformed

    private void velocidadeDiminuirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_velocidadeDiminuirActionPerformed
        
    }//GEN-LAST:event_velocidadeDiminuirActionPerformed

    private void velocidadeAumentarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_velocidadeAumentarActionPerformed
        
    }//GEN-LAST:event_velocidadeAumentarActionPerformed

    private void btnDiminuirVelocidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDiminuirVelocidadeActionPerformed
        if (estado.getText().equals("Desligado")) {
            JOptionPane.showMessageDialog(null, "Ligue o Carro!");
            atualizarResultado();
        } else if (gasolinaV == 0) {
            JOptionPane.showMessageDialog(null, "Abasteça o Carro");
            atualizarResultado();
        } else if (velocidade <= 0) {
            velocidade = 0;
            velocidadeAumentar.setText(velocidade+"km");
            velocidadeDiminuir.setText(velocidade+"km");
            JOptionPane.showMessageDialog(null, "Você precisa ter mais velocidade para poder diminuir!");
        } else {
            velocidade = velocidade - 10;
            velocidadeAumentar.setText(velocidade+"km");
            velocidadeDiminuir.setText(velocidade+"km");
            atualizarResultado();
        }
    }//GEN-LAST:event_btnDiminuirVelocidadeActionPerformed

    private void btnLigadoDesligadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLigadoDesligadoActionPerformed
        if (estado.getText().equals("Desligado")) {
            estado.setText("Ligado");
            atualizarResultado();
        } else {
            estado.setText("Desligado");
            atualizarResultado();
        }
    }//GEN-LAST:event_btnLigadoDesligadoActionPerformed

    private void btnAbastecerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbastecerActionPerformed
        if (gasolinaV == 100) {
            JOptionPane.showMessageDialog(null, "O tanque já está cheio!");
        } else {
            gasolinaV = 100;
            gasolina.setText(gasolinaV+"%");
        }
    }//GEN-LAST:event_btnAbastecerActionPerformed

    private void btnAumentarVelocidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAumentarVelocidadeActionPerformed
        if (estado.getText().equals("Desligado")) {
            JOptionPane.showMessageDialog(null, "Ligue o Carro!");
            atualizarResultado();
        } else if (gasolinaV == 0) {
            JOptionPane.showMessageDialog(null, "Abasteça o Carro");
            atualizarResultado();
        } else if(velocidade == 150){
            JOptionPane.showMessageDialog(null, "O carro já atingiu a velocidade maxima!");
            atualizarResultado();
        } else {
            velocidade = velocidade + 10;
            gasolinaV = gasolinaV - 10;
            gasolina.setText(gasolinaV+"%");
            velocidadeAumentar.setText(velocidade+"km");
            velocidadeDiminuir.setText(velocidade+"km");
            
            atualizarResultado();
        }
    }//GEN-LAST:event_btnAumentarVelocidadeActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCarro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCarro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCarro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCarro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new TelaCarro().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAbastecer;
    private javax.swing.JButton btnAumentarVelocidade;
    private javax.swing.JButton btnDiminuirVelocidade;
    private javax.swing.JButton btnLigadoDesligado;
    private javax.swing.JTextField estado;
    private javax.swing.JTextField gasolina;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea resultado;
    private javax.swing.JTextField velocidadeAumentar;
    private javax.swing.JTextField velocidadeDiminuir;
    // End of variables declaration//GEN-END:variables
}
