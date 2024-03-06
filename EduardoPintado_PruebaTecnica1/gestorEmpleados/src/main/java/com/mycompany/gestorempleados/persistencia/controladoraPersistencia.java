
package com.mycompany.gestorempleados.persistencia;

import com.mycompany.gestorempleados.Controladora.empleadoJpaController1;
import com.mycompany.gestorempleados.empleado.empleado;
import java.util.List;
import java.util.stream.Collectors;


public class controladoraPersistencia {
   empleadoJpaController1 empJpa = new empleadoJpaController1();
   
    public void crearEmpleado(empleado emp) {
   empJpa.create(emp); 
    }

   public List<empleado> listarEmpleados() {
    // Filtramos los empleados que esten activos (no marcados como eliminados)
    return empJpa.findempleadoEntities()
                 .stream()
                 .filter(empleado -> empleado.isActivo())
                 .collect(Collectors.toList());
}

    public empleado obtenerEmpleadoPorId(Long id) {
        return empJpa.findempleado(id);
    }
  public void actualizarEmpleado(empleado emp) {
        try {
            empJpa.edit(emp);
        } catch (Exception ex) {
            ex.printStackTrace();
            // Aquí manejamos la excepción adecuadamente, por ejemplo, lanzando una excepción personalizada
        }
  }
   public void eliminarEmpleado(empleado emp) {
        emp.setActivo(false); // Establecemos el empleado como inactivo en lugar de eliminarlo físicamente
        actualizarEmpleado(emp); // Actualizamos el empleado en la base de datos
    }
     public List<empleado> buscarEmpleadoPorCargo(String cargo) {
        return empJpa.buscarPorCargo(cargo);
    }
}
  
