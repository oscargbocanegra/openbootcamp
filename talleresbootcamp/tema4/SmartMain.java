package Ejercicios.tema4;

public class SmartMain {

    public static void main(String[] args) {

        //Creando objetos Smart
        SmartDevice smarth = new SmartDevice();


        //Herencia
        SmartWatch smartWatch = new SmartWatch();
        smartWatch.fabricante = "Samsung";

        //Poliformismo
        SmartDevice dispositivo;
        dispositivo = new SmartPhone();
        dispositivo.actualizar();
        dispositivo = new SmartPhone();
        dispositivo.actualizar();


    }
}
