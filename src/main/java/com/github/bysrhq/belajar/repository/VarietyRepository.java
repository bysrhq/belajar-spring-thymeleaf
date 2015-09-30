/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.bysrhq.belajar.repository;

import com.github.bysrhq.belajar.domain.Row;
import com.github.bysrhq.belajar.domain.Variety;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Repository;

/**
 *
 * @author bysrhq
 */
@Repository
public class VarietyRepository {
    
    public List<Variety> findAll() {
        return Arrays.asList(
            new Variety(1, "Apple"),
            new Variety(2, "Orange"),
            new Variety(3, "Mango"),
            new Variety(4, "Durian")
        );
    }
    
    public Variety findById(int id) {
        switch(id) {
            case 1 : return new Variety(1, "Apple");
            case 2 : return new Variety(2, "Orange");
            case 3 : return new Variety(3, "Mango");
            case 4 : return new Variety(4, "Durian");
                default: return null;
        }
    }
}
