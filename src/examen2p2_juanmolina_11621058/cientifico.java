/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2p2_juanmolina_11621058;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Hwan
 */
public class cientifico implements Serializable{
    private String nombre;
    private ArrayList<planeta> descubiertos = new ArrayList();

    public cientifico() {
    }
    
    public cientifico(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<planeta> getDescubiertos() {
        return descubiertos;
    }

    public void setDescubiertos(ArrayList<planeta> descubiertos) {
        this.descubiertos = descubiertos;
    }

    @Override
    public String toString() {
        return nombre;
    }
}
