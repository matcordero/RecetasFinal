package com.RecetasFinal.Entities;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "pasos")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Paso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idPaso")
    private int idPaso;

    @ManyToOne
    @JoinColumn(name = "idReceta")
    @JsonIgnore
    private Receta receta;

    @Column(name = "nroPaso")
    private int nroPaso;

    @Column(name = "texto", length = 2000)
    private String texto;
    
    @OneToMany(mappedBy = "paso", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Multimedia> multimedias = new ArrayList<>();
    
    public void addMultimedia(Multimedia multimedia) {
    	multimedias.add(multimedia);
    }
}
