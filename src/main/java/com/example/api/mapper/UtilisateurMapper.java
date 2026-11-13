package com.example.api.mapper;

import com.example.api.dto.UtilisateurDTO;
import com.example.api.entity.Utilisateur;

public class UtilisateurMapper {

    public static UtilisateurDTO toDTO(Utilisateur utilisateur) {
        return new UtilisateurDTO(
                utilisateur.getId(),
                utilisateur.getNom(),
                utilisateur.getPrenom(),
                utilisateur.getMail(),
                utilisateur.getUsername()
        );
    }

    public static Utilisateur toEntity(UtilisateurDTO dto) {
        Utilisateur entity = new Utilisateur();
        entity.setId(dto.id());
        entity.setNom(dto.nom());
        entity.setPrenom(dto.prenom());
        entity.setMail(dto.mail());
        entity.setUsername(dto.username());
        return entity;
    }
}