package com.RecetasFinal.Entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "conversiones")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Conversion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idConversion")
    private int id;

    @ManyToOne
    @JoinColumn(name = "idUnidadOrigen", referencedColumnName = "idUnidad")
    private Unidad unidadOrigen;

    @ManyToOne
    @JoinColumn(name = "idUnidadDestino", referencedColumnName = "idUnidad")
    private Unidad unidadDestino;

    @Column(name = "factorConversiones")
    private float factorConversion;


}
