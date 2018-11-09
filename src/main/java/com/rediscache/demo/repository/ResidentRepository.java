package com.rediscache.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rediscache.demo.domain.Resident;

@Repository
public interface ResidentRepository extends JpaRepository<Resident, Long> {

}
