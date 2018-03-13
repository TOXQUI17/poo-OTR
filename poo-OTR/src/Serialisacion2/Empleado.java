
package Serialisacion2;

public class Empleado {

    private String nombre;
    private String parerno;
    private String materno;
    private String sueldobase;
    private String departamento;

    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", parerno=" + parerno + ", materno=" + materno + ", sueldobase=" + sueldobase + ", departamento=" + departamento + '}';
        
        
    }

    public Empleado(String nombre, String parerno, String materno, String sueldobase, String departamento) {
        this.nombre = nombre;
        this.parerno = parerno;
        this.materno = materno;
        this.sueldobase = sueldobase;
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getParerno() {
        return parerno;
    }

    public void setParerno(String parerno) {
        this.parerno = parerno;
    }

    public String getMaterno() {
        return materno;
    }

    public void setMaterno(String materno) {
        this.materno = materno;
    }

    public String getSueldobase() {
        return sueldobase;
    }

    public void setSueldobase(String sueldobase) {
        this.sueldobase = sueldobase;
    }
    
}
