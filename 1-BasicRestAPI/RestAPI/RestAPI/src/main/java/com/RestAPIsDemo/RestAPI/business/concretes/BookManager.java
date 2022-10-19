package com.RestAPIsDemo.RestAPI.business.concretes;

import com.RestAPIsDemo.RestAPI.business.abstracts.BookService;
import com.RestAPIsDemo.RestAPI.dataAccess.abstracts.BookDaoImpl;
import com.RestAPIsDemo.RestAPI.entities.concretes.Book;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class BookManager implements BookService {

    @Autowired
    private BookDaoImpl bookDao;

    @Override
    public List<Book> getAllBooks() {

        return bookDao.getAll();

    }

    @Override
    public Book getBookById(int id) {

        return this.bookDao.getById(id);
    }

    @Override
    public Book addBook(Book book) {
        if (this.getBookById(book.getId()) == null) {
            return this.bookDao.addBook(book);
        } else {

            log.info("This book is already registered.");
            return null;
        }

    }
}
