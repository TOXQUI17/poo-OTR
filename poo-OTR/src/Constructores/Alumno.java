/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Constructores;

/**
 *
 * @author T-102
 */
public class Alumno {
    private String nombre;
    int edad;
    boolean aprobado;

    public boolean isAprobado() {
        return aprobado;
    }

    public void setAprobado(boolean aprobado) {
        this.aprobado = aprobado;
    }
    // ******************************************************************
   // public Alumno(){
    //    edad = 20;
    //}
    
    
    public Alumno(int x){
    
     }   
    // ******************************************************************
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
        
    }
}

