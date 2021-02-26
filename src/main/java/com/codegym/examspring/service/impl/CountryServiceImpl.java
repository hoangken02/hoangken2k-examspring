package com.codegym.examspring.service.impl;

import com.codegym.examspring.model.Country;
import com.codegym.examspring.repository.CountryRepository;
import com.codegym.examspring.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CountryServiceImpl implements CountryService {

    @Autowired
    private CountryRepository countryRepository;

    @Override
    public Iterable<Country> findAll() {
        return countryRepository.findAll();
    }
}
