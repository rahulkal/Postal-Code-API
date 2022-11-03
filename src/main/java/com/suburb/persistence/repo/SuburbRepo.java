package com.suburb.persistence.repo;

import com.suburb.persistence.model.Suburb;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

//suburbs repository
@Repository
public interface SuburbRepo extends JpaRepository<Suburb, Long> {

    //Query to get distinct suburbs in range sorted alphabetically
    @Query(value = "SELECT DISTINCT suburb_name FROM SUBURB WHERE postal_code BETWEEN ?1 AND ?2 ORDER BY suburb_name")
    List<String> getSuburbsInRange(Long rangeStart, Long rangeEnd);
}
