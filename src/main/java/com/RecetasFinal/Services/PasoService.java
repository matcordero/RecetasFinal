package com.RecetasFinal.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.RecetasFinal.Repositories.PasoRepository;
import com.RecetasFinal.Repositories.RecetaRepository;

@Service
public class PasoService {

    @Autowired
    private PasoRepository pasoRepository;
}
