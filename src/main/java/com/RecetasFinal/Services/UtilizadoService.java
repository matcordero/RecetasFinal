package com.RecetasFinal.Services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.RecetasFinal.Entities.Utilizado;
import com.RecetasFinal.Repositories.UsuarioRepository;
import com.RecetasFinal.Repositories.UtilizadoRepository;

import java.util.List;

@Service 
public class UtilizadoService {

    @Autowired
    private UtilizadoRepository utilizadoRepository;

    /*public List<Utilizado> getUtilizadosByIngrediente(Long idIngrediente) {
        return utilizadoRepository.findByIngredienteId(idIngrediente);
    }*/
}
