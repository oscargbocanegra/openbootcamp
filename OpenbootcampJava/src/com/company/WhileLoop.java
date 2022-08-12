package com.company;

public class WhileLoop {
    public static void main(String[] args) {
        boolean check = true;

        int count =0;
        while (count <= 10){
            count++;
            if(count == 6)
                break; // rommpe el flujo de ejecucion
                //continue;  // Salta el valor 6 y continua a la siguiente iteracion
            System.out.println("Hola Mundo con while " + count);

        }
        System.out.println("Fin del ciclo While");
    }
}
