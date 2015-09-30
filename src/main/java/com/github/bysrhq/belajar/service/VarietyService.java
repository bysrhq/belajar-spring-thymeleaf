/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.bysrhq.belajar.service;

import com.github.bysrhq.belajar.domain.Variety;
import com.github.bysrhq.belajar.repository.VarietyRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author bysrhq
 */
@Service
public class VarietyService {
    @Autowired
    private VarietyRepository varietyRepository;
    
    public List<Variety> findAll() {
        return varietyRepository.findAll();
    }
    
    public Variety findById(int id) {
        return varietyRepository.findById(id);
    }
}
