**Gestor de Empleados**
Este proyecto es un gestor de empleados desarrollado en Java utilizando el framework de persistencia JPA (Java Persistence API). Permite gestionar empleados, realizar operaciones como agregar, listar, actualizar y buscar empleados por cargo.

**Supuestos**
-Se asume que el operador es conocedor de los ID de los empleados.
-Se asume que el proyecto utiliza una base de datos relacional para almacenar la información de los empleados.
-Los empleados tienen los siguientes atributos: ID, nombre, apellido, cargo, salario, fecha de inicio y estado de activo/inactivo.
-Se implementa el borrado lógico para los empleados, donde el estado de activo/inactivo se utiliza para determinar si un empleado ha sido eliminado.
-El proyecto utiliza el framework de persistencia JPA para mapear las entidades de la base de datos y realizar operaciones CRUD (Crear, Leer, Actualizar, Eliminar) sobre ellas.
-Se utiliza Maven como herramienta de gestión de dependencias y construcción del proyecto.

**Funcionalidades**

1. Agregar nuevo empleado
Permite agregar un nuevo empleado con sus respectivos datos como nombre, apellido, cargo, salario y fecha de inicio.

2. Listar empleados
Muestra una lista de todos los empleados activos en la base de datos.

3. Actualizar información de empleado
Permite actualizar la información de un empleado existente, como su nombre, apellido, cargo, salario y fecha de inicio.

4. Eliminar empleado
Realiza un borrado lógico de un empleado, cambiando su estado a inactivo en lugar de eliminarlo físicamente de la base de datos.

5. Buscar empleados por cargo
Permite buscar empleados en la base de datos filtrando por el cargo especificado.

**Estructura del Proyecto**
El proyecto está estructurado en tres paquetes principales:

com.mycompany.gestorempleados: Contiene la clase principal GestorEmpleados que inicia la aplicación y el menú de interacción con el usuario.
com.mycompany.gestorempleados.Controladora: Contiene la lógica de negocio de la aplicación, como la gestión de empleados.
com.mycompany.gestorempleados.controladoraPersistencia: Contiene la lógica de persistencia de la aplicación, utilizando JPA para interactuar con la base de datos.

**Añadidos**
-Interfaz ASCII
Se ha implementado una interfaz de usuario utilizando arte ASCII para mejorar la experiencia del usuario al interactuar con la aplicación. 
La interfaz presenta un menú interactivo que permite al usuario seleccionar las diferentes opciones disponibles.
El cual se ejecuta hasta que el usuario decide salir de el.

-Manejo de Excepciones
Se ha añadido un manejo robusto de excepciones para manejar posibles errores durante la ejecución de la aplicación.
Se utilizan excepciones específicas y mensajes de error descriptivos para proporcionar retroalimentación al usuario en caso de que ocurra algún problema durante la ejecución.

-Utilización de TypedQuery en el controlador JPA
Se ha incorporado el uso de TypedQuery en el controlador JPA (empleadoJpaController1) para definir consultas personalizadas directamente en el código Java. 
Esto amplía las capacidades de consulta de la aplicación y proporciona una forma más flexible de interactuar con la base de datos. (Implementado en Buscar por cargo)
