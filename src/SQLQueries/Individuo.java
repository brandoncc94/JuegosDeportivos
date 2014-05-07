
package SQLQueries;

import java.util.Date;

public class Individuo extends Competidor{
    private String nombre;
    private String apellidoP;
    private String apellidoM;
    private int idIndividuo;
    private Date fechaNac;
    private String ciudad;
    private String ocupacion;

    public Individuo(String nombre, String apellidoP, String apellidoM, int idIndividuo, char genero, 
            Date fechaNac, int alojamientoId, String ciudad, String ocupacion, String paisISO, int entrenadorId ) {
        super(paisISO,'I', genero, alojamientoId, entrenadorId);
        this.nombre = nombre;
        this.apellidoP = apellidoP;
        this.apellidoM = apellidoM;
        this.idIndividuo = idIndividuo;
        this.fechaNac = fechaNac;
        this.ciudad = ciudad;
        this.ocupacion = ocupacion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
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

    public int getIdIndividuo() {
        return idIndividuo;
    }

    public void setIdIndividuo(int idIndividuo) {
        this.idIndividuo = idIndividuo;
    }

    public Date getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }

}
