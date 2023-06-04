package com.RecetasFinal.Services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.RecetasFinal.Entities.Sesion;
import com.RecetasFinal.Repositories.SesionRepository;

@Service
public class SesionService {
	@Autowired
    private SesionRepository sesionRepository;

    public Optional<Sesion> findSesionByMail(String mail){
    	return sesionRepository.findById(mail);
    }
    
    public void modificarSesion(Sesion sesion) {
    	sesionRepository.save(sesion);
    }
}
