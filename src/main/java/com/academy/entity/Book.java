package com.academy.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * Created by Marcin on 2016-10-23.
 */
@Entity
@Table(name = "BOOKS")
public class Book {

    @Id
    @GenericGenerator(name = "bookSequence", strategy = "sequence-identity",
            parameters = @org.hibernate.annotations.Parameter(name = "sequence", value = "BOOKS_SEQ"))
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "bookSequence")
    @Column(name = "BOOK_ID")
    private Long id;

    @Column(name = "TITLE")
    private String title;

    @Column(name = "AUTHOR")
    private String author;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "STUDENT_ID")
    private Student student;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
