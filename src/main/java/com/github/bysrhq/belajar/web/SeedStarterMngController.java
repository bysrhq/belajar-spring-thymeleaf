/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.bysrhq.belajar.web;

import com.github.bysrhq.belajar.domain.Row;
import com.github.bysrhq.belajar.domain.SeedStarter;
import com.github.bysrhq.belajar.domain.Type;
import com.github.bysrhq.belajar.domain.Variety;
import com.github.bysrhq.belajar.service.SeedStarterService;
import com.github.bysrhq.belajar.service.VarietyService;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

/**
 *
 * @author bysrhq
 */
@Controller
public class SeedStarterMngController {
    @Autowired
    private SeedStarterService seedStarterService;
    @Autowired
    private VarietyService varietyService;
    
    @ModelAttribute("allTypes")
    public List<Type> populateTypes() {
        
        return Arrays.asList(Type.ALL);
    }
    
    @ModelAttribute("allVarieties")
    public List<Variety> populateVarieties() {
        
        return varietyService.findAll();
    }
    
    @ModelAttribute("allSeedStarters")
    public List<SeedStarter> populateSeedStarters() {
        
        return seedStarterService.findAll();
    }
    
    @RequestMapping(value = "/seedstartermng")
    public String showSeedStarters(SeedStarter seedStarter) {
        seedStarter.setDatePlanted(Calendar.getInstance().getTime());
        
        return "seedstartermng";
    }
    
    @RequestMapping(value = "/seedstartermng", params = {"save"})
    public String saveSeedStarter(
            SeedStarter seedStarter,
            BindingResult errors,
            ModelMap model) {
        
        if (true)
            return "seedstartermng";
        
        seedStarterService.add(seedStarter);
        
        model.clear();
        
        return "redirect:/seedstartermng";
    }
    
    @RequestMapping(value = "/seedstartermng", params = {"addRow"})
    public String addRow(SeedStarter seedStarter, BindingResult bindingResult) {
        seedStarter.getRows().add(new Row());
        
        return "seedstartermng";
    }
    
    @RequestMapping(value = "/seedstartermng", params = {"removeRow"})
    public String removeRow(SeedStarter seedStarter, BindingResult bindingResult, HttpServletRequest request) {
        Integer rowId = Integer.valueOf(request.getParameter("removeRow"));
        seedStarter.getRows().remove(rowId.intValue());
        
        return "seedstartermng";
    }

}
