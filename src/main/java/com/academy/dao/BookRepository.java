package com.academy.dao;

import com.academy.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Marcin on 2016-10-23.
 */
public interface BookRepository extends JpaRepository<Book, Long> {
}
