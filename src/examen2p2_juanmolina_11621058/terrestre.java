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

    public terrestre(int tamano, int peso, int x, int y, String nombre, String tipo) {
        super(tamano, peso, x, y, nombre, tipo);
    }
    
}
