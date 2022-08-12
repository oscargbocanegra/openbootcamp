package com.example.interfaces;

import com.example.Coche;
import com.example.CocheElectrico;
import com.example.interfaces.CocheService;

public class CocheServiceSportImpl implements CocheService {


    @Override
    public Coche crearCocheDemo() {

        System.out.println("Creando coche de carreras");
        return new CocheElectrico();
    }

    @Override
    public void destruirCoche() {
        System.out.println("Destruyendo coche de carreras");
    }
}
