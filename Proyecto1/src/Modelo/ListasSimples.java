/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import controlador.Cliente;
import javax.swing.JOptionPane;
import controlador.Nodo;
/**
 *
 * @author Usuario
 */
public class ListasSimples {
    private Nodo nodo;
    public ListasSimples(){
        this.nodo=null;
    }
    public boolean esVacia(){
        if(nodo==null){
            return true;
        }else{
            return false;
        }
    }
    public void insertar(Cliente dato){
        Nodo nuevo=new Nodo(dato);
        if(esVacia()){
            nodo=nuevo;
        }else{
            Nodo aux=nodo;
            while(aux.getSiguiente()!=null){
                aux=aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
        }
    }
    public void insertaInicio(Cliente dato){
        if(!esVacia()){
            Nodo nuevo=new Nodo(dato);
            nuevo.setSiguiente(nodo);
            nodo=nuevo;
            
        }
    }
     public void eliminarlista(){
        if(!esVacia()){
            nodo.setSiguiente(null);
            nodo=null;
        }
    }
    public String presentar(){
        String texto="";
        Nodo aux=nodo;
        while(aux!=null){
            texto +=aux.getDato()+"\n";
            System.out.println(texto+"\n");
            aux=aux.getSiguiente();
        }
        return texto;
    }
    public void pantalla(){
        Nodo aux=nodo;
        while(aux!=null){
            System.out.println(aux.getDato());
            aux=aux.getSiguiente();
        }
    } 
    public void eliminarInicio(){
        if(!esVacia()){
            nodo=nodo.getSiguiente();
        }
    }
    public void insertaFin(Cliente dato){
        if(!esVacia()){
            Nodo nuevo=new Nodo(dato);
            Nodo aux=nodo;
            while(aux.getSiguiente()!= null){
                aux=aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
            nuevo.setSiguiente(null);
        }
    }
    public void eliminaFin(){
        if(!esVacia()){
            Nodo aux=nodo;
            while(aux.getSiguiente().getSiguiente()!=null){
                aux=aux.getSiguiente();
            }
            aux.setSiguiente(null);
        }
    }
    public int size(){
        Nodo aux=nodo;
        int cont=0;
        if(!esVacia()){
            cont++;
            while(aux.siguiente!=null){
                cont++;
                aux=aux.siguiente;
        }
        
        
        }
        return cont;
    }
    public void insertaEntreNodos(Cliente dato,int pos){
        if(!esVacia()){
            Nodo nuevo=new Nodo(dato);
            Nodo aux=nodo;
            Nodo aux2=aux;
            int pos_recorrido=0;
            if(pos==0){
                insertaInicio(dato);
            }
            if(pos==size()){
            insertaFin(dato);
        }
        if(pos>0 && pos<size()){
            while(pos_recorrido != pos ){
                aux2=aux;
                aux=aux.getSiguiente();    
                pos_recorrido++;
            }
           nuevo.setSiguiente(aux);
           aux2.setSiguiente(nuevo);
        }
        }
    }
    public void eliminarEntreNodos(int pos){
        if(!esVacia()){
            Nodo aux=nodo;
            Nodo aux2=aux;
            int pos_recorrido=0;
            if(pos==0){
                eliminarInicio();
            }else if(pos==size()){
                eliminaFin();
            }else if(pos>0 && pos<size()){
                while(pos_recorrido!=pos){
                    aux2=aux;
                    aux=aux.getSiguiente();
                    pos_recorrido++;
                }
                aux2.setSiguiente(aux.getSiguiente());
            }
        }
    }
    public void buscar(int pos){
        Nodo aux=nodo;
        int recorrido=0;
        if(!esVacia()){
            if(pos==0){
                JOptionPane.showMessageDialog(null,"El valor de la Posicion es "+pos+" y los datos son: "+aux.dato);
            }else {
                if (pos == size()) {
                    while (aux != null) {                        
                        aux = aux.siguiente;
                    }
                    JOptionPane.showMessageDialog(null, "EL VALOR DE LA POSICION " + pos + " ES:" + aux.dato);
                } else {
                    if (pos > 0 & pos < size()) {
                        while (recorrido != (pos - 1)) {
                            aux = aux.getSiguiente();
                            recorrido++;
                        }
                        JOptionPane.showMessageDialog(null, "EL VALOR DE LA POSICION " + pos + " ES:" + aux.siguiente.dato);
                        aux.siguiente = aux.siguiente.siguiente;

                    }
                }
            }
        }
        
        
        
    }
    
    public Nodo buscarNodoIndice(int indice){
		Nodo aux = nodo;
		int tamano = 0;
	    while(aux!= null){
	    	if(tamano==indice)
	    		return aux;
	    	aux = aux.siguiente;
	    	tamano++;
	    }
		return null;
	}
    public Nodo get(int posicion){
        Nodo aux = nodo;
        int contador=0;
        while(contador != posicion){
            aux = aux.getSiguiente();
            contador++;
        }
        return aux;
    }
    public void midificar(int pos, Cliente nuevodato){
        if(!esVacia()){
            Nodo aux=nodo;
            int pos_recorrido=0;
            while(pos_recorrido!=pos){
                aux=aux.siguiente;
                pos_recorrido++;
            }
            aux.dato=nuevodato;
        }
    }
    
}
