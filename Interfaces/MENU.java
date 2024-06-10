/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import EDD.Grafo;

/**
 * La clase MENU proporciona una interfaz gráfica para el menú principal de la aplicación de sopa de letras.
 * Desde aquí, el usuario puede elegir realizar una búsqueda en el diccionario o una búsqueda específica.
 * 
 * autor Manuel
 */

public class MENU extends javax.swing.JFrame {

    public static LEER_TXT ventanaTXT;
    public Grafo grafo;
    public String[] diccionario;

    /**
     * Constructor que inicializa la interfaz gráfica y configura la ventana del menú.
     * 
     * @param ventanaTXT Instancia de la clase LEER_TXT que contiene el grafo y el diccionario.
     */

    public MENU(LEER_TXT ventanaTXT) {
        initComponents();
        this.ventanaTXT = ventanaTXT;
        this.grafo = ventanaTXT.grafo;
        this.diccionario = ventanaTXT.diccionario;
        ventanaTXT.setVisible(false);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        botonBuscar = new javax.swing.JButton();
        botonBuscarEsp = new javax.swing.JButton();
        Titulo6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonBuscar.setBackground(new java.awt.Color(51, 51, 51));
        botonBuscar.setFont(new java.awt.Font("Franklin Gothic Book", 3, 18)); // NOI18N
        botonBuscar.setForeground(new java.awt.Color(204, 204, 204));
        botonBuscar.setText("Buscar por Diccionario");
        botonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(botonBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 230, 230, 40));

        botonBuscarEsp.setBackground(new java.awt.Color(51, 51, 51));
        botonBuscarEsp.setFont(new java.awt.Font("Franklin Gothic Book", 3, 18)); // NOI18N
        botonBuscarEsp.setForeground(new java.awt.Color(204, 204, 204));
        botonBuscarEsp.setText("Busqueda Especifica");
        botonBuscarEsp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarEspActionPerformed(evt);
            }
        });
        jPanel1.add(botonBuscarEsp, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, 230, 40));

        Titulo6.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 48)); // NOI18N
        Titulo6.setForeground(new java.awt.Color(51, 51, 51));
        Titulo6.setText("MENU");
        jPanel1.add(Titulo6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Acción realizada al presionar el botón 'Buscar por Diccionario'.
     * Abre la ventana de búsqueda por diccionario.
     * 
     * @param evt Evento del botón.
     */


    private void botonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarActionPerformed
        this.setVisible(false);

        BUSQUEDA_DICCIONARIO buscar = new BUSQUEDA_DICCIONARIO(ventanaTXT);

        buscar.setVisible(true);
    }//GEN-LAST:event_botonBuscarActionPerformed

    /**
     * Acción realizada al presionar el botón 'Busqueda Especifica'.
     * Abre la ventana de búsqueda específica.
     * 
     * @param evt Evento del botón.
     */

    private void botonBuscarEspActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarEspActionPerformed
        BUSCAR_ESPECIFICO buscar = new BUSCAR_ESPECIFICO(ventanaTXT);
        buscar.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_botonBuscarEspActionPerformed

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
            java.util.logging.Logger.getLogger(MENU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MENU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MENU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MENU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MENU(ventanaTXT).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Titulo6;
    private javax.swing.JButton botonBuscar;
    private javax.swing.JButton botonBuscarEsp;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
