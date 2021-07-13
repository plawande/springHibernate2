package com.study.springhibernate2.service;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class PrototypeService {

    private String dateTime = LocalDateTime.now().toString();

    public String getTime() {
        return dateTime;
    }
}
