package com.example.rentabookrestservices.domain;

import javax.persistence.*;

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    private String isbn;
    private String name;
    private String author;
    private int publishYear;
    private int pages;
    @OneToOne
    private BookSpecification bookSpecification;

    public Book() {
    }

    public Book(String isbn, String name, String author, int publishYear, int pages, BookSpecification bookSpecification) {
        this.isbn = isbn;
        this.name = name;
        this.author = author;
        this.publishYear = publishYear;
        this.pages = pages;
        this.bookSpecification = bookSpecification;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPublishYear() {
        return publishYear;
    }

    public void setPublishYear(int publishYear) {
        this.publishYear = publishYear;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public BookSpecification getBookSpecification() {
        return bookSpecification;
    }

    public void setBookSpecification(BookSpecification bookSpecification) {
        this.bookSpecification = bookSpecification;
    }

    @Override
    public String toString() {
        return "Kitabın Bilgileri" + " isbn=" + this.isbn + ", adı=" +
                this.name + ", ücreti=" + this.bookSpecification.getPrice();
    }
}
