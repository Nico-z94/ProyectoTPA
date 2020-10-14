package com.example.alumno.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.envers.Audited;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="alumno")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Audited
public class Alumno extends Base{

    @Column(name="nombre")
    private String nombre;

    @Column(name="apellido")
    private String apellido;

    @Column(name="email")
    private String email;

    @Temporal(TemporalType.TIMESTAMP)
    private Date createAt;
}
