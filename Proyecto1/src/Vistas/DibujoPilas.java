/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Vistas;


import Modelo.Colas;
import Modelo.Pila;

import controlador.Dibujo;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author Usuario
 */
public class DibujoPilas extends javax.swing.JPanel {
    Dibujo db=new Dibujo();
    String nombre;
    int cont=0;
    Pila ls=new Pila();
    
    public DibujoPilas(int cont,String nombre,Pila ls) {
        initComponents();
        this.setOpaque(true);
        this.setSize(new Dimension(3000,20));
        this.setBackground(Color.black);
        this.cont=cont;
        this.nombre=nombre;
        this.ls=ls;
    }
    
    
    public void paint(Graphics g){
    Icon imagen=new ImageIcon(getClass().getResource("/imagenes/nodod.png"));
    ImageIcon img=(ImageIcon) imagen;
    g.setColor(Color.white);
    g.fillRect(0, 0, getSize().width,getSize().height);
     
        int disNodo = 50,aumentoNodo = 120;
        
        int disNombre = 70,aumentoNombre=120;
        
        for (int i = 0; i < cont; i++) {

            g.drawImage(img.getImage(), disNodo, 35, 170, 50, this);

            disNodo += aumentoNodo;
            
            this.setSize(disNodo+200, 21);
                                    
            g.setColor(Color.blue);
            g.drawString(ls.get(i).getDato().getNombres(), disNombre, 63);

            this.repaint();

            
            disNombre += aumentoNombre;

        }

    }
    
    
    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
