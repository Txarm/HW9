package ru.test;

import java.util.Objects;

public class Book {
   private String name;
   private Autor author;
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

    @Override
    public String toString() {
        return "Название " + name + " автор " + author.toString() + " год издания " + publishingYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(name, book.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
