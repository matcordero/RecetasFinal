package com.RecetasFinal.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.RecetasFinal.Entities.Usuario;
import com.RecetasFinal.Repositories.UsuarioRepository;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public Optional<Usuario> findUsuarioById(Integer id){
    	return usuarioRepository.findById(id);
    }
    
    public List<Usuario> findUsuarioByMail(String mail){
    	return usuarioRepository.findByMail(mail);
    }

    public List<Usuario> findall(){
    	return usuarioRepository.findAll();
    }
    
    public Usuario save(Usuario usuario) {
    	return usuarioRepository.save(usuario);
    }
    
}
