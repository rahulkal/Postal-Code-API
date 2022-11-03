package com.suburb.impl;

import com.suburb.model.SuburbResponse;
import com.suburb.persistence.model.Suburb;
import com.suburb.persistence.repo.SuburbRepo;
import com.suburb.services.SuburbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SuburbServiceImpl implements SuburbService {

    @Autowired
    SuburbRepo suburbRepo;


    @Override
    public Iterable<Suburb> saveSuburbs(List<Suburb> suburb) {
        return suburbRepo.saveAll(suburb);
    }

    @Override
    public SuburbResponse getSuburbs(Long[] postalCodeRange) {
        List<String> suburbsInRange = suburbRepo.getSuburbsInRange(postalCodeRange[0], postalCodeRange[1]);
        return new SuburbResponse(suburbsInRange);
    }
}
