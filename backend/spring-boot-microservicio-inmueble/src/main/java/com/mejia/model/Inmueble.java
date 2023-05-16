package com.mejia.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "inmueble")
public class Inmueble {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="nombre",nullable = false,length = 150)
    private String nombre;

    @Column(name="direccion",nullable = false,length = 500)
    private String direccion;

    @Column(name="foto",nullable = true,length = 1200)
    private String picture;

    @Column(name="precio",nullable = false)
    private Double precio;

    @Column(name="fecha_creacion",nullable = false)
    private LocalDateTime fechaCreacion;


}
