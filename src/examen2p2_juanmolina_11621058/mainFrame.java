/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2p2_juanmolina_11621058;

import java.awt.Color;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author Hwan
 */
public class mainFrame extends javax.swing.JFrame implements Runnable {

    private DefaultMutableTreeNode nodo_seleccionado;
    private planeta planeta_seleccionado;
    private cientifico cientifico_seleccionado;
    private planeta p1;
    private cientifico c1;
    private planeta p2;
    private ArrayList<planeta> publicos = new ArrayList();
    private ArrayList<cientifico> cientificos = new ArrayList();
    Random r = new Random();
    
    public mainFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
        agregarPublicos();
        cargarCientificos();
        cientificosCombo();
        publicosArbol();
        
        DefaultTreeModel mod = (DefaultTreeModel)jt_planetas.getModel();
        DefaultMutableTreeNode ro = new DefaultMutableTreeNode("Planetas");
        mod.setRoot(ro);
    }

    Thread hilo = new Thread(this);
    Random rd = new Random();
    private double distancia;
    boolean pausa = false;
    @Override
    public void run(){
        int cont = 0;
        while(true){
            System.out.print("");
            while(!pausa){
                try{
                    distancia = (double) Math.sqrt((Math.pow((p2.getX() - p1.getX()), 2)) + (Math.pow((p2.getY() - p1.getY()), 2)));
                    jpb_colision.setMaximum((int)distancia);
                    jpb_colision.setValue((int)distancia);
                    if(jpb_colision.getValue()>=(int)distancia){
                        pausa=true;
                    }
                    Thread.sleep(5);
                }catch(Exception ex){
                    System.out.println(ex);
                }
            }
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpm_seleccion = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jProgressBar1 = new javax.swing.JProgressBar();
        jScrollPane1 = new javax.swing.JScrollPane();
        jt_planetas = new javax.swing.JTree();
        jchb_publico = new javax.swing.JCheckBox();
        jpb_colision = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();
        jtf_planeta1 = new javax.swing.JTextField();
        jtf_planeta2 = new javax.swing.JTextField();
        jcb_cientificos = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        nombreCientifico = new javax.swing.JTextField();
        jb_cientifico = new javax.swing.JButton();
        jb_colisionar = new javax.swing.JButton();

        jMenuItem1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenuItem1.setText("Planeta 1");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jpm_seleccion.add(jMenuItem1);

        jMenuItem2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenuItem2.setText("Planeta 2");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jpm_seleccion.add(jMenuItem2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jt_planetas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jt_planetasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jt_planetas);

        jchb_publico.setText("PUBLICOS");
        jchb_publico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jchb_publicoActionPerformed(evt);
            }
        });

        jLabel1.setText("CIENTIFICOS");

        jcb_cientificos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jcb_cientificos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcb_cientificosItemStateChanged(evt);
            }
        });
        jcb_cientificos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcb_cientificosActionPerformed(evt);
            }
        });

        jLabel2.setText("NOMBRE");

        jb_cientifico.setText("ANADIR CIENTIFICO");
        jb_cientifico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_cientificoActionPerformed(evt);
            }
        });

        jb_colisionar.setText("COLISIONAR");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jProgressBar1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 599, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jpb_colision, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 599, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jchb_publico))
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtf_planeta1)
                            .addComponent(jtf_planeta2)
                            .addComponent(jcb_cientificos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2)
                            .addComponent(nombreCientifico)
                            .addComponent(jb_cientifico, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE))
                        .addGap(46, 46, 46)
                        .addComponent(jb_colisionar, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addComponent(jpb_colision, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jchb_publico))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jtf_planeta1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jtf_planeta2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jb_colisionar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(26, 26, 26)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jcb_cientificos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nombreCientifico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jb_cientifico)))
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jb_cientificoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_cientificoActionPerformed
        String nombre = nombreCientifico.getText();
        cientifico temp = new cientifico(nombre);
        cientificos.add(temp);
        cientificosCombo();
        
        nombreCientifico.setText("");
        guardarCientificos();
    }//GEN-LAST:event_jb_cientificoActionPerformed

    private void jchb_publicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jchb_publicoActionPerformed
        if(jchb_publico.isSelected()){
            publicosArbol();
        } else {
            descubiertosArbol();
        }
    }//GEN-LAST:event_jchb_publicoActionPerformed

    private void jt_planetasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jt_planetasMouseClicked
        if(evt.isMetaDown()){
            try {
            int row = jt_planetas.getClosestRowForLocation(evt.getX(), evt.getY());
            jt_planetas.setSelectionRow(row);
            Object v1 = jt_planetas.getSelectionPath().getLastPathComponent();
            nodo_seleccionado = (DefaultMutableTreeNode) v1;
            planeta_seleccionado = (planeta) nodo_seleccionado.getUserObject();
            } catch (Exception e) {

            }
            jpm_seleccion.show(evt.getComponent(),evt.getX(),evt.getY());
        }
    }//GEN-LAST:event_jt_planetasMouseClicked

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        if(!jtf_planeta1.getText().equals(planeta_seleccionado.toString())){
            jtf_planeta1.setText(planeta_seleccionado.toString());
            p1=planeta_seleccionado;
            c1=cientifico_seleccionado;
        }  
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        if(!jtf_planeta2.getText().equals(planeta_seleccionado.toString())){
            jtf_planeta2.setText(planeta_seleccionado.toString());
            p2=planeta_seleccionado;
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jcb_cientificosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcb_cientificosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcb_cientificosActionPerformed

    private void jcb_cientificosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcb_cientificosItemStateChanged
        cientifico_seleccionado = (cientifico)jcb_cientificos.getSelectedItem();
    }//GEN-LAST:event_jcb_cientificosItemStateChanged
    
    private void agregarPublicos(){
        publicos.add(new planeta(5000,13000,400,300,"Mercurio","Terrestre"));
        publicos.add(new planeta(100000,15000,640,260,"Venus","Terrestre"));
        publicos.add(new planeta(140000,17000,760,570,"Tierra","Terrestre"));
        publicos.add(new planeta(90000,12000,360,360,"Marte","Terrestre"));
        publicos.add(new planeta(400000,40000,340,310,"Jupiter","Gaseoso"));
        publicos.add(new planeta(300000,30000,560,450,"Saturno","Gaseoso"));
        publicos.add(new planeta(200000,20000,670,690,"Urano","Gaseoso"));
        publicos.add(new planeta(200000,20000,840,900,"Neptuno","Gaseoso"));
    }
    
    public void nuevoPlaneta(planeta p1,planeta p2){
        int prob;
        if(p1 instanceof terrestre){
            prob = 1+r.nextInt(99);
            if(prob<=24){
                String nombre = JOptionPane.showInputDialog("Un nuevo planeata se ha creado!"+
                        "\nIngrese el nombre del nuevo planeta: ");
                double peso = (p1.getPeso()+p2.getPeso())/2;
                c1.getDescubiertos().add(new planeta());
            }
        } else if (p1 instanceof gaseoso){
            prob = 1+r.nextInt(19);
        }
    }
    
    private void cientificosCombo(){
        DefaultComboBoxModel modelo = (DefaultComboBoxModel)jcb_cientificos.getModel();
        modelo.removeAllElements();
        for (cientifico temp : cientificos)
            modelo.addElement(temp);
    }
    
    private void publicosArbol(){
        DefaultTreeModel modelo = (DefaultTreeModel)jt_planetas.getModel();
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Planetas");
        for (planeta temp : publicos){
            DefaultMutableTreeNode planetaNodo = new DefaultMutableTreeNode(temp);
            root.add(planetaNodo);
        }
        modelo.setRoot(root);
    } 
    
    private void descubiertosArbol(){
        DefaultTreeModel modelo = (DefaultTreeModel)jt_planetas.getModel();
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Planetas");
        for (planeta temp : cientifico_seleccionado.getDescubiertos()){
            DefaultMutableTreeNode planetaNodo = new DefaultMutableTreeNode(temp);
            root.add(planetaNodo);
        }
        modelo.setRoot(root);
    } 
    
    private void guardarCientificos(){
        try{
            ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("./cientificos"));
            for (cientifico temp : cientificos)
                os.writeObject(temp);
        }catch(Exception ex){
            System.out.println(ex);
        }
    }
    
    private void cargarCientificos(){
        try{
            ObjectInputStream os = new ObjectInputStream(new FileInputStream("./cientificos"));
            cientifico cientifico;
            while( (cientifico = (cientifico)os.readObject()) != null )
                cientificos.add(cientifico);
        }catch(Exception ex){
            System.out.println(ex);
        }
    }
    
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
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jb_cientifico;
    private javax.swing.JButton jb_colisionar;
    private javax.swing.JComboBox<String> jcb_cientificos;
    private javax.swing.JCheckBox jchb_publico;
    private javax.swing.JProgressBar jpb_colision;
    private javax.swing.JPopupMenu jpm_seleccion;
    private javax.swing.JTree jt_planetas;
    private javax.swing.JTextField jtf_planeta1;
    private javax.swing.JTextField jtf_planeta2;
    private javax.swing.JTextField nombreCientifico;
    // End of variables declaration//GEN-END:variables
}
