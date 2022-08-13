package Ejercicios.tema3;

public class ConcatMain {

    public static void main(String[] args) {
        String [] nomres = {"Andalucía", "Aragón", "Asturias", "Cantabria", "Castilla y León", "Castilla La Mancha", "Cataluña"};
        funcionConcatena(nomres);
    }

    private static void funcionConcatena(String[] paises) {
        String comunidad = "";
        for (String pais: paises) {
            comunidad += " " + pais;
        }
        System.out.println("Las comunidades Autonomas del territorio español son: " + comunidad);
    }
}
