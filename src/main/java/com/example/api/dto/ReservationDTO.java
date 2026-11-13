package com.example.api.dto;

import com.example.api.entity.Terrain;
import com.example.api.entity.Utilisateur;

import java.time.LocalDateTime;

public record ReservationDTO(
        Integer id,
        Utilisateur utilisateur,
        Terrain terrain,
        Integer reservation,
        LocalDateTime dateDebut,
        LocalDateTime dateFin
) { }
