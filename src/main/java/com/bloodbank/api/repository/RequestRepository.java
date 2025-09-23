package com.bloodbank.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bloodbank.api.model.Request;

@Repository
public interface RequestRepository extends JpaRepository<Request, Long> {
}