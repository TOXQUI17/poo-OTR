
package E_parcial;

public class AplicacionPagos {
    public static void main(String[] args){
      Trabajador trab[]=new Trabajador[3];
      
      
      trab[0]= new ModeloJuan();
      trab[1]= new ModeloPedro();
       trab[2]= new ModeloAna();
       
         ServicioTrabajadores s = new ServicioTrabajadores ();
      
       
         for(Trabajador a : trab){
            s.servicioPago ((PagoNomina)a);
        }
    }   
}
