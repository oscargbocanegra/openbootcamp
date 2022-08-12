package com.company;

public class TryCatchMain {
    public static void main(String[] args) {

        System.out.println("Inicio");
        try {
            int result = 5 / 0;

        } catch (ArithmeticException e){
            e.printStackTrace();
        }finally {
            System.out.println("Cierre de recursos");
        }
        System.out.println("fin");
    }
}
