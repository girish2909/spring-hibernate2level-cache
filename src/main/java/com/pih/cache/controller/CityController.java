package com.pih.cache.controller;

import com.pih.cache.entity.City;
import com.pih.cache.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class CityController {

    @Autowired
    private CityService cityService;

    @GetMapping("/cities/{id}")
    public ResponseEntity<City> getCityById(@PathVariable(name="id") Integer id){
        return ResponseEntity.ok(cityService.getCityById(id));
    }

    @PostMapping("/cities")
    public ResponseEntity<City> getCityById(@RequestBody City city){
        return new ResponseEntity<>(cityService.saveCity(city), HttpStatus.CREATED);
    }
}
