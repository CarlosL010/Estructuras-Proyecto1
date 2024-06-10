/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaces;

import javax.swing.JOptionPane;

/**
 * La clase BUSCAR_ESPECIFICO proporciona una interfaz gráfica para buscar palabras específicas.
 * Permite al usuario introducir una palabra y buscarla utilizando el algoritmo de búsqueda en amplitud (BFS).
 * Si la palabra no se encuentra, se añadirá automáticamente al diccionario.
 * 
 * autor Manuel
 */

public class BUSCAR_ESPECIFICO extends javax.swing.JFrame {
    public static LEER_TXT ventana;

    /**
     * Constructor que inicializa la interfaz gráfica y configura la ventana principal.
     * 
     * @param ventana Instancia de la clase LEER_TXT que contiene el diccionario y la sopa de letras.
     */
    public BUSCAR_ESPECIFICO(LEER_TXT ventana) {
        initComponents();
        this.ventana = ventana;
        ventana.setVisible(false);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        botonAtras = new javax.swing.JButton();
        botonBuscar = new javax.swing.JButton();
        palabra = new javax.swing.JTextField();
        Titulo6 = new javax.swing.JLabel();
        Titulo8 = new javax.swing.JLabel();
        Titulo9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonAtras.setBackground(new java.awt.Color(51, 51, 51));
        botonAtras.setFont(new java.awt.Font("Franklin Gothic Book", 3, 18)); // NOI18N
        botonAtras.setForeground(new java.awt.Color(204, 204, 204));
        botonAtras.setText("X");
        botonAtras.setActionCommand("Atrás");
        botonAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAtrasActionPerformed(evt);
            }
        });
        jPanel1.add(botonAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 10, 50, 40));

        botonBuscar.setBackground(new java.awt.Color(51, 51, 51));
        botonBuscar.setFont(new java.awt.Font("Franklin Gothic Book", 3, 18)); // NOI18N
        botonBuscar.setForeground(new java.awt.Color(204, 204, 204));
        botonBuscar.setText("Buscar (BFS)");
        botonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(botonBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 210, 150, 40));

        palabra.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jPanel1.add(palabra, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 260, 40));

        Titulo6.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 48)); // NOI18N
        Titulo6.setForeground(new java.awt.Color(51, 51, 51));
        Titulo6.setText("BUSCAR ESPECIFICO");
        jPanel1.add(Titulo6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, 50));

        Titulo8.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 18)); // NOI18N
        Titulo8.setForeground(new java.awt.Color(51, 51, 51));
        Titulo8.setText("(si la palabra no se encuentra en el txt, se añadira automaticamente)");
        jPanel1.add(Titulo8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, -1, 50));

        Titulo9.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 24)); // NOI18N
        Titulo9.setForeground(new java.awt.Color(51, 51, 51));
        Titulo9.setText("Introduzca una palabra");
        jPanel1.add(Titulo9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, -1, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 370));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Acción realizada al presionar el botón Atrás.
     * Cierra la ventana actual y muestra la ventana de inicio.
     * 
     * @param evt Evento del botón.
     */

    private void botonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAtrasActionPerformed
        this.setVisible(false);
        INICIO inicio = new INICIO();
        MENU menu = new MENU(ventana);
        menu.setVisible(true);
    }//GEN-LAST:event_botonAtrasActionPerformed

    /**
     * Acción realizada al presionar el botón Buscar.
     * Realiza la búsqueda de la palabra introducida y muestra un mensaje con el resultado.
     * 
     * @param evt Evento del botón.
     */

    private void botonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarActionPerformed
        // TODO add your handling code here:
        String palabra = this.palabra.getText().toUpperCase();
        boolean existe = false;
        for (int i = 0; i < ventana.diccionario.length; i++) {
            if(palabra.equals(ventana.diccionario[i])){
                existe = true;
            }
        }
        if(!existe){
            String[] diccionario = new String[ventana.diccionario.length +1];
            for (int i = 0; i < ventana.diccionario.length; i++) {
                diccionario[i] = ventana.diccionario[i];
            }
            diccionario[ventana.diccionario.length] = palabra;
            ventana.diccionario = diccionario;
            ventana.sobrescribirTXT(ventana.grafo, ventana.diccionario, ventana.path);
        }
        if (palabra.length() > 2) {
            if (ventana.grafo.amplitud(palabra)) {
                JOptionPane.showMessageDialog(rootPane, palabra + " SE ENCUENTRA EN LA SOPA DE LETRAS");
            } else {
                JOptionPane.showMessageDialog(rootPane, palabra + " NO SE ENCUENTRA EN LA SOPA DE LETRAS");

            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "ERROR! LA PALABRA DEBE CONTENER COMO MINIMO 3 LETARS");

        }
    }//GEN-LAST:event_botonBuscarActionPerformed

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
            java.util.logging.Logger.getLogger(BUSCAR_ESPECIFICO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BUSCAR_ESPECIFICO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BUSCAR_ESPECIFICO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BUSCAR_ESPECIFICO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BUSCAR_ESPECIFICO(ventana).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Titulo6;
    private javax.swing.JLabel Titulo8;
    private javax.swing.JLabel Titulo9;
    private javax.swing.JButton botonAtras;
    private javax.swing.JButton botonBuscar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField palabra;
    // End of variables declaration//GEN-END:variables
}
