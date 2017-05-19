/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import controlador.Cliente;

/**
 *
 * @author user
 */
public class Pila {
    private Cliente dato;
    private Pila siguiente;
    public Pila top= null;
    
    public Pila(){
        dato = null;
        siguiente = null;
    }

    public void setDato(Cliente dato) {
        this.dato = dato;
    }

    public Cliente getDato() {
        return dato;
    }
    
    public boolean esVacia(){
        return (top == null);
    }
    
    public void apilar(Cliente o){
        Pila aux = new Pila();
        aux.dato = o;
        aux.siguiente = top;
        top = aux;
        System.out.println( "agregado( "+top.getDato()+" )" );

    }
    
    public void desapilar(){
        if(esVacia())
            System.out.println("No hay elementos en la Pila");
        else{
            System.out.println( "eliminado( "+top.getDato()+" )" );

            top= top.siguiente;
            
        }
    }
    
    public void print(){
        Pila aux;
        aux= top;
        System.out.println("Elementos:");
        while(aux != null){
            if(aux.siguiente != null){
                System.out.println(aux.dato );
            }
            else{
                System.out.println(aux.dato );
            }
            aux =aux.siguiente;
        }
    }
    
    public Object verTope(){
        if (esVacia())
            return null;
        else
            return(top.dato);
    }
    
    public int size(){
        Pila aux = top;
        int contador = 0;
        while (aux!= null){
            contador++;
            aux = aux.siguiente;
        }
        return contador;
    }
    
    public Pila get(int posicion) {
        Pila aux = top;
        int contador=0;
        while(contador != posicion){
            aux = aux.siguiente;
            contador++;
        }
        return aux;
    }
    public String presentar(){
        String texto="";
        Pila aux= top;
        while(aux!=null){
            texto +=aux.dato+"\n";
            System.out.println(texto+"\n");
            aux=aux.siguiente;
        }
        return texto;
    }
    
//    public static void main(String[] args) {
//        Pila p = new Pila();
//        
//        p.apilar("Hola");
//        p.apilar("Mundo");
//        p.apilar("9999");
//        p.apilar("table");
//        
//        p.print();
//        p.desapilar();
//        p.print();
//        System.out.println("====================");
//        System.out.println(p.verTope());
//        System.out.println("Tamaño");
//        System.out.println(p.size());
//    }
}
