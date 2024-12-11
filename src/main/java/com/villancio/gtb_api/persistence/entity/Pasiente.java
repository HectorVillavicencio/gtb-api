package com.villancio.gtb_api.persistence.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "pasientes")
public class Pasiente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idP;

    private String nombre;

    private int estatura;

    private float peso;

    private String barrio;

    private int edad;
}
