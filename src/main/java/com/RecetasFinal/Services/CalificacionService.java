package com.RecetasFinal.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.RecetasFinal.Entities.Calificacion;
import com.RecetasFinal.Repositories.CalificacionRepository;
import com.RecetasFinal.Repositories.ConversionRepository;

import java.util.List;

@Service
public class CalificacionService {
    @Autowired
    private CalificacionRepository calificacionRepository;

    public Calificacion save(Calificacion calificacion) {
    	return calificacionRepository.save(calificacion);
    }
}
