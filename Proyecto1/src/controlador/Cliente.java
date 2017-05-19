/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;



/**
 *
 * @author user
 */
public class Cliente {

    
    
    public String cedula;
    public String apelldidos;
    public String nombres;
    public String sexo;
    public String edad;

    public Cliente(String cedula, String apelldidos, String nombres, String sexo, String edad) {
        this.cedula = cedula;
        this.apelldidos = apelldidos;
        this.nombres = nombres;
        this.sexo = sexo;
        this.edad = edad;
    }

    Cliente() {
        
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getApelldidos() {
        return apelldidos;
    }

    public void setApelldidos(String apelldidos) {
        this.apelldidos = apelldidos;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }
    

   

    @Override
    public String toString() {
        return cedula +" "+apelldidos+" "+nombres+" "+sexo+" "+edad;
    }


    
    
    
}
