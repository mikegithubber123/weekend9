package com.academy.dao;

import com.academy.entity.Student;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Collection;

/**
 * Created by Marcin on 2016-10-22.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentDaoTest {

    @Autowired
    private StudentDao studentDao;

    @Test
    public void getAllStudents() throws Exception {
        //given

        //when
        Collection<Student> students = studentDao.getAllStudents();

        //then
        Assert.assertEquals(3, students.size());
    }

    @Test
    public void getStudentById() throws Exception {
        Student student = studentDao.getStudentById(1L);
        Assert.assertNotNull(student);
        Assert.assertEquals("Jan", student.getName());
        Assert.assertEquals("Kowalski", student.getSurname());
    }

    @Test
    public void deleteStudentById() throws Exception {
        studentDao.deleteStudentById(3L);
        Student deleted = studentDao.getStudentById(3L);
        Assert.assertNull(deleted);
    }

    @Test
    public void addStudent() throws Exception {
        studentDao.addStudent(new Student(4L, "Nowy", "Nowy"));
        Student added = studentDao.getStudentById(4L);
        Assert.assertNotNull(added);
    }

    @Test
    public void updateStudent() throws Exception {
        studentDao.updateStudent(new Student(2L, "Bogdan", "Bogdanowskii"));
        Student updated = studentDao.getStudentById(2L);
        Assert.assertNotNull(updated);
        Assert.assertEquals("Bogdanowskii", updated.getSurname());
    }

}