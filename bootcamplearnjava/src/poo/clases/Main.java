package poo.clases;

import poo.herencia.Camion;
import poo.herencia.Coche;
import poo.herencia.Motocicleta;

public class Main {

    public static void main(String[] args) {

        // 1. Clases y Objetos.

        // Clase identificador = new Clase();
        // Crear objeto utilizando el constructor vacio
        Vehiculo toyotaPrius = new Vehiculo();

        // Crear objeto utilizando el constructor con parametros
        Motor motorGTI = new Motor("GTI",190,459.0,6);

        Vehiculo fordMondeo = new Vehiculo("Ford","Mondeo",2.1,2010,false,0,motorGTI);
        fordMondeo.acelerar(50);

        //2.  Herencia
        Motocicleta kawasakiNinja = new Motocicleta();
        kawasakiNinja.fabricante = "Kawasaki";

        //3. Polimorfismo.
        Vehiculo vehiculo;

        vehiculo = new Motocicleta();
        vehiculo.acelerar(50);

        vehiculo = new Coche();
        vehiculo.acelerar(50);

        vehiculo = new Camion();
        vehiculo.acelerar(50);

        //4. Clases abstractas: no se pueden instanciar, solo instancias las clases hijas.


    }
}
