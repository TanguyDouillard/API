package com.example.api.service;

import com.example.api.entity.Utilisateur;
import com.example.api.repository.UtilisateurRepository;
import org.springframework.stereotype.Service;
import com.example.api.exception.*;

import java.util.List;

@Service
public class UtilisateurService {

    private final UtilisateurRepository repository;

    public UtilisateurService(UtilisateurRepository repository){
        this.repository = repository;
    }

    public Utilisateur create(Utilisateur utilisateur) {
        utilisateur.setId(null);
        return repository.save(utilisateur);
    }

    public Utilisateur getById(Integer id){
        return repository.findById(id).orElseThrow(() -> new NotFoundException("Utilisateur introuvable"));
    }

    public List<Utilisateur> getAll() {
        return repository.findAll();
    }

    public Utilisateur update(Integer id, Utilisateur utilisateur) {
        if (!repository.existsById(id)) {
            throw new NotFoundException("Utilisateur introuvable avec l'id : " + id);
        }
        utilisateur.setId(id);
        return repository.save(utilisateur);
    }

    public void delete(Integer id) {
        if (!repository.existsById(id)) {
            throw new NotFoundException("Utilisateur introuvable avec l'id : " + id);
        }
        repository.deleteById(id);
    }
}
