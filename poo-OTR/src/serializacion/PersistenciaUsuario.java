
package serializacion;
import java.io.*;
public class PersistenciaUsuario {
    
    //relacion moderada por atributo
    
   Usuario u;
   
   
    public Usuario getU() {
        return u;
    }

    public void setU(Usuario u) {
        this.u = u;
    }
   //generamos el metodo para serializar a nuestro usuario

   public void guardar(){
       
       //Para serializar el primer paso es generar el archivo fisico donde estara el
       //objeto tipo usuario      
       
       File file= new File ("archivaldo.yoyo");
        
//Despues lo abrimos para escribir sobre el
       try{      
       
       FileOutputStream fos=new FileOutputStream(file);
       
       ObjectOutputStream oos=new ObjectOutputStream(fos);
       //guardamos nuestro usuario
       oos.writeObject(u);
       //ponemos un mensajito
       
           System.out.println("Objeto guardsdo con exito!!");
   
       }catch(Exception e){
           System.out.println(e.getMessage());
       }
          //public void setU(Usuario u) {
         // this.u = u;
    }
public Usuario recobrarUsuario(){
       File file=new File("archivaldo.yoyo");
       Usuario recobrado=null; 
      
       try{
       FileInputStream fis=new FileInputStream(file);
       ObjectInputStream ois =new ObjectInputStream(fis);
             
       recobrado= {Usuario} ois.readObject();
       
   }catch(Exception e){
       
   }
return recobrado;
}



   
   


   
    
    

