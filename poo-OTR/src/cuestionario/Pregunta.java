//

package cuestionario;
import java.util.*;

/**
 *
 * @author T-102
 */
public class Pregunta {
    String titulo;
    ArrayList<Opcion> opciones;

    public Pregunta() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public ArrayList<Opcion> getOpciones() {
        return opciones;
    }

    public void setOpciones(ArrayList<Opcion> opciones) {
        this.opciones = opciones;
    }
}
