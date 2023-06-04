package com.RecetasFinal.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "utilizados")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Utilizado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idUtilizado")
    private int idUtilizado;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "idReceta")
    private Receta receta;

    @ManyToOne
    @JoinColumn(name = "idIngrediente")
    private Ingrediente ingrediente;

    @Column(name = "cantidad")
    private int cantidad;

    @ManyToOne
    @JoinColumn(name = "idUnidad")
    private Unidad unidad;

    @Column(name = "observaciones")
    private String observaciones;
    
    public boolean isUtilizado(Ingrediente ingrediente) {
    	return this.ingrediente == ingrediente;
    }
}