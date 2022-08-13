package Ejercicios.tema4;

public class SmartDevice {
    //1. Atributos
    protected String protocoloConexion; //Bluetooth, NFC, Wi-Fi, 3G, X10, etc
    protected String tipoDispositivo;
    protected String fabricante;
    protected String gama;
    protected String anioFabricacion;
    protected double tamanio;
    protected String compatibilidad; //Alexa, Google, siri

    //2. Constructores
    public SmartDevice() {}

    public SmartDevice(String protocoloConexion, String tipoDispositivo, String fabricante, String gama, String anioFabricacion, double tamanio, String compatibilidad) {
        this.protocoloConexion = protocoloConexion;
        this.tipoDispositivo = tipoDispositivo;
        this.fabricante = fabricante;
        this.gama = gama;
        this.anioFabricacion = anioFabricacion;
        this.tamanio = tamanio;
        this.compatibilidad = compatibilidad;
    }


    //3. Metodos
    public void actualizar(){
        System.out.println("Actualizando dispositivo");
    }

}
