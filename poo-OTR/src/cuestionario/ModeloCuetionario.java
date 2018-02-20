
package cuestionario;
import java.util.*;

public class ModeloCuetionario {
    
    ArrayList<Pregunta> preguntas;
    
    
    public ModeloCuetionario(){
        preguntas=new ArrayList<>();
    }
    
    public void agregarPregunta(Pregunta p){
        preguntas.add(p);
        
    }
    
    public ArrayList<Pregunta> obtenerCuestionario(){
        return preguntas;
    }
    
}
