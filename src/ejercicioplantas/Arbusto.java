package ejercicioplantas;

public class Arbusto extends Planta {
    double anchoArbusto;
    boolean esDomestico;
    String variedadArbusto;
    String colorDeHojas;
    boolean sePodaONo;

    //    Constructores
    public Arbusto() {
    }

    public Arbusto(String nombre, int alturaTallo, boolean tieneHojas, String climaIdeal,
                   double anchoArbusto, boolean esDomestico, String variedadArbusto,
                   String colorDeHojas, boolean sePodaONo) {
        super(nombre, alturaTallo, tieneHojas, climaIdeal);
        this.anchoArbusto = anchoArbusto;
        this.esDomestico = esDomestico;
        this.variedadArbusto = variedadArbusto;
        this.colorDeHojas = colorDeHojas;
        this.sePodaONo = sePodaONo;
    }

    //    GS
    public double getAnchoArbusto() {
        return anchoArbusto;
    }

    public void setAnchoArbusto(double anchoArbusto) {
        this.anchoArbusto = anchoArbusto;
    }

    public boolean isEsDomestico() {
        return esDomestico;
    }

    public void setEsDomestico(boolean esDomestico) {
        this.esDomestico = esDomestico;
    }

    public String getVariedadArbusto() {
        return variedadArbusto;
    }

    public void setVariedadArbusto(String variedadArbusto) {
        this.variedadArbusto = variedadArbusto;
    }

    public String getColorDeHojas() {
        return colorDeHojas;
    }

    public void setColorDeHojas(String colorDeHojas) {
        this.colorDeHojas = colorDeHojas;
    }

    public boolean isSePodaONo() {
        return sePodaONo;
    }

    public void setSePodaONo(boolean sePodaONo) {
        this.sePodaONo = sePodaONo;
    }

    @Override
    protected void mensaje() {
        System.out.print("Hola soy un arbusto");
        System.out.print("----------- English:  ");
        System.out.println("Hello! I'm a bush!");

    }
}
