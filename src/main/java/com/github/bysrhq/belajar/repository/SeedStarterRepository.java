/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.bysrhq.belajar.repository;

import com.github.bysrhq.belajar.domain.Row;
import com.github.bysrhq.belajar.domain.SeedStarter;
import com.github.bysrhq.belajar.domain.Type;
import com.github.bysrhq.belajar.domain.Variety;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import org.springframework.stereotype.Repository;

/**
 *
 * @author bysrhq
 */
@Repository
public class SeedStarterRepository {
    
    public List<SeedStarter> findAll() {
        List<Row> rowOne = Arrays.asList(
                new Row(new Variety(1, "Apple"), 30),
                new Row(new Variety(2, "Orange"), 15),
                new Row(new Variety(3, "Mango"), 1)
        );
        
        List<Row> rowTwo = Arrays.asList(
                new Row(new Variety(2, "Orage"), 15),
                new Row(new Variety(3, "Mango"), 1),
                new Row(new Variety(4, "Durian"), 6)
        );
        
        return Arrays.asList(
                new SeedStarter(1, new Date(), true, Type.PLASTIC, rowOne),
                new SeedStarter(2, new Date(), false, Type.WOOD, rowTwo)
        );
    }
    
    public void add(SeedStarter seedStarter) {
        System.out.println(seedStarter.getId() + " == " + seedStarter.getType() + seedStarter.getDatePlanted() + " == " + seedStarter.getType());
        for (Row row : seedStarter.getRows()) {
            System.out.println("== " + row.getVariety().getName() + " == " + row.getSeedsPerCell() + " == ");
        }
    }
}
