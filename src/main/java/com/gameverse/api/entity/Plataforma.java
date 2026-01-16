package com.gameverse.api.entity;

import jakarta.persistence.*;

import java.util.List;

/**
 * @author Andrés Iglesias Camacho
 * @date 15.01.2026
 */
// Establecemos que la clase es una entidad con la etiqueta de JPA
// Determinamos que es una tabla de nuestra DB
@Entity
@Table(name="plataforma")
public class Plataforma {
    // Cuando creamos una entidad, necesitamos de al menos, una Primary Key

    // ========================== DESARROLLO ATRIBUTOS ==========================

    // Establecemos que el atributo va ha ser un ID
    // Establecemos que el atributo va ha ser autoincrementativo
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Establecemos que la columna "nombre" va ha ser nullable y unique
    @Column(unique = true,
            nullable = false)
    private String nombre;

    // Esto deriva en la Tabla Intermedia (TI2)
    private List<Juego> listJuegos;

    // ========================== DESARROLLO CONSTRUCTORES ==========================

    public Plataforma() { /* Constructor vacío */ }

    public Plataforma(String nombre) {
        this.nombre = nombre;
    }

    // ========================== DESARROLLO METODOS ==========================

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
