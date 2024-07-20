package com.pih.cache.service;

import com.pih.cache.entity.City;
import com.pih.cache.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CityService {

    @Autowired
    CityRepository cityRepository;

    public City getCityById(Integer id){
        return cityRepository.findById(id).get();
    }

    public City saveCity(City city){
        return cityRepository.save(city);
    }
}
