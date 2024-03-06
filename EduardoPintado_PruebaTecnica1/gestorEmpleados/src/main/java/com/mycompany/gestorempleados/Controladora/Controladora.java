
package com.mycompany.gestorempleados.Controladora;

import com.mycompany.gestorempleados.empleado.empleado;
import com.mycompany.gestorempleados.persistencia.controladoraPersistencia;
import java.util.List;


public class Controladora {
controladoraPersistencia persis = new controladoraPersistencia();


    public void crearEmpleado(empleado emp) {
        persis.crearEmpleado(emp);
    }

    public List<empleado> listarEmpleados() {
        return persis.listarEmpleados();
    }

    public empleado obtenerEmpleadoPorId(Long id) {
        return persis.obtenerEmpleadoPorId(id);
    }

    public void actualizarEmpleado(empleado emp) {
        persis.actualizarEmpleado(emp);
    }

     public void eliminarEmpleado(empleado emp) {
        persis.eliminarEmpleado(emp);
    }

   public List<empleado> buscarEmpleadoPorCargo(String cargo) {
        return persis.buscarEmpleadoPorCargo(cargo);
    }
}
