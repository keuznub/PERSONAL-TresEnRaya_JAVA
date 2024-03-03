/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tresenrayanomaven;

/**
 *
 * @author breix
 */
public class Partida {
    private int partidaID;
    private String usuario1;
    private String usuario2;
    private String ganador;

    public Partida(int partidaID, String usuario1, String usuario2, String ganador) {
        this.partidaID = partidaID;
        this.usuario1 = usuario1;
        this.usuario2 = usuario2;
        this.ganador = ganador;
    }
    
    public Partida(int partidaID, String usuario1, String usuario2) {
        this.partidaID = partidaID;
        this.usuario1 = usuario1;
        this.usuario2 = usuario2;
        this.ganador = "undefined";
    }

    
    
    public String getUsuario1() {
        return usuario1;
    }

    public void setUsuario1(String usuario1) {
        this.usuario1 = usuario1;
    }

    public String getUsuario2() {
        return usuario2;
    }

    public void setUsuario2(String usuario2) {
        this.usuario2 = usuario2;
    }

    public String getGanador() {
        return ganador;
    }

    public void setGanador(String ganador) {
        this.ganador = ganador;
    }

    public int getPartidaID() {
        return partidaID;
    }

    public void setPartidaID(int partidaID) {
        this.partidaID = partidaID;
    }

    @Override
    public String toString() {
        return "PartidaID:" + partidaID + "\n" +
                "usuario1:" + usuario1 + "\n" +
                "usuario2:" + usuario2 + "\n" +
                "ganador:" + ganador;
                
    }
    
    
    
    
}
