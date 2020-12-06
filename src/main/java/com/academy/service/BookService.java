package com.academy.service;

import com.academy.entity.Book;

import java.util.Collection;

/**
 * Created by Marcin on 2016-10-23.
 */
public interface BookService {

    Collection<Book> getAllBooks();

    Book getBookById(Long id);
}
