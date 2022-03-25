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
public class terrestre extends planeta implements Serializable{

    public terrestre(double tamano, double peso, double x, double y, String nombre) {
        super(tamano, peso, x, y, nombre);
    }
    
}
