package com.example.api.service;

import com.example.api.entity.Coordonnées;
import com.example.api.repository.CoordonnéesRepository;
import org.springframework.stereotype.Service;
import com.example.api.exception.*;

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
        return repository.findById(id).orElseThrow(() -> new NotFoundException("Terrain introuvable avec l'id : " + id));
    }

    public List<Coordonnées> getAll() {
        return repository.findAll();
    }

    public Coordonnées update(Integer id, Coordonnées coordonnées) {
        if (!repository.existsById(id)) {
            throw new NotFoundException("Utilisateur introuvable avec l'id : " + id);
        }
        coordonnées.setId(id);
        return repository.save(coordonnées);
    }

    public void delete(Integer id) {
        if (!repository.existsById(id)) {
            throw new NotFoundException("Utilisateur introuvable avec l'id : " + id);
        }
        repository.deleteById(id);
    }

}
