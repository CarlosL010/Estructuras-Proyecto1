/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import javax.swing.JOptionPane;

    /**
     * La clase BUSQUEDA_DICCIONARIO proporciona una interfaz gráfica para buscar palabras en un diccionario.
     * Muestra el diccionario completo y permite realizar búsquedas utilizando algoritmos DFS y BFS.
     * 
     * autor Manuel
     */

public class BUSQUEDA_DICCIONARIO extends javax.swing.JFrame {

    public static LEER_TXT ventana;

    /**
     * Constructor que inicializa la interfaz gráfica y configura la ventana principal.
     * 
     * @param ventana Instancia de la clase LEER_TXT que contiene el diccionario y la sopa de letras.
     */

    public BUSQUEDA_DICCIONARIO(LEER_TXT ventana) {
        initComponents();
        this.ventana = ventana;
        ventana.setVisible(false);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        for (int i = 0; i < ventana.diccionario.length; i++) {
            this.dicc.setText(this.dicc.getText() + ventana.diccionario[i] + ", ");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        botonAtras = new javax.swing.JButton();
        Buscar1 = new javax.swing.JButton();
        Buscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        enconttradas = new javax.swing.JTextArea();
        Titulo6 = new javax.swing.JLabel();
        Titulo7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        dicc = new javax.swing.JTextArea();
        Titulo8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonAtras.setBackground(new java.awt.Color(204, 204, 204));
        botonAtras.setFont(new java.awt.Font("Franklin Gothic Book", 2, 18)); // NOI18N
        botonAtras.setForeground(new java.awt.Color(51, 51, 51));
        botonAtras.setText("X");
        botonAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAtrasActionPerformed(evt);
            }
        });
        jPanel1.add(botonAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 10, 40, 40));

        Buscar1.setBackground(new java.awt.Color(204, 204, 204));
        Buscar1.setFont(new java.awt.Font("Franklin Gothic Book", 2, 18)); // NOI18N
        Buscar1.setForeground(new java.awt.Color(51, 51, 51));
        Buscar1.setText("Buscar por DFS");
        Buscar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Buscar1ActionPerformed(evt);
            }
        });
        jPanel1.add(Buscar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 360, 160, 40));

        Buscar.setBackground(new java.awt.Color(204, 204, 204));
        Buscar.setFont(new java.awt.Font("Franklin Gothic Book", 2, 18)); // NOI18N
        Buscar.setForeground(new java.awt.Color(51, 51, 51));
        Buscar.setText("Buscar por BFS");
        Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarActionPerformed(evt);
            }
        });
        jPanel1.add(Buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 360, 160, 40));

        enconttradas.setColumns(20);
        enconttradas.setRows(5);
        jScrollPane1.setViewportView(enconttradas);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 210, 300, 140));

        Titulo6.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 42)); // NOI18N
        Titulo6.setForeground(new java.awt.Color(204, 204, 204));
        Titulo6.setText("Busqueda por Diccionario");
        jPanel1.add(Titulo6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, 50));

        Titulo7.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 24)); // NOI18N
        Titulo7.setForeground(new java.awt.Color(204, 204, 204));
        Titulo7.setText("Palabras encontradas:");
        jPanel1.add(Titulo7, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 150, -1, 50));

        dicc.setColumns(20);
        dicc.setRows(5);
        jScrollPane2.setViewportView(dicc);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 300, 140));

        Titulo8.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 24)); // NOI18N
        Titulo8.setForeground(new java.awt.Color(204, 204, 204));
        Titulo8.setText("Diccionario");
        jPanel1.add(Titulo8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, -1, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Acción realizada al presionar el botón Atrás.
     * Cierra la ventana actual y muestra la ventana del menú principal.
     * 
     * @param evt Evento del botón.
     */

    private void botonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAtrasActionPerformed
        this.setVisible(false);
        MENU menu = new MENU(ventana);
        menu.setVisible(true);

    }//GEN-LAST:event_botonAtrasActionPerformed

    /**
     * Acción realizada al presionar el botón Buscar por DFS.
     * Realiza la búsqueda de todas las palabras del diccionario utilizando DFS y muestra los resultados.
     * 
     * @param evt Evento del botón.
     */

    private void Buscar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Buscar1ActionPerformed
        long inicio = System.currentTimeMillis();
        this.enconttradas.setText("");
        for (String word : ventana.diccionario) {
            if (ventana.grafo.profundidad(word)) {
                this.enconttradas.setText(enconttradas.getText() + "," + word);
            }
        }
        long fin = System.currentTimeMillis();
        long tiempo_total = fin - inicio;

        JOptionPane.showMessageDialog(null, "Tiempo de ejecución: " + tiempo_total + " milisegundos");
    }//GEN-LAST:event_Buscar1ActionPerformed

    /**
     * Acción realizada al presionar el botón Buscar por BFS.
     * Realiza la búsqueda de todas las palabras del diccionario utilizando BFS y muestra los resultados.
     * 
     * @param evt Evento del botón.
     */

    private void BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarActionPerformed
        long inicio = System.currentTimeMillis();
        this.enconttradas.setText("");
        for (String word : ventana.diccionario) {
            if (ventana.grafo.amplitud(word)) {
                this.enconttradas.setText(enconttradas.getText() + "," + word);
            }
        }
        long fin = System.currentTimeMillis();
        long tiempo_total = fin - inicio;
        JOptionPane.showMessageDialog(null, "Tiempo de ejecución: " + tiempo_total + " milisegundos");
    }//GEN-LAST:event_BuscarActionPerformed

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
            java.util.logging.Logger.getLogger(BUSQUEDA_DICCIONARIO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BUSQUEDA_DICCIONARIO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BUSQUEDA_DICCIONARIO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BUSQUEDA_DICCIONARIO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BUSQUEDA_DICCIONARIO(ventana).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Buscar;
    private javax.swing.JButton Buscar1;
    private javax.swing.JLabel Titulo6;
    private javax.swing.JLabel Titulo7;
    private javax.swing.JLabel Titulo8;
    private javax.swing.JButton botonAtras;
    private javax.swing.JTextArea dicc;
    private javax.swing.JTextArea enconttradas;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
