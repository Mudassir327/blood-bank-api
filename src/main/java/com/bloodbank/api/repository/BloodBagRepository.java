package com.bloodbank.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bloodbank.api.model.BloodBag;

@Repository
public interface BloodBagRepository extends JpaRepository<BloodBag, Long> {
}
