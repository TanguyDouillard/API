package com.example.api.repository;

import com.example.api.entity.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface ReservationRepository extends JpaRepository<Reservation, Integer>{
}
