package ejercicioplantas;

public abstract class Planta {
    String nombre;
    int alturaTallo;
    boolean tieneHojas;
    String climaIdeal;

    protected abstract void mensaje();


//    Constructores
    public Planta() {
    }

    public Planta(String nombre, int alturaTallo, boolean tieneHojas, String climaIdeal) {
        this.nombre = nombre;
        this.alturaTallo = alturaTallo;
        this.tieneHojas = tieneHojas;
        this.climaIdeal = climaIdeal;
    }

    //    Getters & Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAlturaTallo() {
        return alturaTallo;
    }

    public void setAlturaTallo(int alturaTallo) {
        this.alturaTallo = alturaTallo;
    }

    public boolean isTieneHojas() {
        return tieneHojas;
    }

    public void setTieneHojas(boolean tieneHojas) {
        this.tieneHojas = tieneHojas;
    }

    public String getClimaIdeal() {
        return climaIdeal;
    }

    public void setClimaIdeal(String climaIdeal) {
        this.climaIdeal = climaIdeal;
    }
}
