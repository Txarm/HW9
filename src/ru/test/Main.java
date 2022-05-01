package ru.test;

public class Main {

    public static void main(String[] args) {
        Autor autor1 = new Autor("Ivan", "Bunin");
        Autor autor2 = new Autor("James", "Cameron");
        Book book1 = new Book("Solitaire", autor1, 2020);
        Book book2 = new Book("Joker", autor2, 2005);
        System.out.println("Книга 1 - " + book1.getName() + ", автор " + autor1.getFirstName() + " " + autor1.getLastName() + ", год издания " + book1.getPublishingYear());
        System.out.println("Книга 2 - " + book2.getName() + ", автор " + autor2.getFirstName() + " " + autor2.getLastName() + ", год издания " + book2.getPublishingYear());
        book2.setPublishingYear(2015);
        System.out.println("Книга 2 - " + book2.getName() + ", автор " + autor2.getFirstName() + " " + autor2.getLastName() + ", год издания " + book2.getPublishingYear());

    }
}
