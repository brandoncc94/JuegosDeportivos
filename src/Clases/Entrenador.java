
package Clases;

public class Entrenador {
    private String nombre;
    private String apellidoP;
    private String apellidoM;
    private int idEntrendor;
    
    public Entrenador(String pNombre, String pApelidoP, String pApellidoM, int pIdEntrenador)
    {
        this.nombre = pNombre;
        this.apellidoM = pApellidoM;
        this.apellidoP = pApelidoP;
        this.idEntrendor = pIdEntrenador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoP() {
        return apellidoP;
    }

    public void setApellidoP(String apellidoP) {
        this.apellidoP = apellidoP;
    }

    public String getApellidoM() {
        return apellidoM;
    }

    public void setApellidoM(String apellidoM) {
        this.apellidoM = apellidoM;
    }

    public int getIdEntrendor() {
        return idEntrendor;
    }

    public void setIdEntrendor(int idEntrendor) {
        this.idEntrendor = idEntrendor;
    }
    
}
