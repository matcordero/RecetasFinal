package com.RecetasFinal.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.RecetasFinal.Entities.Tipo;
import com.RecetasFinal.Entities.Unidad;

@Repository
public interface TipoRepository extends JpaRepository<Tipo, Integer> {
}
