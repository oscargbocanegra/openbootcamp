package Ejercicios.tema4;

public class Camara {
    protected String resolucion;
    protected String camaraDual;
    protected String estabizacionOptica;
    protected String resolucionVideo;

    public Camara() {}

    public Camara(String resolucion, String camaraDual, String estabizacionOptica, String resolucionVideo) {
        this.resolucion = resolucion;
        this.camaraDual = camaraDual;
        this.estabizacionOptica = estabizacionOptica;
        this.resolucionVideo = resolucionVideo;
    }
}
