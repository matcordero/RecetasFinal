package com.RecetasFinal.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "fotos")
@Getter
@Setter
public class Foto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idfoto")
    private Integer id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "idReceta")
    @JsonIgnore
    private Receta receta;

    @Column(name = "urlFoto")
    private String urlFoto;

    @Column(name = "extension")
    private String extension;

	public Foto(Receta receta, String urlFoto, String extension) {
		super();
		this.receta = receta;
		this.urlFoto = urlFoto;
		this.extension = extension;
	}
    
    
}
