package ejercicioplantas;

public class Flor extends Planta {
    String colorDePetalos;
    int cantidadPromedioDePetalos;
    String colorDePistilo;
    String colorDeLosPetalos;
    String variedadDeFlor;
    String estacioQueFlorece;

    //    Construuctores
    public Flor() {
    }

    public Flor(String nombre, int alturaTallo, boolean tieneHojas, String climaIdeal,
                String colorDePetalos, int cantidadPromedioDePetalos, String colorDePistilo,
                String colorDeLosPetalos, String variedadDeFlor, String estacioQueFlorece) {
        super(nombre, alturaTallo, tieneHojas, climaIdeal);
        this.colorDePetalos = colorDePetalos;
        this.cantidadPromedioDePetalos = cantidadPromedioDePetalos;
        this.colorDePistilo = colorDePistilo;
        this.colorDeLosPetalos = colorDeLosPetalos;
        this.variedadDeFlor = variedadDeFlor;
        this.estacioQueFlorece = estacioQueFlorece;
    }

    public String getColorDePetalos() {
        return colorDePetalos;
    }

    //    GS
    public void setColorDePetalos(String colorDePetalos) {
        this.colorDePetalos = colorDePetalos;
    }

    public int getCantidadPromedioDePetalos() {
        return cantidadPromedioDePetalos;
    }

    public void setCantidadPromedioDePetalos(int cantidadPromedioDePetalos) {
        this.cantidadPromedioDePetalos = cantidadPromedioDePetalos;
    }

    public String getColorDePistilo() {
        return colorDePistilo;
    }

    public void setColorDePistilo(String colorDePistilo) {
        this.colorDePistilo = colorDePistilo;
    }

    public String getColorDeLosPetalos() {
        return colorDeLosPetalos;
    }

    public void setColorDeLosPetalos(String colorDeLosPetalos) {
        this.colorDeLosPetalos = colorDeLosPetalos;
    }

    public String getVariedadDeFlor() {
        return variedadDeFlor;
    }

    public void setVariedadDeFlor(String variedadDeFlor) {
        this.variedadDeFlor = variedadDeFlor;
    }

    public String getEstacioQueFlorece() {
        return estacioQueFlorece;
    }

    public void setEstacioQueFlorece(String estacioQueFlorece) {
        this.estacioQueFlorece = estacioQueFlorece;
    }

    @Override
    protected void mensaje() {
        System.out.print("Hola soy una flor");
        System.out.print("------------- English:  ");
        System.out.println("What's up? I'm a flower");

    }
}
