package com.RecetasFinal.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.RecetasFinal.Entities.Usuario;
import com.RecetasFinal.Entities.Utilizado;

import java.util.List;

@Repository
public interface UtilizadoRepository extends JpaRepository<Utilizado, Integer> {
    //@Query("SELECT u FROM Utilizado u WHERE u.ingrediente.idIngrediente = :idIngrediente")
    //List<Utilizado> findByIngredienteId(@Param("idIngrediente") Long idIngrediente);
}

