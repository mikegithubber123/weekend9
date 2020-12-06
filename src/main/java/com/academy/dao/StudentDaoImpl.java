package com.academy.dao;

import com.academy.entity.Student;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Marcin on 2016-10-22.
 */
@Repository
public class StudentDaoImpl implements StudentDao {

    private Map<Long, Student> students;

    public StudentDaoImpl() {
        students = new HashMap<>();
        students.put(1L, new Student(1L, "Jan", "Kowalski"));
        students.put(2L, new Student(2L, "Bogdan", "Bogdanowski"));
        students.put(3L, new Student(3L, "Tomasz", "Tomaszewski"));
    }

    @Override
    public Collection<Student> getAllStudents() {
        return students.values();
    }

    @Override
    public Student getStudentById(Long id) {
        return students.get(id);
    }

    @Override
    public void deleteStudentById(Long id) {
        students.remove(id);
    }

    @Override
    public void addStudent(Student student) {
        students.put(student.getId(), student);
    }

    @Override
    public void updateStudent(Student student) {
        students.replace(student.getId(), student);
    }
}
