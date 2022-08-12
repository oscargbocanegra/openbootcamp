package com.company;

import com.example.Coche;
import com.example.CocheElectrico;

import java.util.ArrayList;
import java.util.List;

public class ListMain {

    public static void main(String[] args) {

        List<String> nombres = new ArrayList<>();
        nombres.add("Nombres 1");
        nombres.add("Nombres 2");
        nombres.add("Nombres 3");

        System.out.println(nombres);

        for (String nombre : nombres);
    }

    List<CocheElectrico> coches = new ArrayList<>();


}
