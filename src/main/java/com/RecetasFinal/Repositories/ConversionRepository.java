package com.RecetasFinal.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.RecetasFinal.Entities.Conversion;
@Repository
public interface ConversionRepository extends JpaRepository<Conversion, Integer> {
}
