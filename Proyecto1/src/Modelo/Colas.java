package Modelo;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import controlador.Cliente;

/**
 *
 * @author user
 */
public class Colas {
    public Cliente dato;
    public Colas siguiente;
    private Colas top;
    private Colas ultimo;

    public Colas(Cliente dato) {
        this.dato = dato;
        this.siguiente = null;
    }

    public Colas() {
        top = ultimo = null;
    }
    
    public boolean esVacia(){
        return(this.top == null);
    }
    
    public void encolar(Cliente d){
        Colas temp = new Colas(d);
        if (esVacia()){
            top = ultimo = temp;
        }
        else{
            ultimo.siguiente = temp;
            ultimo =temp;
        }
        System.out.println("ingresado: " + ultimo.dato);
    }
    
    public void desencolar(){
        if(esVacia()){
            System.out.println("Error al desencolar");
        }
        else{
           top= top.siguiente;
           //System.out.print("\n>["+top.dato+"]");
        }
    }
    
    public void print(){
        Colas aux = top;
        System.out.println("\n Cola:");
        while(aux != null){
            System.out.println(aux.dato);
            aux = aux.siguiente;
        }
    }
    public int size(){
        Colas aux = top;
        int contador = 0;
        while (aux!= null){
            contador ++;
            aux = aux.siguiente;
        }
        return contador;
    }
    
//    public static void main(String[] args) {
//        Colas c = new Colas();
//        c.encolar("Hola");
//        c.encolar("Mundo");
//        c.encolar("java");
//        c.encolar(999);
//        System.out.println("tamaño: "+ c.size());
//        System.out.println("vacia:" + c.esVacia());
//        c.print();
//        c.desencolar();
//        c.print();
//        System.out.println("tamaño: "+ c.size());
//    }

    public Colas get(int posicion) {
        Colas aux = top;
        int contador=0;
        while(contador != posicion){
            aux = aux.siguiente;
            contador++;
        }
        return aux;
    }
    public String presentar(){
        String texto="";
        Colas aux= top;
        while(aux!=null){
            texto +=aux.dato+"\n";
            System.out.println(texto+"\n");
            aux=aux.siguiente;
        }
        return texto;
    }
            
}
