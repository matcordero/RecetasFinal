package com.RecetasFinal.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.RecetasFinal.Entities.Sesion;
import com.RecetasFinal.Entities.Usuario;
@Repository
public interface SesionRepository extends JpaRepository<Sesion, String>{

}
