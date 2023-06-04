package com.RecetasFinal.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.RecetasFinal.Entities.Ingrediente;

import java.util.List;

@Repository
public interface IngredienteRepository extends JpaRepository<Ingrediente, Integer> {
/*
    public interface IngredientesRepository extends JpaRepository<Ingrediente, Long> {
        @Query("SELECT idIngrediente FROM Ingrediente WHERE nombre = :nombre")
        Long findIdByNombre(@Param("nombre") String nombre);
    }


    @Query("select i.idIngrediente from Ingrediente i where i.nombre = :nombre")
    Long findIdByNombre(@Param("nombre") String nombre);
    */
}
