package com.RecetasFinal.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.RecetasFinal.Entities.Ingrediente;
import com.RecetasFinal.Repositories.IngredienteRepository;
import com.RecetasFinal.Repositories.MultimediaRepository;

@Service
public class IngredienteService {

    @Autowired
    private IngredienteRepository ingredienteRepository;
    
    public Optional<Ingrediente> findById(Integer id){
    	return ingredienteRepository.findById(id);
    }
    
    public List<Ingrediente> findAll(){
    	return ingredienteRepository.findAll();
    }
}
