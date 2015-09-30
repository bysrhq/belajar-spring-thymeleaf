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
public enum Type {
    PLASTIC("Just Plastic"),
    WOOD("Just Wood");
    
    private String name;
    public static final Type[] ALL = {PLASTIC, WOOD};

    private Type() {
    }

    Type(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    
}
