package com.bloodbank.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bloodbank.api.model.Donor;
import com.bloodbank.api.repository.DonorRepository;

@RestController
@RequestMapping("/api/donors")
@CrossOrigin(origins = "http://localhost:3000")
public class DonorController {

    @Autowired
    private DonorRepository donorRepository;

    @PostMapping("/register")
    public Donor registerDonor(@RequestBody Donor donor) {
        return donorRepository.save(donor);
    }
}