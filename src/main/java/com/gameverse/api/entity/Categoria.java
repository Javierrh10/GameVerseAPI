package com.gameverse.api.entity;

import jakarta.persistence.*;

import java.util.List;

/**
 * @author Andrés Iglesias Camacho
 * @date 15.01.2026
 */

@Entity
@Table(name="categoria")
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true,
            nullable = false)
    private String nombre;

    // Esto deriva en la Tabla Intermedia (TI1)
    private List<Juego> listJuegos;


    public Categoria(){}

    public Categoria(String nombre){
        this.nombre = nombre;
    }


    public Long getId() {
        return this.id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String name) {
        this.nombre = name;
    }

    public List<Juego> getListJuegos() {
        return this.listJuegos;
    }

    public void setListJuegos(Juego juego) {
        listJuegos.add(juego);
    }
}
