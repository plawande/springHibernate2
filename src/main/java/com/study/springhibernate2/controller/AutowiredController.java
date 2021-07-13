package com.study.springhibernate2.controller;

import com.study.springhibernate2.model.Animal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AutowiredController {

    /*@Autowired
    private Animal animal;*/  //Needs @Primary annotation on one of the beans or the beans need to have a qualifier which can be referred here.

    @Autowired
    @Qualifier("cat")
    private Animal animal;

    /**
     * To test the below remove the Dogolan bean itself. (Remove @Service annotation from Dogolan)
     */
    /*private Animal animal;

    @Autowired(required = false)  //(required = false) doesn't work for constructor injection as it's meant for mandatory beans
    public AutowiredController(@Qualifier("dog") Animal animal) {
        this.animal = animal;
    }*/

    /**
     * To test the below remove the Dogolan bean itself. (Remove @Service annotation from Dogolan)
     */
    /*private Animal animal;

    @Autowired(required = false)  //the app will go up but throw a NPE later when we hit the request
    public void setAnimal(@Qualifier("dog") Animal animal) {
        this.animal = animal;
    }*/

    @GetMapping("/v1/autowire")
    public String getCharacteristics() {
        return animal.getCharacteristics();
    }



    /*@Autowired
    private Animal catalan;  //the final fallback; autowired by name.

    @GetMapping("/v1/autowire")
    public String getCharacteristics() {
        return catalan.getCharacteristics();
    }*/
}
