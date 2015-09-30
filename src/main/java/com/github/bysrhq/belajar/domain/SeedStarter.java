/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.bysrhq.belajar.domain;

import java.util.Date;
import java.util.List;

/**
 *
 * @author bysrhq
 */
public class SeedStarter {
    private Integer id;
    private Date datePlanted;
    private boolean covered;
    private Type type;
    private List<Row> rows;

    public SeedStarter() {
    }
    
    public SeedStarter(Integer id, Date datePlanted, boolean covered, Type type, List<Row> rows) {
        this.id = id;
        this.datePlanted = datePlanted;
        this.covered = covered;
        this.type = type;
        this.rows = rows;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDatePlanted() {
        return datePlanted;
    }

    public void setDatePlanted(Date datePlanted) {
        this.datePlanted = datePlanted;
    }

    public boolean isCovered() {
        return covered;
    }

    public void setCovered(boolean covered) {
        this.covered = covered;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public List<Row> getRows() {
        return rows;
    }

    public void setRows(List<Row> rows) {
        this.rows = rows;
    }
    
}
