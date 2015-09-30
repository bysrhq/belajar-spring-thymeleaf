/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.bysrhq.belajar.domain;

/**
 *
 * @author bysrhq
 */
public class Row {
    private Variety variety;
    private Integer seedsPerCell;

    public Row() {
    }

    public Row(Variety variety, Integer seedsPerCell) {
        this.variety = variety;
        this.seedsPerCell = seedsPerCell;
    }
    
    public Variety getVariety() {
        return variety;
    }

    public void setVariety(Variety variety) {
        this.variety = variety;
    }

    public Integer getSeedsPerCell() {
        return seedsPerCell;
    }

    public void setSeedsPerCell(Integer seedsPerCell) {
        this.seedsPerCell = seedsPerCell;
    }
    
}
