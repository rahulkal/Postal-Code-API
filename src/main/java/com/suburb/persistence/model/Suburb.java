package com.suburb.persistence.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "SUBURB")
public class Suburb {

    @Id
    @Column(nullable = false, unique = true)
    private Long postal_code;

    @Column(nullable = false)
    private String suburb_name;

    public Suburb() {
    }

    public Suburb(Long postal_code, String suburb_name) {
        super();
        this.postal_code = postal_code;
        this.suburb_name = suburb_name;
    }

    public Long getPostalCode() {
        return postal_code;
    }

    public void setPostalCode(Long postal_code) {
        this.postal_code = postal_code;
    }

    public String getSuburbName() {
        return suburb_name;
    }

    public void setSuburbName(String suburb_name) {
        this.suburb_name = suburb_name;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((postal_code == null) ? 0 : postal_code.hashCode());
        result = prime * result + ((suburb_name == null) ? 0 : suburb_name.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Suburb other = (Suburb) obj;
        if (postal_code == null) {
            if (other.postal_code != null)
                return false;
        } else if (!postal_code.equals(other.postal_code))
            return false;
        if (suburb_name == null) {
            if (other.suburb_name != null)
                return false;
        } else if (!suburb_name.equals(other.suburb_name))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Suburbs [ suburb=" + suburb_name + ", postal code=" + postal_code + "]";
    }
}
