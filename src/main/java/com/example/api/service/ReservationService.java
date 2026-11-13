package com.example.api.service;

import com.example.api.entity.Reservation;
import com.example.api.repository.ReservationRepository;
import org.springframework.stereotype.Service;
import com.example.api.exception.*;

import java.util.List;

@Service
public class ReservationService {

    private final ReservationRepository repository;

    public ReservationService(ReservationRepository repository){
        this.repository = repository;
    }

    public Reservation create(Reservation reservation) {
        reservation.setId(null);
        return repository.save(reservation);
    }

    public Reservation getById(Integer id){
        return repository.findById(id).orElseThrow(() -> new NotFoundException("Terrain introuvable avec l'id : " + id));
    }

    public List<Reservation> getAll() {
        return repository.findAll();
    }

    public Reservation update(Integer id, Reservation reservation) {
        if (!repository.existsById(id)) {
            throw new NotFoundException("Utilisateur introuvable avec l'id : " + id);
        }
        reservation.setId(id);
        return repository.save(reservation);
    }

    public void delete(Integer id) {
        if (!repository.existsById(id)) {
            throw new NotFoundException("Utilisateur introuvable avec l'id : " + id);
        }
        repository.deleteById(id);
    }
}
