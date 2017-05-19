/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;
import controlador.Cliente;
import controlador.Nodo;
import javax.swing.JOptionPane;
/**
 *
 * @author user
 */
public class ListasCirculares {
    private Nodo cabecera;
    public ListasCirculares(){
        this.cabecera=null;
    }
    public boolean esVacia(){
        if(cabecera==null){
            return true;
        }else{
            return false;
        }
    }
    public void insertarElementos(Cliente dato){
        Nodo nuevo=new Nodo(dato);
        if(esVacia()){
            cabecera=nuevo;
            cabecera.siguiente=cabecera;
        }else{
            nuevo.siguiente=cabecera.siguiente;
            cabecera.siguiente=nuevo;
        }
    }
    public void eliminar(String dato){
        Nodo aux=cabecera;
        if(cabecera.siguiente==cabecera && cabecera.dato.getNombres().equals(dato)){
             cabecera.siguiente=null;
             cabecera=null;
        }else{
            if(aux.dato.getNombres().equals(dato)){
                eliminarcabecera();
            }else{
                while(aux.siguiente!=cabecera){
                    if(aux.siguiente.dato.getNombres().equals(dato)){
                        Nodo eliminar=aux.siguiente;
                        aux.siguiente=aux.siguiente.siguiente;
                        eliminar.siguiente=null;
                        break;
                    }
                    aux=aux.siguiente;
                }
            }
        }
    }
     public void eliminarcabecera(){
        if(!esVacia()){
        Nodo aux=cabecera;
        while(aux.siguiente!=cabecera)
            aux=aux.siguiente;
            cabecera=cabecera.siguiente;
            aux.siguiente=cabecera;     
        }
        cabecera.siguiente=null;
        cabecera=null;
     }
    public void imprimir(){
        String texto="";
        if(!esVacia()){
            Nodo aux=cabecera;
            System.out.println(aux.getDato());
            while(aux.getSiguiente()!=cabecera){
                aux=aux.getSiguiente();
                System.out.println(aux.getDato());
            }
        }
    }
    public String presentar(){
        String texto="";
        if(!esVacia()){
        Nodo aux=cabecera;
        texto=aux.dato+"\n";
        System.out.println(texto+"\n");
        while(aux.siguiente!=cabecera){
            aux=aux.siguiente;
            texto+=aux.dato+"\n";
            System.out.println(texto+"\n");
        }
        }
        return texto;
        
    }
    public void buscar(String nombre){
       
       if(!esVacia()){
           Nodo aux=cabecera;
           if(aux.dato.getNombres().equals(nombre)){
                JOptionPane.showMessageDialog(null,"Los datos del elemento encontrado son: "+aux.dato.getNombres()+"  "+aux.dato.getApelldidos());
           }else{
           while(aux.siguiente!=cabecera){
               if(aux.siguiente.dato.getNombres().equals(nombre)){
                   JOptionPane.showMessageDialog(null,"Los datos del elemento encontrado son: "+aux.siguiente.dato.getNombres()+"  "+aux.siguiente.dato.getApelldidos());
                   break;
               }
               aux=aux.siguiente;
           }
          }    
        
        }
   }
     public void eliminarLista(){
        if(!esVacia()){
            cabecera.siguiente=null;
            cabecera=null;
        }
    }
    public void modificar(String nombre,String nuevonombre){
        if(!esVacia()){
            Nodo aux=cabecera;
            if(aux.dato.getNombres().equals(nombre)){
                aux.dato.setNombres(nuevonombre);
            }else{
                while(aux.siguiente!=cabecera){
                    if(aux.siguiente.dato.getNombres().equals(nombre)){
                        aux.dato.setNombres(nuevonombre);
                        break;
                    }
                    aux=aux.siguiente;
                }
            }
        }
    }
//    public void eliminarLista(){
//        if(!esVacia()){
//            cabecera.siguiente=null;
//            cabecera=null;
//        }
//    }
    public int size(){
          Nodo aux=cabecera;
            int cont=0;
        if(!esVacia()){
            cont++;
            while(aux.siguiente!=cabecera){
                cont++;
                aux=aux.siguiente;
            }
        }
        return cont;
    }
     public Nodo get(int posicion){
        Nodo aux = cabecera;
        int contador=0;
        while(contador != posicion){
            aux = aux.getSiguiente();
            contador++;
        }
        return aux;
    }
    
}
