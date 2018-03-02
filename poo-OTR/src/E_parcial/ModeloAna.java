
package E_parcial;

public class ModeloAna extends Trabajador implements PagoNomina{

    @Override
    public void PagarNomina() {
       float honorariosAna= 100*(250);
        
          System.out.println("Ana");
          System.out.println(honorariosAna);
    
    }
    
    
}
