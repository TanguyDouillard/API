package com.example.api.service;

import com.example.api.entity.Reservation;
import com.example.api.repository.ReservationRepository;
import org.springframework.stereotype.Service;

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
        return repository.findById(id).orElseThrow();
    }

    public List<Reservation> getAll() {
        return repository.findAll();
    }

    public Reservation update(Integer id, Reservation reservation) {
        reservation.setId(id);
        return repository.save(reservation);
    }

    public void delete(Integer id) {
        repository.deleteById(id);
    }
}
