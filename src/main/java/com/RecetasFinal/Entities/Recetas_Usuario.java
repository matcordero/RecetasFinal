package com.RecetasFinal.Entities;
import java.util.ArrayList;
import java.util.List;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Recetas_Usuarios")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Recetas_Usuario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;

    @ManyToOne
    @JoinColumn(name = "idReceta")
    private Receta receta;


    @ManyToOne
    @JoinColumn(name = "idUsuario")
    private Usuario usuario;
}
