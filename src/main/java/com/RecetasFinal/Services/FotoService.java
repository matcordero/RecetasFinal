package com.RecetasFinal.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.RecetasFinal.Entities.Foto;
import com.RecetasFinal.Repositories.FotoRepository;
import com.RecetasFinal.Repositories.IngredienteRepository;

@Service
public class FotoService {

    @Autowired
    private FotoRepository fotoRepository;
    
    public Foto save(Foto foto) {
    	return fotoRepository.save(foto);
    }
}
