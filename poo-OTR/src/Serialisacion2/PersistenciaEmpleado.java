
package Serialisacion2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import serializacion.Usuario;

/**
 *
 * @author T-102
 */
public class PersistenciaEmpleado {
      
   //Usuario u;
    ArrayList<Empleado> empleados;
  
    public PersistenciaEmpleado(){
        empleados= new ArrayList<>();
    }

   public void guardar(Empleado e){
       
       //Para serializar el primer paso es generar el archivo fisico donde estara el
       //objeto tipo usuario      
       
       File file= new File ("empleados.yo");
       
       if (file.exists()){
           empleados= buscarTodos();
       }
        
//Despues lo abrimos para escribir sobre el
       try{      
       
       FileOutputStream fos=new FileOutputStream(file);
       
       ObjectOutputStream oos=new ObjectOutputStream(fos);
       //guardamos nuestro usuario
       
       empleados.add(e);
       
       oos.writeObject(empleados);
       //ponemos un mensajito
       
           System.out.println("Objeto guardsdo con exito!!");
   
       }catch(Exception e){
          System.out.println(e.getMessage());
       }
     
    }


    private static class ArrayList<T> {

        public ArrayList() {
        }
    }
    
    public ArrayList<Empleado> buscarTodos(){
        
        File file=new File ("empleados.yo");
        try{
            FileInputStream fis=new FileInputStream(file);
            ObjectInputStream ois=new ObjectInputStream(fis);
            empleados= (ArrayList<Empleado>) ois.readObject();
        }catch(Exception e){
            
        }
        return empleados;
        
    
}
}