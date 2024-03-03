/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package tresenrayanomaven;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.Image;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author breix
 */
public class TablaResultados extends javax.swing.JDialog {
    private JuegoNuevo ventanaJuego;

    public TablaResultados(java.awt.Frame parent, boolean modal,JuegoNuevo ventanaJuego) {
        super(parent, modal);
        this.ventanaJuego = ventanaJuego;
        initComponents();
        this.setLocationRelativeTo(null);
        
        DefaultTableModel model = new DefaultTableModel(ventanaJuego.getPartidas().size(),0);
        model.addColumn("Partida ID");
        model.addColumn("Jugador 1 X");
        model.addColumn("Jugador 2 O");
        model.addColumn("Ganador");
        if(!ventanaJuego.getPartidas().isEmpty()){
            rellenarTabla(model);   
        }
        
        jTable2.setModel(model);
        
        ChangeFonts.changeFont(lblTablaResultados, 16);
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelFinDelJuego = new javax.swing.JPanel();
        lblTablaResultados = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        lblbackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanelFinDelJuego.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTablaResultados.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTablaResultados.setText("Tabla de Resultados");
        jPanelFinDelJuego.add(lblTablaResultados, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 355, -1));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jPanelFinDelJuego.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 390, 230));

        lblbackground.setBackground(new java.awt.Color(255, 255, 255));
        jPanelFinDelJuego.add(lblbackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(-5, 0, 420, 280));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelFinDelJuego, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelFinDelJuego, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanelFinDelJuego;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel lblTablaResultados;
    private javax.swing.JLabel lblbackground;
    // End of variables declaration//GEN-END:variables

    private void rellenarTabla(TableModel mod){
        for(int i = 0;i<ventanaJuego.getPartidas().size();i++){
            mod.setValueAt(ventanaJuego.getPartidas().get(i).getPartidaID(), i, 0);
            mod.setValueAt(ventanaJuego.getPartidas().get(i).getUsuario1(), i, 1);
            mod.setValueAt(ventanaJuego.getPartidas().get(i).getUsuario2(), i, 2);
            mod.setValueAt(ventanaJuego.getPartidas().get(i).getGanador(), i, 3);
        }
        
    }


}
