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
@Table(name = "recetas")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Receta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idReceta")
    private int idReceta;

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "idUsuario")
    private Usuario usuario;


    @Column(name = "nombre")
    private String nombre;


    @Column(name = "descripcion")
    private String descripcion;


    @OneToOne
    @JoinColumn(name = "foto")
    private Foto foto;


    @Column(name = "porciones")
    private int porciones;


    @Column(name = "cantidadPersonas")
    private int cantidadPersonas;

    @ManyToOne
    @JoinColumn(name = "idTipo")
    private Tipo tipo;

    @OneToMany(mappedBy = "receta", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Foto> fotos= new ArrayList<>();

    @OneToMany(mappedBy = "receta", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Utilizado> utilizados = new ArrayList<>();

    @OneToMany(mappedBy = "receta", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Calificacion> calificaciones = new ArrayList<>();

    @OneToMany(mappedBy = "receta", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Paso> pasos = new ArrayList<>();
    
    
    public int getValoracionGeneral() {
    	if(calificaciones.size()==0) {
    		return 0;
    	}
    	else {
    		int valoracionTotal = calificaciones.stream().mapToInt(value -> getValoracionGeneral()).sum();
        	return valoracionTotal/calificaciones.size();
    	}
    }
    
    public void modificarIngrediente(Ingrediente ingrediente, int cantidad) {
    	Utilizado utilizado = utilizados.stream().filter(u -> u.isUtilizado(ingrediente)).findFirst().get();
    	int cantidadActual = utilizado.getCantidad();
    	float proporcion = cantidad/cantidadActual;
    	porciones = (int) Math.floor(porciones * proporcion);
    	for(Utilizado utilizadoNuevos: utilizados) {
    		utilizado.setCantidad((int) Math.ceil(utilizado.getCantidad()*proporcion));
    	}
    	//int resultado = (int) Math.ceil(entero * flotante);
    }
    
    
    public void getRecetaMitad() {
    	for(Utilizado utilizado: utilizados) {
    		utilizado.setCantidad(utilizado.getCantidad()/2);
    	}
    	porciones = porciones/2;
    	
    }
    
    public void getRecetaDoble() {
    	for(Utilizado utilizado: utilizados) {
    		utilizado.setCantidad(utilizado.getCantidad()*2);
    	}
    	porciones = porciones*2;
    }
    
    public void addCalificacion(Calificacion calificacion) {
    	calificaciones.add(calificacion);
    }
    
    public void addPaso(Paso paso) {
    	pasos.add(paso);
    }
    public void addFotos(Foto foto) {
    	fotos.add(foto);
    }
    public void addutilizados(Utilizado utilizado) {
    	utilizados.add(utilizado);
    }
    
    public String getNombreUsuario() {
    	return this.usuario.getNombre();
    }
    
    public boolean tieneIngrediente(Ingrediente ingrediente) {
    	return 0<utilizados.stream().filter(u -> u.getIngrediente() == ingrediente).count();
    }

	@Override
	public String toString() {
		return "Receta [idReceta=" + idReceta + ", usuario=" + usuario + ", nombre=" + nombre + ", descripcion="
				+ descripcion + ", foto=" + foto.getUrlFoto() + ", porciones=" + porciones + ", cantidadPersonas=" + cantidadPersonas
				+ ", tipo=" + tipo.getDescripcion() + "]";
	}
    
    
}
