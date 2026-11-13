package com.example.api.dto;

public record UtilisateurDTO(
    Integer id,
    String nom,
    String prenom,
    String mail,
    String password,
    String username
) {}
