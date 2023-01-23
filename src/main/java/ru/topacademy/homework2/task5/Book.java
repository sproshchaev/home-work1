package ru.topacademy.homework2.task5;

public class Book {

    private String title;
    private String author;
    private int pages;
    private String publisher;
    private int year;

    public Book(String title, String author, int pages, String publisher, int year) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.publisher = publisher;
        this.year = year;
    }

    public Book(Book book) {
        this.title = book.title;
        this.author = book.author;
        this.pages = book.pages;
        this.publisher = book.publisher;
        this.year = book.year;
    }

    public String getTitle() {
        return title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Book)) {
            return false;
        }
        Book other = (Book) o;

        if (this.title.equals(other.title) &&
                this.author.equals(other.author) &&
                this.publisher.equals(other.publisher) &&
                this.pages == other.pages && this.year == other.year) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return String.format("%-10s %s\n", "Title:", title) +
                String.format("%-10s %s\n", "Author:", author) +
                String.format("%-10s %d\n", "Pages:", pages) +
                String.format("%-10s %s\n", "Publisher:", publisher) +
                String.format("%-10s %d", "Year:", year);
    }

}

