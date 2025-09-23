package com.bloodbank.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bloodbank.api.model.Donor;

public interface DonorRepository extends JpaRepository<Donor, Long> {
}