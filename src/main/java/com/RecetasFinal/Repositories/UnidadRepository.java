package com.RecetasFinal.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.RecetasFinal.Entities.Unidad;
import com.RecetasFinal.Entities.Usuario;

@Repository
public interface UnidadRepository extends JpaRepository<Unidad, Integer> {
}
