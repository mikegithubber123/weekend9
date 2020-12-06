package com.academy.dao;

import com.academy.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Marcin on 2016-10-23.
 */
public interface StudentRepository extends JpaRepository<Student, Long> {
}
