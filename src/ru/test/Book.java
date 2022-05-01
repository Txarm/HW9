package ru.test;

public class Book {
    String name;
    Autor author;
    int publishingYear;

    public Book(String name, Autor author, int publishingYear) {
        this.name = name;
        this.author = author;
        this.publishingYear = publishingYear;
    }

    public String getName() {
        return this.name;
    }

    public Autor getAuthor() {
        return this.author;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }
}
