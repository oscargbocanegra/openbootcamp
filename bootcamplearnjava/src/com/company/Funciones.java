package com.company;

public class Funciones {
    public static void main(String[] args) {
        holaMundo();
        holaMundo("Oscar");
        holaMundo("David");

    }

    /**
     * Funcion para crear
     */
    public static void holaMundo() {
        System.out.println("Hola Mundo");
        System.out.println("Hola Mundo");
    }

    private static void holaMundo(String name) {
        System.out.println("Hola " + name);
    }

    private static void holaMundo(int valor) {
        System.out.println("Hola " + valor);
    }

    private static int sum(int num1, int num2){
        return num1 + num2;
    }


}
