/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.bysrhq.belajar.domain.formatter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.format.Formatter;

/**
 *
 * @author bysrhq
 */
public class DateFormatter implements Formatter<Date>{
    private MessageSource messageSource;

    public DateFormatter(MessageSource messageSource) {
        this.messageSource = messageSource;
    }
    
    public Date parse(final String text, final Locale locale) throws ParseException {
        SimpleDateFormat dateFormat = createDateFormat(locale);
        return dateFormat.parse(text);
    }

    public String print(final Date object, final Locale locale) {
        SimpleDateFormat dateFormat = createDateFormat(locale);
        return dateFormat.format(object);
    }
    
    private SimpleDateFormat createDateFormat(final Locale locale) {
        String format = messageSource.getMessage("date.format", null, locale);
        SimpleDateFormat dateFormat = new SimpleDateFormat(format);
        dateFormat.setLenient(false);

        return dateFormat;
    }
}
