package com.RecetasFinal.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "multimedia")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Multimedia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idContenido")
    private int idContenido;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "idPaso")
    private Paso paso;

    @Column(name = "tipo_contenido")
    private String tipoContenido;

    @Column(name = "extension")
    private String extension;

    @Column(name = "urlContenido")
    private String urlContenido;

}
