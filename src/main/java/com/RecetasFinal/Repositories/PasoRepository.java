package com.RecetasFinal.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.RecetasFinal.Entities.Paso;
import com.RecetasFinal.Entities.Receta;

@Repository
public interface PasoRepository extends JpaRepository<Paso, Integer> {
}
