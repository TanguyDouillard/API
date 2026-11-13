package com.example.api.service;

import com.example.api.entity.Terrain;
import com.example.api.repository.TerrainRepository;
import org.springframework.stereotype.Service;
import com.example.api.exception.*;

import java.util.List;

@Service
public class TerrainService {

    private final TerrainRepository repository;

    public TerrainService(TerrainRepository repository){
        this.repository = repository;
    }

    public Terrain create(Terrain terrain) {
        terrain.setId(null);
        return repository.save(terrain);
    }

    public Terrain getById(Integer id){
        return repository.findById(id).orElseThrow(() -> new NotFoundException("Terrain introuvable avec l'id : " + id));
    }

    public List<Terrain> getAll() {
        return repository.findAll();
    }

    public Terrain update(Integer id, Terrain terrain) {
        if (!repository.existsById(id)) {
            throw new NotFoundException("Utilisateur introuvable avec l'id : " + id);
        }
        terrain.setId(id);
        return repository.save(terrain);
    }

    public void delete(Integer id) {
        if (!repository.existsById(id)) {
            throw new NotFoundException("Utilisateur introuvable avec l'id : " + id);
        }
        repository.deleteById(id);
    }
}
