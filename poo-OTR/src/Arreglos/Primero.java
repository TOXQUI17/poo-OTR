
package Arreglos;

public class Primero {
    public static void main(String[] args) {
        // Arreglo no mutable
        
        int x[]={5,-2,6};
        //  int []y={5,-2,6};
        // para obtener el valor con:
        System.out.println(x[0]);
         
// Propiedad para saber el tamaño
         System.out.println(x.length);      
// EXCEPCIO  ArrayIndexOutofBoundException
               
//vamos a iterar el arreglo con un ciclo for
   for(int i=0; i<x.length;i++){
    System.out.println(x[i]);
    
    //Lo mismo pero mejor
    for(int a:x){
        System.out.println(a);
    }
    
}
        
    }
   
}
