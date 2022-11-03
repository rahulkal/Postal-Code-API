package com.suburb.controllers;

import com.suburb.model.SuburbResponse;
import com.suburb.persistence.model.Suburb;
import com.suburb.services.SuburbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SuburbPostalCodeController {

    @Autowired
    SuburbService suburbService;

    //API to store the suburbs info in database
    @PostMapping(value = "/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Iterable<Suburb> storeSuburb(@RequestBody List<Suburb> suburb) {
        return suburbService.saveSuburbs(suburb);
    }

    //API to retrieve the suburbs info from database
    //URI e.g. localhost:8081/?postalCodeRange=3000,5000
    @GetMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
    public SuburbResponse getSuburbs(@RequestParam Long[] postalCodeRange) {
       return suburbService.getSuburbs(postalCodeRange);
    }

}
