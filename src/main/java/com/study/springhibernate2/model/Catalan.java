package com.study.springhibernate2.model;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
//@Primary
@Qualifier("cat")
public class Catalan implements Animal {
    @Override
    public String getCharacteristics() {
        return "meow!";
    }
}
