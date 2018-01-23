/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.otr;

public class PooOTR {

    public static void main(String[] args) {
    
        System.out.println("Hola mundo");
        
        // Tenemos que generar los objetos de las clases anteriores
        Usuario x=new Usuario();       
        x.setAltura(1.74f);
        x.setPeso(78f);
        
        Imc algo=new Imc();
        algo.u=x;
        
       //Calcular el IMC a traves de su objeto        
        System.out.println( algo.calcular());
                
           
        
   }     
}
