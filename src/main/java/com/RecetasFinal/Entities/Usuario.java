package com.RecetasFinal.Entities;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "usuarios")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idUsuario")
    private Integer idUsuario;

    @Column(name = "mail", unique = true)
    private String mail;

    @Column(name = "nickname", nullable = false)
    private String nickname;

    @Column(name = "habilitado", columnDefinition = "varchar(2) check (habilitado in ('Si', 'No'))")
    private String habilitado;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "avatar")
    private String avatar;

    @Column(name = "tipo_usuario", columnDefinition = "varchar(10) check (tipo_usuario in ('Alumno', 'Visitante'))")
    private String tipoUsuario;   
    
    @JsonIgnore
    @JsonManagedReference
    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Receta> RecetasCreadas = new ArrayList<>();
    
    
    @JsonIgnore
    @OneToOne(mappedBy = "usuario", cascade = CascadeType.ALL, orphanRemoval = true)
    private Sesion sesion;
    
    @JsonIgnore
    @JoinTable(name = "Recetas_Usuarios",
			joinColumns = { @JoinColumn(name = "idUsuario", nullable = false)} ,
			inverseJoinColumns = {@JoinColumn(name = "idReceta", nullable = false)})
	@ManyToMany(cascade = CascadeType.ALL)
    private List<Receta> RecetasIntentar = new ArrayList<>();
    
    public void addRecetaIntentar(Receta receta) {
    	RecetasIntentar.add(receta);
    }
    
    public void addRecetaCreada(Receta receta) {
    	RecetasCreadas.add(receta);
    }
}