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
 */
public class ElegirTurno2 extends javax.swing.JDialog {
    private JuegoNuevo ventanaJuego;
    private String usuario1;
    private String usuario2;
    //private ImageIcon background = new ImageIcon("Victoria.gif");
    
    /**
     * Creates new form FinDeJuego
     */
    public ElegirTurno2(java.awt.Frame parent, boolean modal,JuegoNuevo ventanaJuego) {
        super(parent, modal);
        this.ventanaJuego = ventanaJuego;
        if(ventanaJuego.getUsuario1().equals(ventanaJuego.getPartidas().get(ventanaJuego.getContadorPartidas()).getGanador())){
            usuario1 = ventanaJuego.getUsuario2();
            usuario2 = ventanaJuego.getUsuario1();
        }else{
            usuario1 = ventanaJuego.getUsuario1();
            usuario2 = ventanaJuego.getUsuario2();
        }
            
        System.out.println("Elegir turno usuario1:" + usuario1);
        System.out.println("Elegir turno usuario2:" + usuario2);
        initComponents();
        this.setLocationRelativeTo(null);
        //lblbackground.setIcon(new ImageIcon(background.getImage().getScaledInstance(lblbackground.getWidth(),lblbackground.getHeight(),Image.SCALE_DEFAULT)));
        ChangeFonts.changeFont(lblElegirTurno, 16);
        lblElegirTurno.setText("Quien empezará la siguiente partida?");
        btnU1.setText(usuario1);
        btnU2.setText(usuario2);
        
       
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
        btnU2 = new javax.swing.JButton();
        lblElegirTurno = new javax.swing.JLabel();
        btnU1 = new javax.swing.JButton();
        lblbackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanelFinDelJuego.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnU2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnU2ActionPerformed(evt);
            }
        });
        jPanelFinDelJuego.add(btnU2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, 140, -1));

        lblElegirTurno.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblElegirTurno.setText("Elige con qué quieres jugar");
        jPanelFinDelJuego.add(lblElegirTurno, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 355, -1));

        btnU1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnU1ActionPerformed(evt);
            }
        });
        jPanelFinDelJuego.add(btnU1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 140, -1));

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

    private void btnU2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnU2ActionPerformed
        this.dispose();
        System.out.println("Elegir turno usuario1:" + usuario1);
        System.out.println("Elegir turno usuario2:" + usuario2);
        ventanaJuego.setUsuario1(usuario2);
        ventanaJuego.setUsuario2(usuario1);
        ventanaJuego.setContadorPartidas();
        ventanaJuego.nuevoJuegoOut();
        
    }//GEN-LAST:event_btnU2ActionPerformed

    private void btnU1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnU1ActionPerformed
        this.dispose();
        System.out.println("Elegir turno usuario1:" + usuario1);
        System.out.println("Elegir turno usuario2:" + usuario2);
        ventanaJuego.setUsuario1(usuario1);
        ventanaJuego.setUsuario2(usuario2);
        ventanaJuego.setContadorPartidas();
        ventanaJuego.nuevoJuegoOut();
        
    }//GEN-LAST:event_btnU1ActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnU1;
    private javax.swing.JButton btnU2;
    private javax.swing.JPanel jPanelFinDelJuego;
    private javax.swing.JLabel lblElegirTurno;
    private javax.swing.JLabel lblbackground;
    // End of variables declaration//GEN-END:variables
    
     // Panel personalizado para el fondo
    


}
