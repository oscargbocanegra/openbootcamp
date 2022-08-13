package Ejercicios.tema4;

public class SmartWatch extends SmartDevice{


    protected String color;
    protected String tipoSmartWatch; //Pulsera, reloj, fit, band
    protected boolean resistenteAgia;
    protected String tipoPantalla;
    protected String tipoResolucion;
    protected String tipoCorrea;

    //2. Constructores.

    public SmartWatch() {}

    public SmartWatch(String protocoloConexion, String tipoDispositivo, String fabricante, String gama, String anioFabricacion, double tamanio, String compatibilidad, String color, String tipoSmartWatch, boolean resistenteAgia, String tipoPantalla, String tipoResolucion, String tipoCorrea) {
        super(protocoloConexion, tipoDispositivo, fabricante, gama, anioFabricacion, tamanio, compatibilidad);
        this.color = color;
        this.tipoSmartWatch = tipoSmartWatch;
        this.resistenteAgia = resistenteAgia;
        this.tipoPantalla = tipoPantalla;
        this.tipoResolucion = tipoResolucion;
        this.tipoCorrea = tipoCorrea;
    }

    //3. Metodos
    public void activarAlarma(){System.out.println("Alarma activada"); }

    public void activarAlarmaFrecuenciaCardíaca(){
        System.out.println("Alarma cardiaca configurada");
    }

    public void activarControlSueño(){
        System.out.println("Alarma control sueño activada");
    }

    public void activarEventosCalendario(){
        System.out.println("Alarma Calendario activa");
    }

    public void activarIdentificadorLlamadas(){
        System.out.println("Identificador llamadas activo");
    }
}
