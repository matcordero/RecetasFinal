package com.RecetasFinal.Repositories;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.RecetasFinal.Entities.Ingrediente;
import com.RecetasFinal.Entities.Receta;
import com.RecetasFinal.Entities.Tipo;
import com.RecetasFinal.Entities.Usuario;

import java.util.List;

@Repository
public interface RecetaRepository extends JpaRepository<Receta, Integer> {
	/*
	@Query("SELECT r FROM Usuario u JOIN u.recetas r WHERE r.idReceta IN "
            + "(SELECT r2.idReceta FROM Receta r2 WHERE r2.usuario.idUsuario = u.idUsuario ORDER BY r2.idReceta DESC LIMIT 3)")
	List<Receta> findTop3RecetasByUsuario();
	*/
    //List<Receta> findTop3ByOrderByIdRecetaDesc();
    
    /*@Query("SELECT r FROM Usuario u JOIN u.recetas r WHERE r.idReceta IN "
            + "(SELECT r2.idReceta FROM Receta r2 WHERE r2.usuario.idUsuario = u.idUsuario ORDER BY r2.idReceta DESC LIMIT 3)")
    List<Receta> findTop3RecetasByUsuario();*/
    
    List<Receta> findByNombre(String nombre);
    List<Receta> findByTipo(Tipo tipo);
    List<Receta> findByUsuario(Usuario usuario);
    
    //List<Receta> findByUsuarioId(int idUsuario);


}
