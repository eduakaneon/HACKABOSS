package com.mycompany.gestorempleados;

import com.mycompany.gestorempleados.Controladora.Controladora;
import com.mycompany.gestorempleados.empleado.empleado;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class GestorEmpleados {

    private static final Controladora control = new Controladora();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        mostrarMenu();
    }

    private static void mostrarMenu() {
        boolean salir = false;
        while (!salir) {
            System.out.println("**********************");
            System.out.println(" MENÚ DE GESTIÓN DE EMPLEADOS ");
            System.out.println("**********************");
            System.out.println("1. Agregar nuevo empleado");
            System.out.println("2. Listar empleados");
            System.out.println("3. Actualizar información de empleado");
            System.out.println("4. Eliminar empleado");
            System.out.println("5. Buscar empleados por cargo");
            System.out.println("6. Salir");
            System.out.println("**********************");
            System.out.print("Seleccione una opcion: ");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea después de nextInt()

            switch (opcion) {
                case 1:
                    agregarEmpleado();
                    break;
                case 2:
                    listarEmpleados();
                    break;
                case 3:
                    actualizarEmpleado();
                    break;
                case 4:
                    eliminarEmpleado();
                    break;
                case 5:
                    buscarEmpleadosPorCargo();
                    break;
                case 6:
                    salir = true;
                    break;
                default:
                    System.out.println("Opcion no valida. Intente nuevamente.");
            }
        }
    }

    private static void agregarEmpleado() {
        System.out.println("Ingrese los datos del nuevo empleado:");
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Apellido: ");
        String apellido = scanner.nextLine();
        System.out.print("Cargo: ");
        String cargo = scanner.nextLine();
        System.out.print("Salario: ");
        double salario = scanner.nextDouble();
        scanner.nextLine(); // Consumir el salto de línea después de nextDouble()
        System.out.print("Fecha de inicio (formato: dd/MM/yyyy): ");
        String fechaInicioStr = scanner.nextLine();
        Date fechaInicio = null;
        try {
            fechaInicio = new SimpleDateFormat("dd/MM/yyyy").parse(fechaInicioStr);
        } catch (ParseException e) {
            System.out.println("Error al convertir la fecha. Formato incorrecto.");
            return;
        }

        empleado emp = new empleado(nombre, apellido, cargo, salario, fechaInicio, true);
        control.crearEmpleado(emp);
        System.out.println("Empleado agregado correctamente.");
    }

    private static void listarEmpleados() {
        List<empleado> empleados = control.listarEmpleados();

        if (empleados.isEmpty()) {
            System.out.println("No hay empleados registrados.");
        } else {
            System.out.println("Listado de empleados:");
            for (empleado emp : empleados) {
                System.out.println(emp);
            }
        }
    }

    private static void actualizarEmpleado() {
        System.out.println("Ingrese el ID del empleado a actualizar:");
        Long id = scanner.nextLong();
        scanner.nextLine(); // Consumir el salto de línea después de nextLong()

        // Obtener el empleado de la base de datos según el ID
        empleado emp = control.obtenerEmpleadoPorId(id);
        if (emp == null) {
            System.out.println("No se encontró ningún empleado con el ID proporcionado.");
            return;
        }

        // Solicitar y actualizar los datos del empleado
        System.out.println("Ingrese los nuevos datos del empleado:");
        System.out.print("Nuevo nombre (" + emp.getNombre() + "): ");
        String nombre = scanner.nextLine();
        if (!nombre.isEmpty()) {
            emp.setNombre(nombre);
        }

        System.out.print("Nuevo apellido (" + emp.getApellido() + "): ");
        String apellido = scanner.nextLine();
        if (!apellido.isEmpty()) {
            emp.setApellido(apellido);
        }

        System.out.print("Nuevo cargo (" + emp.getCargo() + "): ");
        String cargo = scanner.nextLine();
        if (!cargo.isEmpty()) {
            emp.setCargo(cargo);
        }

        System.out.print("Nuevo salario (" + emp.getSalario() + "): ");
        String salarioStr = scanner.nextLine();
        if (!salarioStr.isEmpty()) {
            try {
                double salario = Double.parseDouble(salarioStr);
                emp.setSalario(salario);
            } catch (NumberFormatException e) {
                System.out.println("Salario inválido. Se mantendrá el salario actual.");
            }
        }

        System.out.print("Nueva fecha de inicio (" + emp.getFechaInicio() + ", formato dd/MM/yyyy): ");
        String fechaInicioStr = scanner.nextLine();
        if (!fechaInicioStr.isEmpty()) {
            try {
                Date fechaInicio = new SimpleDateFormat("dd/MM/yyyy").parse(fechaInicioStr);
                emp.setFechaInicio(fechaInicio);
            } catch (ParseException e) {
                System.out.println("Fecha invalida. Se mantendrá la fecha actual de inicio.");
            }

            System.out.print("¿El empleado está activo? (Si/No, por defecto Si(No ingresar nada si es Si): ");
            String activoStr = scanner.nextLine();
            boolean activo = activoStr.equalsIgnoreCase("No") ? false : true;
            emp.setActivo(activo);
        }

        // Actualizar el empleado en la base de datos
        control.actualizarEmpleado(emp);
        System.out.println("Empleado actualizado correctamente.");
    }

    private static void eliminarEmpleado() {
        System.out.println("Ingrese el ID del empleado a eliminar:");
        Long id = scanner.nextLong();
        scanner.nextLine(); // Consumir el salto de línea después de nextLong()

        empleado emp = control.obtenerEmpleadoPorId(id);
        if (emp == null) {
            System.out.println("No se encontró ningún empleado con el ID proporcionado.");
        } else {
            control.eliminarEmpleado(emp);
            System.out.println("Empleado eliminado correctamente.");
        }
    }

    private static void buscarEmpleadosPorCargo() {
        System.out.print("Ingrese el cargo a buscar: ");
        String cargo = scanner.nextLine();
        List<empleado> empleados = control.buscarEmpleadoPorCargo(cargo);

        if (empleados.isEmpty()) {
            System.out.println("No se encontraron empleados con el cargo especificado.");
        } else {
            System.out.println("Empleados con el cargo '" + cargo + "':");
            for (empleado empleado : empleados) {
                System.out.println(empleado);
            }
        }
    }
}
