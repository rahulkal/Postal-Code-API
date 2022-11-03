package com.suburb.services;

import com.suburb.model.SuburbResponse;
import com.suburb.persistence.model.Suburb;

import java.util.List;

public interface SuburbService {

    Iterable<Suburb> saveSuburbs(List<Suburb> suburb);

    SuburbResponse getSuburbs(Long[] postalCodeRange);

}
