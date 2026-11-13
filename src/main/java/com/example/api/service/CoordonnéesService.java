package com.example.api.service;

import com.example.api.entity.Coordonnées;
import com.example.api.repository.CoordonnéesRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CoordonnéesService {

    private final CoordonnéesRepository repository;

    public CoordonnéesService(CoordonnéesRepository repository){
        this.repository = repository;
    }

    public Coordonnées create(Coordonnées coordonnées) {
        coordonnées.setId(null);
        return repository.save(coordonnées);
    }

    public Coordonnées getById(Integer id){
        return repository.findById(id).orElseThrow();
    }

    public List<Coordonnées> getAll() {
        return repository.findAll();
    }

    public Coordonnées update(Integer id, Coordonnées coordonnées) {
        coordonnées.setId(id);
        return repository.save(coordonnées);
    }

    public void delete(Integer id) {
        repository.deleteById(id);
    }

}
