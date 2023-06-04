package com.RecetasFinal.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.RecetasFinal.Entities.Calificacion;

import java.util.List;
@Repository
public interface CalificacionRepository extends JpaRepository<Calificacion, Integer> {
    /*List<Calificacion> findByRecetaId(Long recetaId);
*/
}
