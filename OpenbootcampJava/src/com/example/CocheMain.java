package com.example;

public class CocheMain {
    public static void main(String[] args) {

        String coche = "alfa romeo";
        //Coche cocheObj = new Coche();

        Coche cocheObj2 = new CocheHibrido("rojo", "honda", "civic", 1430.45, 5.4,"WWS23");
        cocheObj2.acelerar(50);

        System.out.println(cocheObj2);

        CocheElectrico cocheElectrico = new CocheElectrico();

        cocheElectrico.motorElectrico = "Electrico";
        cocheElectrico.color = "Gris";
        cocheElectrico.fabricante = "Renault";
        cocheElectrico.modelo ="Logan";
        System.out.println(cocheElectrico);

        CocheElectrico cocheElectrico2 = new CocheElectrico("Azul","Kia","Sportage",1540d ,4.99 ,"TXZ");
        System.out.println(cocheElectrico2);
        cocheElectrico2.acelerar(50);
        System.out.println(cocheElectrico2);



    }
}
