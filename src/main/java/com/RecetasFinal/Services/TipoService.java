package com.RecetasFinal.Services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.RecetasFinal.Entities.Tipo;
import com.RecetasFinal.Repositories.TipoRepository;
import com.RecetasFinal.Repositories.UnidadRepository;

@Service
public class TipoService {

    @Autowired
    private TipoRepository tipoRepository;
    
    
    public Optional<Tipo> getTipobyId(Integer id){
    	return tipoRepository.findById(id);
    }
}
