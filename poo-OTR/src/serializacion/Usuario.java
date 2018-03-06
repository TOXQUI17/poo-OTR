
package serializacion;

import java.io.*;

//interface pára comprimir o serializar objetos de esta clase
public class Usuario implements Serializable{
    
    int edad;
    String nombre;
    
    public Usuario(){
        
    }

    public int getEdad() {
        return edad;
    }

    public Usuario(int edad, String nombre) {
        this.edad = edad;
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
