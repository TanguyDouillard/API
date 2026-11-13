package com.example.api.repository;

import com.example.api.entity.Terrain;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface TerrainRepository extends JpaRepository<Terrain, Integer> {
}
