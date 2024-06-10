/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import EDD.Grafo;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 * La clase LEER_TXT proporciona una interfaz gráfica para cargar y leer el contenido de archivos TXT.
 * Permite al usuario seleccionar un archivo, visualizar su contenido y sobrescribirlo si es necesario.
 * 
 * autor Manuel
 */

public class LEER_TXT extends javax.swing.JFrame {
    public static MENU ventana;
    public String[] diccionario;
    public Grafo grafo;
    public String path;

    /**
     * Constructor que inicializa la interfaz gráfica y configura la ventana de carga de TXT.
     */

    public LEER_TXT() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        botonAtras.setEnabled(false);
    }

    /**
     * Sobrescribe el contenido de un archivo TXT con la información del grafo y el diccionario.
     * 
     * @param grafo El grafo con las letras y sus conexiones.
     * @param diccionario El arreglo de palabras del diccionario.
     * @param direccion_txt La ruta del archivo TXT a sobrescribir.
     */
    
       public void sobrescribirTXT(Grafo grafo, String[] diccionario, String direccion_txt) {
        String datos = "";
        String linea;
        String datos_txt = "";
        String path = direccion_txt;
        File file = new File(path);
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file);
            try (PrintWriter pw = new PrintWriter(fw)) {
                pw.write("""
                                         dic
                                         """);
                for (int i = 0; i < grafo.nro_letras; i++) {
                    try {
                        pw.write(diccionario[i] + "\n");
                        
                    } catch (Exception e) {
                    }
                }
                pw.write("""
                                     /dic
                                     tab
                                     """);
                String letras = "";
                for (int i = 0; i < grafo.nro_letras; i++) {
                    if (i != grafo.nro_letras - 1) {
                        letras += grafo.v_letras[i].getCaracter() + ",";
                    } else {
                        letras += grafo.v_letras[i].getCaracter() + "\n";
                        
                    }
                }
                pw.write(letras);
                pw.write("""
                         /tab
                         """);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        botonAtras = new javax.swing.JButton();
        botonCargar = new javax.swing.JButton();
        botonGuardar = new javax.swing.JButton();
        direccion_txt = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        contenido_txt = new javax.swing.JTextArea();
        Titulo6 = new javax.swing.JLabel();
        Titulo8 = new javax.swing.JLabel();
        Titulo9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonAtras.setBackground(new java.awt.Color(204, 204, 204));
        botonAtras.setFont(new java.awt.Font("Franklin Gothic Book", 3, 18)); // NOI18N
        botonAtras.setForeground(new java.awt.Color(51, 51, 51));
        botonAtras.setText("X");
        botonAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAtrasActionPerformed(evt);
            }
        });
        jPanel1.add(botonAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 20, 50, 40));

        botonCargar.setBackground(new java.awt.Color(204, 204, 204));
        botonCargar.setFont(new java.awt.Font("Franklin Gothic Book", 3, 18)); // NOI18N
        botonCargar.setForeground(new java.awt.Color(51, 51, 51));
        botonCargar.setText("Cargar");
        botonCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCargarActionPerformed(evt);
            }
        });
        jPanel1.add(botonCargar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 370, 100, 40));

        botonGuardar.setBackground(new java.awt.Color(204, 204, 204));
        botonGuardar.setFont(new java.awt.Font("Franklin Gothic Book", 3, 18)); // NOI18N
        botonGuardar.setForeground(new java.awt.Color(51, 51, 51));
        botonGuardar.setText("Continuar");
        botonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(botonGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 370, 140, 40));

        direccion_txt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel1.add(direccion_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 440, 30));

        contenido_txt.setColumns(20);
        contenido_txt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        contenido_txt.setRows(5);
        jScrollPane1.setViewportView(contenido_txt);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, 440, 150));

        Titulo6.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 48)); // NOI18N
        Titulo6.setForeground(new java.awt.Color(204, 204, 204));
        Titulo6.setText("Cargar TXT");
        jPanel1.add(Titulo6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, 50));

        Titulo8.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 24)); // NOI18N
        Titulo8.setForeground(new java.awt.Color(204, 204, 204));
        Titulo8.setText("Direccion del archivo:");
        jPanel1.add(Titulo8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, -1, 50));

        Titulo9.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 24)); // NOI18N
        Titulo9.setForeground(new java.awt.Color(204, 204, 204));
        Titulo9.setText("Contenido del TXT:");
        jPanel1.add(Titulo9, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, -1, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 682, 442));

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
        MENU menu = new MENU(this);
        menu.setVisible(true);

    }//GEN-LAST:event_botonAtrasActionPerformed

    /**
     * Acción realizada al presionar el botón Cargar.
     * Abre un diálogo para seleccionar un archivo TXT y carga su contenido en la interfaz.
     * 
     * @param evt Evento del botón.
     */

    private void botonCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCargarActionPerformed

        JFileChooser fc = new JFileChooser();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("*.TXT", "txt");
        fc.setFileFilter(filtro);
        int seleccion = fc.showOpenDialog(this);
        if (seleccion == JFileChooser.APPROVE_OPTION) {
            File fichero = fc.getSelectedFile();
            String datos = "";
            this.direccion_txt.setText(fichero.getAbsolutePath());
            this.path = fichero.getAbsolutePath();
            try (FileReader fr = new FileReader(fichero); BufferedReader br = new BufferedReader(fr)) {
                StringBuilder cadena = new StringBuilder();
                String linea;
                int modo = 0;
                while ((linea = br.readLine()) != null) {
                    if (linea.equals("dic") || linea.equals("/dic")) {
                    } else if (linea.equals("tab") || linea.equals("/tab")) {
                        modo = 1;
                    } else if (modo == 0) {
                        datos += linea + ",";
                    } else {
                        linea = linea.replace(",", "");
                        this.grafo = new Grafo(linea.length(), linea);
                    }
                    cadena.append(linea).append("\n");
                }
                this.diccionario = datos.split(",");
                this.contenido_txt.setText(cadena.toString());
                botonAtras.setEnabled(true); 
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(null, "No se escogió un archivo válido");
        }
    }//GEN-LAST:event_botonCargarActionPerformed

    /**
     * Acción realizada al presionar el botón Continuar.
     * Procesa el contenido cargado y continúa con la siguiente etapa de la aplicación.
     * 
     * @param evt Evento del botón.
     */

    private void botonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardarActionPerformed
        if (contenido_txt != null) {
            this.setVisible(false);
            INICIO inicio = new INICIO();
            MENU menu = new MENU(this);
            menu.setVisible(true);
        }

    }//GEN-LAST:event_botonGuardarActionPerformed

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
            java.util.logging.Logger.getLogger(LEER_TXT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LEER_TXT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LEER_TXT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LEER_TXT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LEER_TXT().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Titulo6;
    private javax.swing.JLabel Titulo8;
    private javax.swing.JLabel Titulo9;
    private javax.swing.JButton botonAtras;
    private javax.swing.JButton botonCargar;
    private javax.swing.JButton botonGuardar;
    private javax.swing.JTextArea contenido_txt;
    private javax.swing.JTextField direccion_txt;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
