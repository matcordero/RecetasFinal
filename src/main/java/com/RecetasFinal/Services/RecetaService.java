package com.RecetasFinal.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import com.RecetasFinal.Entities.*;
import com.RecetasFinal.Repositories.IngredienteRepository;
import com.RecetasFinal.Repositories.RecetaRepository;
import com.RecetasFinal.Repositories.TipoRepository;
import com.RecetasFinal.Repositories.UtilizadoRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class RecetaService {
    @Autowired
    private RecetaRepository recetaRepository;
    @Autowired
    private UtilizadoRepository utilizadoRepository;
    @Autowired
    private IngredienteRepository ingredienteRepository;


    /*public List<Receta> obtenerUltimasTresRecetas() {
        return recetaRepository.findTop3ByOrderByIdRecetaDesc();
    }*/
    
    public List<Receta> obtenerTodosRecetas(){
    	return recetaRepository.findAll();
    }
    
    public Receta save(Receta receta){
    	return recetaRepository.save(receta);
    }
    
    public Optional<Receta> findById(Integer id){
    	return recetaRepository.findById(id);
    }
    
    public List<Receta> obtenerRecetasbyNombre(String nombre){
    	return recetaRepository.findByNombre(nombre);
    }
    
    public List<Receta> obtenerRecetasByUsuario(Usuario usuario){
    	return recetaRepository.findByUsuario(usuario);
    }
    
    public Receta obtenerRecetaPorNombre(String nombre) {
        return recetaRepository.findByNombre(nombre).get(0);
    }

    public List<Receta> obtenerRecetasPorTipo(Tipo tipo) {
        return recetaRepository.findByTipo(tipo);
    }
    /*
    public List<Receta> getRecetasByIngrediente(String nombreIngrediente) {
        Long ingrediente = ingredienteRepository.findIdByNombre(nombreIngrediente);
        List<Utilizado> utilizados = utilizadoRepository.findByIngredienteId(ingrediente);
        List<Receta> recetas = new ArrayList<>();
        for (Utilizado utilizado : utilizados) {
            recetas.add(utilizado.getReceta());
        }
        return recetas;
    }*/

    /*public List<Receta> getRecetasByUsuario(int idUsuario) {
        return recetaRepository.findByUsuarioId(idUsuario);
    }*/






    }










