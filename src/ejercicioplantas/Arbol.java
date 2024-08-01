package ejercicioplantas;

public class Arbol extends Planta {
    String variedad;
    String tipoDeTronco;
    double radioDeTronco;
    String color;
    String tipoDeHojas;

    //    Constructores
    public Arbol() {
    }

    public Arbol(String nombre, int alturaTallo, boolean tieneHojas,
                 String climaIdeal, String variedad, String tipoDeTronco,
                 double radioDeTronco, String color, String tipoDeHojas) {
        super(nombre, alturaTallo, tieneHojas, climaIdeal);
        this.variedad = variedad;
        this.tipoDeTronco = tipoDeTronco;
        this.radioDeTronco = radioDeTronco;
        this.color = color;
        this.tipoDeHojas = tipoDeHojas;
    }

    public String getVariedad() {
        return variedad;
    }

    // GS
    public void setVariedad(String variedad) {
        this.variedad = variedad;
    }

    public String getTipoDeTronco() {
        return tipoDeTronco;
    }

    public void setTipoDeTronco(String tipoDeTronco) {
        this.tipoDeTronco = tipoDeTronco;
    }

    public double getRadioDeTronco() {
        return radioDeTronco;
    }

    public void setRadioDeTronco(double radioDeTronco) {
        this.radioDeTronco = radioDeTronco;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipoDeHojas() {
        return tipoDeHojas;
    }

    public void setTipoDeHojas(String tipoDeHojas) {
        this.tipoDeHojas = tipoDeHojas;
    }

    @Override
    protected void mensaje() {
        System.out.print("Hola soy un arbol");
        System.out.print("------------- English:  ");
        System.out.println("Hello, I'm  a tree!");
    }
}
