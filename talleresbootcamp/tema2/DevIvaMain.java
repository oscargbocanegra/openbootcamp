package Ejercicios.tema2;

public class DevIvaMain {

    public static void main(String[] args) {

        double precio = 1000;
        int iva = 16;

        System.out.println("El precio es de :" + precio + " mas el iva de " +iva+"%" + " Total a pagar: " + precioConIva(precio,iva));
    }
    private static double precioConIva(double precio, int iva) {
        double vlrIva = (precio * iva / 100);
        return (precio + vlrIva);
    }
}
