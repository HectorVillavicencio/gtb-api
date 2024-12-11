package com.villancio.gtb_api.persistence.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "revisiones")
public class Revision {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idRevision;

    @Column(name = "iDPasiente")
    private int idPasiente;

    private String observacion;

    private int fc;

    private int presionAl;

    private int presionBa;

    private int sat;

    private int glu;


    @ManyToOne
    @JoinColumn(name = "iDPasiente", insertable = false, updatable = false)
    private Pasiente pasiente;

}
