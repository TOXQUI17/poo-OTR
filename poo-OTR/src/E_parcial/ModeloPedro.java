
package E_parcial;

public class ModeloPedro extends Trabajador implements PagoNomina{

    @Override
    public void PagarNomina() {
         
        float honorariosPlanta= 20*(250);
        
          System.out.println("Pedro");
          System.out.println(honorariosPlanta);
    
}
}
