/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.bysrhq.belajar.config.root;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 *
 * @author bysrhq
 */
@Configuration
@ComponentScan(basePackages = {"com.github.bysrhq.belajar"},
        excludeFilters = {
        @ComponentScan.Filter(type = FilterType.ANNOTATION, value = EnableWebMvc.class)})
public class RootConfig {
   
}
