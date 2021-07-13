package com.study.springhibernate2.model;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("dog")
public class Dogolan implements Animal {
    @Override
    public String getCharacteristics() {
        return "bow!";
    }
}
