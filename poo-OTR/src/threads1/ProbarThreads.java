/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threads1;

import java.time.LocalTime;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author T-102
 */


//Segunda forma de crear un thread h43


public class ProbarThreads implements Runnable{

   public static void main(String[] args){
       
       TareaX t1= new TareaX();
       TareaX t2= new TareaX();
       Runnable r=new ProbarThreads();
       Thread t3= new Thread(r);
       
       
       //2. Inicializarlo 
       
       t1.setName("Ruby");
       t1.start();
       t2.start();
       t3.start();
       //3.- en ejecucion lo de la JMV decide
       
       //4.- Pausa no lo vamos a poner aqui, en caso de que se haga algo que dure cierto tiempo
       
       //5.- Su muerte es cuando termina su proceso 
       
   }

    @Override
    public void run() {
//Hacer otra cosa

//para el sleep
while(true){

LocalTime tiempo = LocalTime.now();
  int hora= tiempo.getHour();
  int minuto = tiempo.getMinute();
  int segundo = tiempo.getSecond();
  
        System.out.println("La hora es "+hora+": "+minuto+":"+segundo);
        
    try {
        //Dormir el thread
        Thread.sleep(1000);
    } catch (InterruptedException ex) {
        Logger.getLogger(ProbarThreads.class.getName()).log(Level.SEVERE, null, ex);
    }
    }
    }
    
}
