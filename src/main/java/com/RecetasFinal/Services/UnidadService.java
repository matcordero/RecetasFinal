package com.RecetasFinal.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.RecetasFinal.Repositories.UnidadRepository;
import com.RecetasFinal.Repositories.UsuarioRepository;

@Service
public class UnidadService {

    @Autowired
    private UnidadRepository unidadRepository;
}
