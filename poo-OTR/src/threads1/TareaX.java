
package threads1;

/**
 * @author T-102
 * Primera corma de crear un thread heredando
 */ 
public class TareaX extends Thread{
    @Override
    public void run(){
        System.out.println("Soy un thread muy sencillito"+"Y me llamo  "+Thread.currentThread().getName());
    }
    
}
