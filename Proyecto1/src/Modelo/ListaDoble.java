/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import controlador.Cliente;
import controlador.NodoDoble;

/**
 *
 * @author user
 */
public class ListaDoble {
    private NodoDoble cabecera;
     private NodoDoble aux;
    
    public ListaDoble(){
        cabecera = null;
    }
    public boolean esVacia(){
        return (this.cabecera == null);
    }
    public void insertarCabecera(Cliente dato){
       NodoDoble nuevo=new NodoDoble(dato);
        if(esVacia()){
            cabecera = nuevo;
        }
    }
    
    public void insertarInicio(Cliente dato){
        NodoDoble nuevo = new NodoDoble(dato);
        if(! esVacia()){
            nuevo.siguiente=cabecera;
            cabecera.anterior = nuevo;
            cabecera = nuevo;
            
        }
    }
    
    public void insertarFinal(Cliente dato){
        NodoDoble nuevo = new NodoDoble(dato);
        NodoDoble aux = cabecera;
        if(esVacia())
            insertarCabecera(dato);
        
        else{
            while(aux.siguiente != null){
                aux= aux.siguiente;
            }
            aux.siguiente=nuevo;
            nuevo.anterior=aux;
        }
    }
    
    public void insertarPosicion(Cliente dato,int posicion){
        NodoDoble nuevo = new NodoDoble(dato);
        
        if(posicion == 0){
            if(cabecera == null)
                insertarCabecera(dato);
            else
                insertarInicio(dato);
        }
        else{
            if(posicion ==size())
                insertarFinal(dato);
            else
                if(posicion > 0 && posicion < size()){
                    NodoDoble aux = cabecera;
                    int recorrido=1;
                    while(recorrido != posicion ){
                        aux= aux.siguiente;
                        recorrido++;
                    }
                    nuevo.siguiente =aux.siguiente;
                    aux.siguiente.anterior = nuevo;
                    aux.siguiente= nuevo;
                    nuevo.anterior = aux;
                }
        }
        
    }
    
    public void eliminarInicio(){
        if(! esVacia())
            if(cabecera.siguiente != null){
                 cabecera =cabecera.siguiente;
                //cabecera.anterior=null;
            }
        
    }
    
    public void eliminarFinal(){
        NodoDoble aux =cabecera;
        
            while(aux.siguiente.siguiente!= null){
                aux = aux.siguiente;
            }
            
            aux.siguiente =null;
        
    }
    
    public void eliminar(int posicion){
        NodoDoble aux = cabecera;
        int pos =1;
        if(! esVacia()){
            if(posicion == 1){
                eliminarInicio();
            }
            else{
                if(posicion==size()){
                    eliminarFinal();
                }else{
                    if(posicion > 0 && posicion < size()){
                    while(pos != posicion){
                        aux = aux.siguiente;
                        pos++;
                    }
                    aux.anterior.siguiente =aux.siguiente;
                    aux.siguiente.anterior = aux.anterior;
                    aux.siguiente = null;
                    aux.anterior =null;}
                }
                
            }            
            
        }
    }
    
    public int size(){
        int contador =0;
        NodoDoble aux = cabecera;
        if(! esVacia()){
             
        while( aux != null){
            aux = aux.siguiente ;
            contador ++;
        }
        }
        return contador;
    }
    
    
    
    public NodoDoble buscar(String ced){
        NodoDoble aux = cabecera;
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
    
    public NodoDoble get(int posicion){
        NodoDoble aux = cabecera;
        int contador=0;
        while(contador != posicion){
            aux = aux.siguiente;
            contador++;
        }
        return aux;
    }
    
    public void modificar(String ced, Cliente datoModificar){
        NodoDoble aux = buscar(ced);
        if(aux != null){
            aux.dato = datoModificar;
        }
    }
    
    public void print(){
        
       
       NodoDoble aux = cabecera;
        if(! esVacia()){
            while (aux != null){
                System.out.println("["+aux.dato+"]" );
                aux=aux.siguiente;
            }
        
        }else{
            System.out.println("La lista esta vacia");
        }
        
        
    }
    
    public String leer(){
        
       String a ="";
       NodoDoble aux1 = cabecera;
        if(! esVacia()){
            while (aux1 != null){
                a = a+ "["+aux1.dato+"]" +"\n" ;
                aux1=aux1.siguiente;
                
            }
        
        }else{
            System.out.println("La lista esta vacia");
        }
        
        return a;
    }
    
    
    
    
}
