package com.study.springhibernate2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

@Service
public class SingletonService {

    //@Autowired
    //private PrototypeService prototypeService;  //this will convert the prototype into a singleton

    /*@Autowired
    private ApplicationContext applicationContext;*/

    public String getTime() {
        /*PrototypeService prototypeService = applicationContext.getBean(PrototypeService.class);*/
        PrototypeService prototypeService = getPrototypeService();
        return prototypeService.getTime();
    }

    @Lookup  //Spring uses proxy to override this method and it actually returns the PrototypeService.
    public PrototypeService getPrototypeService() {
        return null;
    }
}
