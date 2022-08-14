package Ejercicios.tema5;

public class CocheCRUDImpl implements CocheCRUD{
    @Override
    public void save() {
        System.out.println("Metodo Save");
    }

    @Override
    public void findAll() {
        System.out.println("Metodo findAll");
    }

    @Override
    public void delete() {
        System.out.println("Metodo delete");
    }
}
