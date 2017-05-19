/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import Modelo.ListaDoble;
import controlador.Dibujo;
import Modelo.ListaOrdenada;
/**
 *
 * @author geovanny
 */
public class PanelDibujo extends javax.swing.JPanel {

    /**
     * Creates new form PanelDibujo
     */
    Dibujo dibujos = new Dibujo();
    int valor = 0;
    String nombreNodo;
    ListaOrdenada lista = new ListaOrdenada();


    public PanelDibujo(int valor, String nombreNodo,ListaOrdenada lista) {

        initComponents();
        this.setOpaque(true);
        this.setSize(new Dimension(3000, 20));
        this.setBackground(Color.red);
        this.valor = valor;
        this.nombreNodo = nombreNodo;
        this.lista = lista;


    }
    
  


    
    public void paint(Graphics g) {

        Icon imagen = new ImageIcon(getClass().getResource("/imagenes/nodod3.png"));
        
        ImageIcon img = (ImageIcon) imagen;
        
        g.setColor(Color.white);
        g.fillRect(0, 0, getSize().width,getSize().height);
        
        
        
        int disNodo = 50,
        aumentoNodo = 150;
        
        int disNombre = 60,
        aumentoNombre=150;
        
        for (int i = 0; i < valor; i++) {
            g.drawImage(img.getImage(), disNodo, 30, 180, 50, this);

            disNodo += aumentoNodo;
            
            this.setSize(disNodo+200, 21);
                                    
            g.setColor(Color.BLUE);
            
            g.drawString(lista.get(i).clave +"  " +lista.get(i).dato.getNombres(), disNombre, 58);

            this.repaint();

            
            disNombre += aumentoNombre;

        }

    }

   

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        setBackground(new java.awt.Color(57, 52, 180));
        setPreferredSize(new java.awt.Dimension(10000, 120));

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${autoscrolls}"), this, org.jdesktop.beansbinding.BeanProperty.create("autoscrolls"));
        bindingGroup.addBinding(binding);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10000, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );

        bindingGroup.bind();
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
