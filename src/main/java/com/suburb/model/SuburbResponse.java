package com.suburb.model;

import java.util.List;

public class SuburbResponse {

    private List<String> suburbs;

    private Long numberOfCharactersOfSuburbs;

    public SuburbResponse(List<String> suburbs) {
        super();
        // We could have sorted and removed duplicate entries from suburbs here using streams but i choose to do it in sql
        this.suburbs = suburbs;
        this.numberOfCharactersOfSuburbs = suburbs.stream().mapToLong(String::length).sum();
    }

    public List<String> getSuburbs() {
        return suburbs;
    }

    public Long getNumberOfCharactersOfSuburbs() {
        return numberOfCharactersOfSuburbs;
    }
}
