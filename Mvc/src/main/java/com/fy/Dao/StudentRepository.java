package com.fy.Dao;

import com.fy.Entity.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface StudentRepository extends MongoRepository<Student, Long> {
    Student findByName(String name);
}