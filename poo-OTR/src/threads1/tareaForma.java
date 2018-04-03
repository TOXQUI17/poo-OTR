
package threads1;

public class tareaForma {
    
    public static void main (String args[]){
        
        Thread t1=new Thread(new Runnable(){  //contiene una implementacion del metodo run() de la Tread, pero es abstracta
            
        public void run(){
            System.out.println("yo soy un tred buenoo ");
        } //se cierra el metod run
        } //se cierra la interfa autonoma 
        );  //se cierra el constructor
        t1.start(); 
    }
    
}
