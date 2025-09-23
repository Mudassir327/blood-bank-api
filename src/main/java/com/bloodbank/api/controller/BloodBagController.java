package com.bloodbank.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bloodbank.api.model.BloodBag;
import com.bloodbank.api.repository.BloodBagRepository;

@RestController
@RequestMapping("/api/inventory")
@CrossOrigin(origins = "http://localhost:3000")
public class BloodBagController {

    @Autowired
    private BloodBagRepository bloodBagRepository;

    @PostMapping("/add")
    public BloodBag addBloodBag(@RequestBody BloodBag bloodBag) {
        return bloodBagRepository.save(bloodBag);
    }

    @GetMapping
    public List<BloodBag> getAllBloodBags() {
        return bloodBagRepository.findAll();
    }
}