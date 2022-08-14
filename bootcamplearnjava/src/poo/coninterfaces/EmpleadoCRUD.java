package poo.coninterfaces;

import poo.sininterfaces.Empleado;

import java.util.List;

/**
 * Se declaran los metodos, no se implementan
 * Activa un cotrato dice lo que hay que hacer pero no lo hace
 */
public interface EmpleadoCRUD {

    void save(Empleado empleado);

    List<Empleado> findAll();

    void delete(Empleado empleado);
}
