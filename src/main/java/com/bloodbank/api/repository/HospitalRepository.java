package com.bloodbank.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bloodbank.api.model.Hospital;

@Repository
public interface HospitalRepository extends JpaRepository<Hospital, Long> {
}