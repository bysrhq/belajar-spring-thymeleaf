/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.bysrhq.belajar.domain.formatter;

import com.github.bysrhq.belajar.domain.Variety;
import com.github.bysrhq.belajar.service.VarietyService;
import java.text.ParseException;
import java.util.Locale;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.Formatter;

/**
 *
 * @author bysrhq
 */
public class VarietyFormatter implements Formatter<Variety> {
    @Autowired
    private VarietyService varietyService;
    
    public String print(Variety object, Locale locale) {
        return object != null ? object.getId().toString(): "";
    }

    public Variety parse(String text, Locale locale) throws ParseException {
        Integer id = Integer.valueOf(text);
        
        return varietyService.findById(id);
    }
    
}
