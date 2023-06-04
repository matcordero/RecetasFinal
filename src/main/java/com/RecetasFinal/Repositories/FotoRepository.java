package com.RecetasFinal.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.RecetasFinal.Entities.Foto;
@Repository
public interface FotoRepository extends JpaRepository<Foto, Integer> {
}
