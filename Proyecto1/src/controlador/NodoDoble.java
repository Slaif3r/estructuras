/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;




/**
 *
 * @author user
 */
public class NodoDoble {
    public Cliente dato;
    public NodoDoble siguiente;
    public NodoDoble anterior;
    
    public NodoDoble(Cliente dato) {
        this.dato= dato;
        siguiente = null;
        anterior = null;
    }
    
            
}
