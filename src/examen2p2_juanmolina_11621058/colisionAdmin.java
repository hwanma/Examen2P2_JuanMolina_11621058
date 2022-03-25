/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2p2_juanmolina_11621058;

import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;
import javax.swing.JTextField;

/**
 *
 * @author Hwan
 */
public class colisionAdmin implements Runnable{
    private JProgressBar jpb_colision;
    private JTextField jtf_planeta1;
    private JTextField jtf_planeta2;
    private Random r = new Random();
    private int distancia;
    private boolean pausa = false;
    private planeta p1,p2;
    private cientifico c1;

    public colisionAdmin(JProgressBar jpb_colision, JTextField jtf_planeta1, JTextField jtf_planeta2, planeta p1, planeta p2, cientifico c1) {
        this.jpb_colision = jpb_colision;
        this.jtf_planeta1 = jtf_planeta1;
        this.jtf_planeta2 = jtf_planeta2;
        this.p1 = p1;
        this.p2 = p2;
        this.c1 = c1;
    }
    
    
    
    @Override
    public void run() {
        int cont = 0;
        while(true){
            System.out.print("");
            int counter = 0;
            while(!pausa){
                try{
                    distancia = (int)Math.round(((double)(Math.sqrt((Math.pow((p2.getX() - p1.getX()), 2)) + (Math.pow((p2.getY() - p1.getY()), 2))))));
                    jpb_colision.setMaximum((int)distancia);
                    jpb_colision.setValue(counter);
                    if(jpb_colision.getValue()>=(int)distancia){
                        pausa=true;
                        nuevoPlaneta(p1,p2);
                    }
                    counter++;
                    Thread.sleep(5);
                }catch(Exception ex){
                    System.out.println(ex);
                }
            }
        }
    }
    
    public void nuevoPlaneta(planeta p1,planeta p2){
        int prob;
        mainFrame m = new mainFrame();
        double peso = (p1.getPeso()+p2.getPeso())/2;
        double tamano = (p1.getTamano()+p2.getTamano())/2;
        double x = (p1.getX()+p2.getX())/2;
        double y = (p1.getY()+p2.getY())/2; 
        
        if(p1 instanceof terrestre){
            prob = 1+r.nextInt(99);
            if(prob<=24){
                String nombre = JOptionPane.showInputDialog("Un nuevo planeata se ha creado!"+
                        "\nIngrese el nombre del nuevo planeta: ");
                c1.getDescubiertos().add(new terrestre(tamano,peso,x,y,nombre));
            }
        } else if (p1 instanceof gaseoso){
            prob = 1+r.nextInt(19);
            if(prob<=20){
                String nombre = JOptionPane.showInputDialog("Un nuevo planeata se ha creado!"+
                        "\nIngrese el nombre del nuevo planeta: ");
                c1.getDescubiertos().add(new gaseoso(tamano,peso,x,y,nombre));
            }
        }
        m.guardarCientificos();
        JOptionPane.showMessageDialog(null,"Simulacion Exitosa!");
        jpb_colision.setMaximum(0);
        jpb_colision.setValue(0);
        jtf_planeta1.setText("");
        jtf_planeta2.setText("");
    }
    
}
