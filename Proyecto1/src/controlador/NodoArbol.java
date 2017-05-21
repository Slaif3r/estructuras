/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import javax.swing.JFrame;

/**
 *
 * @author Slaifer
 */

public class NodoArbol extends JFrame{
    private double radio = 0.0;
    private double diameter;

    public NodoArbol() {
        super ("Dibujar nodos");
        setSize(150,400);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
   
}
