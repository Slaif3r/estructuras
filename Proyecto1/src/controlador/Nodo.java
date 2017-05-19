/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

/**
 *
 * @author Usuario
 */
public class Nodo {
    public Cliente dato;
    public Nodo siguiente;
    public int clave;
    public Nodo(Cliente dato){
        this.dato=dato;
        siguiente=null;
    }
    public Nodo(Cliente dato,int clave){
        this.dato=dato;
        this.clave=clave;
        siguiente=null;
    }
    public Object getDato() {
        return dato;
    }

    public void setDato(Cliente dato) {
        this.dato = dato;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
    
}
