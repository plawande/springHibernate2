package com.study.springhibernate2.controller;

import com.study.springhibernate2.entity.City;
import com.study.springhibernate2.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class CityController {
    @Autowired
    private CityService cityService;

    @PostMapping("/cities")
    public ResponseEntity<City> saveCity(@RequestBody City city){
      return new ResponseEntity<>(cityService.saveCity(city), HttpStatus.CREATED);
    }

    @GetMapping("/cities/{id}")
    public ResponseEntity<City> getCityById(@PathVariable(name = "id") Integer id){
      return new ResponseEntity<>(cityService.getCityById(id), HttpStatus.OK);
    }
}
