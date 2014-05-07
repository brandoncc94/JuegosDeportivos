



















//hola
package Clases;

public class Alojamiento {
    
    private String nombre;
    private String direccion;
    private String descripcion;

    public Alojamiento(String pNombre, String pDireccion, String pDescripcion) {
        this.nombre = pNombre;
        this.direccion = pDireccion;
        this.descripcion = pDescripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDirecion() {
        return direccion;
    }

    public void setDirecion(String direcion) {
        this.direccion = direcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
}
