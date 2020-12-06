package com.academy.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * Created by Marcin on 2016-10-23.
 */
@Entity
@Table(name = "COURSES")
public class Course {

    @Id
    @GenericGenerator(name = "courseSequence", strategy = "sequence-identity",
            parameters = @org.hibernate.annotations.Parameter(name = "sequence", value = "COURSES_SEQ"))
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "courseSequence")
    @Column(name = "COURSE_ID")
    private Long id;

    @Column(name = "NAME")
    private String name;

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
}
