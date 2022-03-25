/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2p2_juanmolina_11621058;

import java.io.Serializable;

/**
 *
 * @author Hwan
 */
public class planeta implements Serializable{
    private double tamano,peso,x,y;
    private String nombre,tipo;

    public planeta() {
    }

    public planeta(double tamano, double peso, double x, double y, String nombre) {
        this.tamano = tamano;
        this.peso = peso;
        this.x = x;
        this.y = y;
        this.nombre = nombre;
    }

    public double getTamano() {
        return tamano;
    }

    public void setTamano(double tamano) {
        this.tamano = tamano;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }   

    @Override
    public String toString() {
        return nombre;
    }

    
    
    
}
