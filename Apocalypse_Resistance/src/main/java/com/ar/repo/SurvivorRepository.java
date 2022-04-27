package com.ar.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ar.entity.Survivor;

@Repository
public interface SurvivorRepository extends JpaRepository<Survivor, Integer> {

}
