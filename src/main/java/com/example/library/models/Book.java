package com.example.library.models;

import java.util.Date;

public class Book {
    private int isbn, price;
    private String title, description;
    private Date publishDate;

    public Book(int isbn, String name, int price, String description)
    {
        setIsbn(isbn);
        setPrice(price);
        setName( name);
        setDescription( description);
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return title;
    }

    public void setName(String name) {
        this.title = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }

    @Override
    public String toString() {
        return "Book{" +
                "ssn=" + isbn +
                ", price=" + price +
                ", name='" + title + '\'' +
                ", description='" + description + '\'' +
                ", publishDate=" + publishDate +
                '}';
    }
}
