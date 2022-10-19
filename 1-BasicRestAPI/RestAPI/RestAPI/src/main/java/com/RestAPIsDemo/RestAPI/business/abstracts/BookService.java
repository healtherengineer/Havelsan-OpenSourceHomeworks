package com.RestAPIsDemo.RestAPI.business.abstracts;

import com.RestAPIsDemo.RestAPI.entities.concretes.Book;

import java.util.List;

public interface BookService {
    List<Book> getAllBooks();

    Book getBookById(int id);

    Book addBook(Book book);
}
