package com.RestAPIsDemo.RestAPI.dataAccess.abstracts;

import com.RestAPIsDemo.RestAPI.entities.concretes.Book;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface BookDaoImpl {
    List<Book> getAll();

    Book getById(int id);

    Book addBook(Book book);

}
