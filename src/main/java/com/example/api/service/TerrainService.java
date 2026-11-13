package com.example.api.service;

import com.example.api.entity.Terrain;
import com.example.api.repository.TerrainRepository;
import org.springframework.stereotype.Service;

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
        return repository.findById(id).orElseThrow();
    }

    public List<Terrain> getAll() {
        return repository.findAll();
    }

    public Terrain update(Integer id, Terrain terrain) {
        terrain.setId(id);
        return repository.save(terrain);
    }

    public void delete(Integer id) {
        repository.deleteById(id);
    }
}
