/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import javax.swing.JOptionPane;

/**
 * La clase INICIO proporciona la pantalla de inicio para la aplicación de la sopa de letras.
 * Esta pantalla sirve como punto de partida para leer archivos TXT y comenzar el juego.
 * 
 * autor Manuel
 */

public class INICIO extends javax.swing.JFrame {

    /**
     * Constructor que inicializa la interfaz gráfica y configura la ventana de inicio.
     */

    public INICIO() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        botonSig = new javax.swing.JButton();
        Titulo = new javax.swing.JLabel();
        Titulo2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonSig.setBackground(new java.awt.Color(51, 51, 51));
        botonSig.setFont(new java.awt.Font("Franklin Gothic Book", 3, 18)); // NOI18N
        botonSig.setForeground(new java.awt.Color(204, 204, 204));
        botonSig.setText("Leer TXT");
        botonSig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSigActionPerformed(evt);
            }
        });
        jPanel1.add(botonSig, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 220, 120, 40));

        Titulo.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 48)); // NOI18N
        Titulo.setForeground(new java.awt.Color(51, 51, 51));
        Titulo.setText("SOPA DE LETRAS");
        jPanel1.add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, -1, 50));

        Titulo2.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 24)); // NOI18N
        Titulo2.setForeground(new java.awt.Color(51, 51, 51));
        Titulo2.setText("Presione el boton para buscar un archivo txt");
        jPanel1.add(Titulo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, -1, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 373));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Acción realizada al presionar el botón 'Leer TXT'.
     * Cierra la ventana de inicio y abre la ventana para leer un archivo TXT.
     * 
     * @param evt Evento del botón.
     */

    private void botonSigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSigActionPerformed

        this.setVisible(false);
        INICIO inicio = new INICIO();
        LEER_TXT leertxt = new LEER_TXT();
        leertxt.setVisible(true);

    }//GEN-LAST:event_botonSigActionPerformed

    /**
     * Método principal que inicia la interfaz gráfica.
     * 
     * @param args Argumentos de la línea de comandos.
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
            java.util.logging.Logger.getLogger(INICIO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(INICIO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(INICIO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(INICIO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new INICIO().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Titulo;
    private javax.swing.JLabel Titulo2;
    private javax.swing.JButton botonSig;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
