
package serializacion;


import java.io.*;

public class Serializar {
    public static void main (String[] args){
    
    
   Usuario u=new Usuario(20, "Pedro ");
   
   
   PersistenciaUsuario p=new PersistenciaUsuario();
   
   p.setU(u);
   
   p.guardar();
}
}
