package com.example;

public class PolimorfismoMain {
    public static void main(String[] args) {
        //Coche coche1 = new Coche();
        CocheElectrico coche2 = new CocheElectrico();
        CocheHibrido coche3 = new CocheHibrido();

        // Poliformismo
        Coche coche4 = new CocheElectrico();
        Coche coche5 = new CocheHibrido();

        if(coche4 instanceof CocheElectrico){
            System.out.println("Coche Electrico");
        }

        if(coche5 instanceof CocheHibrido){
            System.out.println("Coche Hibrido");
        }
    }
}
