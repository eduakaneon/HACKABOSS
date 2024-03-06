package com.mycompany.gestorempleados.empleado;

import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-03-05T11:57:35", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(empleado.class)
public class empleado_ { 

    public static volatile SingularAttribute<empleado, Date> fechaInicio;
    public static volatile SingularAttribute<empleado, String> apellido;
    public static volatile SingularAttribute<empleado, Double> salario;
    public static volatile SingularAttribute<empleado, Long> id;
    public static volatile SingularAttribute<empleado, String> cargo;
    public static volatile SingularAttribute<empleado, String> nombre;

}