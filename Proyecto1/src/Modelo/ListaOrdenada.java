/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import controlador.Cliente;
import controlador.Nodo;

/**
 *
 * @author user
 */
public class ListaOrdenada {
    private Nodo cabecera;
    private Nodo aux;
    
    public boolean esVacia(){
        return (this.cabecera == null);
    }
    
    public int size(){
        int contador =0;
        if(! esVacia()){
              aux = cabecera;
             
        }
        while( aux != null){
            aux = aux.siguiente ;
            contador ++;
        }
        return contador;
    }
    
    public String print(){
        
       String a ="";
       Nodo aux1 = cabecera;
        if(! esVacia()){
            while (aux1 != null){
                a = a+aux1.clave + "["+aux1.dato+"]" +"\n" ;
                aux1=aux1.siguiente;
                
            }
        
        }else{
            System.out.println("La lista esta vacia");
        }
        
        return a;
    }
    
    public void insertarInicio(Cliente dato, int clave){
        Nodo nuevo = new Nodo(dato,clave);
        if(esVacia()){
            cabecera = nuevo;//cuando es vacia
        }
        else{//Si la clave es menor
            if(clave < cabecera.clave){
                nuevo.siguiente = cabecera;
                cabecera = nuevo;
            }else{//Si no
                Nodo aux = cabecera;
                Nodo anterior = cabecera;
                while(clave > aux.clave && aux.siguiente!=null){//recorrer
                    anterior = aux;
                    aux= aux.siguiente;
                }
                if(clave > aux.clave && aux.siguiente== null){
                    aux.siguiente = nuevo;
                }else{
                    if(clave!= aux.clave){//Entre nodos
                        nuevo.siguiente = aux;
                        anterior.siguiente = nuevo;
                    }
                }
            }
            
        }
        
    }
    
    public void eliminarLista(){
       if(! esVacia()){
           cabecera.siguiente = null;
           cabecera = null;
       } 
    }
    
    public void eliminarInicio(){
        if(! esVacia()){
            if(cabecera.siguiente != null)
                cabecera = cabecera.siguiente;
        }
    }
    
    public void eliminarFinal(){
        Nodo aux = cabecera;
        while(aux.siguiente.siguiente!= null){
            aux = aux.siguiente;
        }
        aux.siguiente = null;
    }
    
    public void eliminarNodoClave(int clave){
        Nodo aux =  cabecera;
        if (!esVacia()) {
            if (aux.siguiente==null&&cabecera.clave==clave) {
                eliminarLista();
            }else{
                if (aux.clave==clave) {
                    eliminarInicio();
                }else{
                    while (aux.siguiente!=null) {                        
                        if (aux.siguiente.clave==clave) {
                            Nodo eliminar = aux.siguiente;
                            aux.siguiente = aux.siguiente.siguiente;
                            eliminar.siguiente=null;
                            break;
                        }
                        aux = aux.siguiente;
                    }
                }
            }
        }else{
            System.out.println("La lista esta vacia no se puede eliminar");
        }
    }
    
    public Nodo buscar(int clave){
        Nodo aux = cabecera;
        if(! esVacia())
            if(aux.clave == clave)
                return aux;
            while(aux.siguiente!= null){
                    if(aux.siguiente.clave == clave)
                        return aux.siguiente;
                    aux = aux.siguiente;
            }
          return null;
    }
    public Nodo get(int posicion){
        Nodo aux = cabecera;
        int contador=0;
        while(contador != posicion){
            aux = aux.siguiente;
            contador++;
        }
        return aux;
    }
    
     public void modificar(int clave, Cliente datoModificar){
        Nodo aux = buscar(clave);
        if(aux != null){
            aux.dato = datoModificar;
        }
    }
     
     public Nodo buscarDato(String ced){
        Nodo aux = cabecera;
        if(! esVacia())
            if(aux.dato.getCedula().equals(ced))
                return aux;
            while(aux.siguiente!= null){
                    if(aux.siguiente.dato.getCedula().equals(ced))
                        return aux.siguiente;
                    aux = aux.siguiente;
            }
          return null;
    }
//     public void modificarDato(int dato, int datoModificar){
//        Nodo aux = buscarDato(dato);
//        if(aux != null){
//            aux.dato = datoModificar;
//        }
//    }
     
    
    
}
