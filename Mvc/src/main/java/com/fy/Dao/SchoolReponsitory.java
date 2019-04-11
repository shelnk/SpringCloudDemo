package com.fy.Dao;

import com.fy.Entity.School;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SchoolReponsitory extends MongoRepository<School,Long> {
    School findSchoolByName(String name);
}