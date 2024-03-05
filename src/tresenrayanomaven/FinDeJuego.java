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

/**
 *
 * @author breix
 * Fin de juego Window
 */
public class FinDeJuego extends javax.swing.JDialog {

    private String usuario;
    private ImageIcon background = new ImageIcon("Victoria.gif");
    private JuegoNuevo ventanaJuego;
    /**
     * Creates new form FinDeJuego
     */
    public FinDeJuego(java.awt.Frame parent, boolean modal,JuegoNuevo ventanaJuego) {
        super(parent, modal);
        this.ventanaJuego = ventanaJuego;
        usuario = ventanaJuego.getPartidas().get(ventanaJuego.getContadorPartidas()).getGanador();
        initComponents();
        lblbackground.setIcon(new ImageIcon(background.getImage().getScaledInstance(lblbackground.getWidth(),lblbackground.getHeight(),Image.SCALE_DEFAULT)));
        ChangeFonts.changeFont(lblFelicitacion, 28);
        ChangeFonts.changeFont(lblGanaste, 24);
        lblGanaste.setForeground(Color.GREEN);
        lblFelicitacion.setText("Felicidades " + usuario);
        lblFelicitacion.setForeground(Color.GREEN);
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelFinDelJuego = new javax.swing.JPanel();
        btnNuevaPartida = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        lblFelicitacion = new javax.swing.JLabel();
        lblGanaste = new javax.swing.JLabel();
        lblbackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanelFinDelJuego.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnNuevaPartida.setText("Nueva Partida");
        btnNuevaPartida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevaPartidaActionPerformed(evt);
            }
        });
        jPanelFinDelJuego.add(btnNuevaPartida, new org.netbeans.lib.awtextra.AbsoluteConstraints(206, 160, 140, -1));

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanelFinDelJuego.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 188, 90, -1));

        lblFelicitacion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFelicitacion.setText("Felicidades");
        jPanelFinDelJuego.add(lblFelicitacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 355, -1));

        lblGanaste.setText("Ganaste!");
        jPanelFinDelJuego.add(lblGanaste, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 146, 170, 30));

        lblbackground.setBackground(new java.awt.Color(255, 255, 255));
        jPanelFinDelJuego.add(lblbackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(-5, 0, 360, 220));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelFinDelJuego, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelFinDelJuego, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevaPartidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevaPartidaActionPerformed
        this.dispose();
        ventanaJuego.elegirTurnoOut();
       
    }//GEN-LAST:event_btnNuevaPartidaActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
         this.dispose();
        ventanaJuego.dispose();
       
    }//GEN-LAST:event_btnSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNuevaPartida;
    private javax.swing.JButton btnSalir;
    private javax.swing.JPanel jPanelFinDelJuego;
    private javax.swing.JLabel lblFelicitacion;
    private javax.swing.JLabel lblGanaste;
    private javax.swing.JLabel lblbackground;
    // End of variables declaration//GEN-END:variables
    
     // Panel personalizado para el fondo
    


}
