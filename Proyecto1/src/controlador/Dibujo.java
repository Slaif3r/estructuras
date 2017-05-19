/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.Canvas;
import java.awt.Graphics;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class Dibujo extends Canvas{
    public ImageIcon imagen;
    public Dibujo(){
        this.setSize(3000,2000);
    }
    public void paint(Graphics g){
    Icon imagen= new ImageIcon(getClass().getResource("/imagenes/DNodo.png"));
    ImageIcon img= (ImageIcon) imagen;
    g.drawImage(img.getImage(),50,50,70,30, this);
    g.drawImage(img.getImage(), 140, 50,70,30,this);
    g.drawImage(img.getImage(), 230, 50,70,30,this);
    g.drawImage(img.getImage(), 320, 50,70,30,this);
    g.drawImage(img.getImage(), 410, 50,70,30,this);
    g.drawImage(img.getImage(), 500, 50,70,30,this);
    g.drawImage(img.getImage(), 590, 50,70,30,this);
    g.drawImage(img.getImage(), 680, 50,70,30,this);
    g.drawImage(img.getImage(), 770, 50,70,30,this);
    this.repaint();
    super.paint(g);
    }
}
