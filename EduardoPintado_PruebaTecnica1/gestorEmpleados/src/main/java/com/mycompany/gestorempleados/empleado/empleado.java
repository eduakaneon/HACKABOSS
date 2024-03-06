package com.mycompany.gestorempleados.empleado;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class empleado implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String apellido;
    private String cargo;
    private double salario;
    private Date fechaInicio;
    private boolean activo; // atributo para el borrado lógico

    // Constructor con id
    public empleado(Long id, String nombre, String apellido, String cargo, double salario, Date fechaInicio, boolean activo) {
   
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cargo = cargo;
        this.salario = salario;
        this.fechaInicio = fechaInicio;
        this.activo = activo;
    }
    // Getters y Setters
public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    // Constructor sin el atributo id
    public empleado(String nombre, String apellido, String cargo, double salario, Date fechaInicio, boolean activo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cargo = cargo;
        this.salario = salario;
        this.fechaInicio = fechaInicio;
        this.activo = activo;
    }
    public empleado() {
    // Constructor sin parámetros
}

   
    // Método toString para representar el objeto como una cadena
    @Override
    public String toString() {
        return "Empleado{"
                + "nombre='" + nombre + '\''
                + ", apellido='" + apellido + '\''
                + ", cargo='" + cargo + '\''
                + ", salario=" + salario
                + ", fechaInicio=" + fechaInicio
                + ", activo=" + activo +
                '}';
    }
}
