package com.gameverse.api.entity;

import jakarta.persistence.*;

import java.util.List;

/**
 * @author Andrés Iglesias Camacho
 * @date 15.01.2026
 */
@Entity
@Table(name = "company")
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true,
            nullable = false)
    private String nombre;

    private List<Juego> listJuegos;

    public Company() {}

    public Company(String nombre) {
        this.nombre = nombre;
    }

    public Long getId() {
        return this.id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public List getlistJuegos() {
        return this.listJuegos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setListJuegos(Juego juego){
        this.listJuegos.add(juego);
    }
}
