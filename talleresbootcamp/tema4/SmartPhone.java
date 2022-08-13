package Ejercicios.tema4;

public class SmartPhone extends SmartDevice{
    //1. Atributos
    protected String SistemaOperativo;
    protected Camara caracteristicas;


    //2. Cosntructores

    public SmartPhone() {}

    public SmartPhone(String protocoloConexion, String tipoDispositivo, String fabricante, String gama, String anioFabricacion, double tamanio, String compatibilidad, String sistemaOperativo, Camara caracteristicas) {
        super(protocoloConexion, tipoDispositivo, fabricante, gama, anioFabricacion, tamanio, compatibilidad);
        SistemaOperativo = sistemaOperativo;
        this.caracteristicas = caracteristicas;
    }

    //3. Metodos
    public void concetarCuentasCorreo(){System.out.println("Conectando al correoElectronico");  }

    public void descargarAplicaciones(){System.out.println("Descargando aplicación"); }

    public void conectarDispositivos(){
        System.out.println("Conectando dispositivo");
    }

    public void tomarFotos(){
        System.out.println("Tomando foto");
    }

    public void transferirArchivos(){System.out.println("Transfiriendo Archivo"); }
}
