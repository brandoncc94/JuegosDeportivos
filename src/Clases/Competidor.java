
package Clases;

public abstract class Competidor {
    private String pais;
    private char tipo;
    private char genero;
    private int alojamiento;
    private int entrenador;

    public Competidor(String pPais, char pTipo, char pGenero, int pAlojamiento, int pEntrenador) {
        this.pais = pPais;
        this.tipo = pTipo;
        this.genero = pGenero;
        this.alojamiento = pAlojamiento;
        this.entrenador = pEntrenador;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public int getAlojamiento() {
        return alojamiento;
    }

    public void setAlojamiento(int alojamiento) {
        this.alojamiento = alojamiento;
    }

    public int getEntrenador() {
        return entrenador;
    }

    public void setEntrenador(int entrenador) {
        this.entrenador = entrenador;
    }
    
    
}
