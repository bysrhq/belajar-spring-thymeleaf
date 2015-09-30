/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.bysrhq.belajar.service;

import com.github.bysrhq.belajar.domain.SeedStarter;
import com.github.bysrhq.belajar.repository.SeedStarterRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author bysrhq
 */
@Service
public class SeedStarterService {
    @Autowired
    private SeedStarterRepository seedStarterRepository;
    
    public List<SeedStarter> findAll() {
        return seedStarterRepository.findAll();
    }
    
    public void add(SeedStarter seedStarter) {
        seedStarterRepository.add(seedStarter);
    }
}
