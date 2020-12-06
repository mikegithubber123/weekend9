package com.academy.dao;

import com.academy.entity.Student;

import java.util.Collection;

/**
 * Created by Marcin on 2016-10-22.
 */
public interface StudentDao {
    Collection<Student> getAllStudents();

    Student getStudentById(Long id);

    void deleteStudentById(Long id);

    void addStudent(Student student);

    void updateStudent(Student student);
}
