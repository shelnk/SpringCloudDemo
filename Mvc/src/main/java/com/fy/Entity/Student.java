package com.fy.Entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


//@AllArgsConstructor
//@Data
//@ToString
@Document
public class Student {
    @Id
    private Long id;

    private String name;
    private Integer age;
    private School shool;

    public Student() {
    }

    public Student(Long id, String name, Integer age, School shool) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.shool = shool;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public School getShool() {
        return shool;
    }

    public void setShool(School shool) {
        this.shool = shool;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", shool=" + shool +
                '}';
    }
}