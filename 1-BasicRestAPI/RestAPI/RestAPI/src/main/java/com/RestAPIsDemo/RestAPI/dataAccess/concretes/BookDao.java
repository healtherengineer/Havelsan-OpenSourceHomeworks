package com.RestAPIsDemo.RestAPI.dataAccess.concretes;

import com.RestAPIsDemo.RestAPI.dataAccess.abstracts.BookDaoImpl;
import com.RestAPIsDemo.RestAPI.entities.concretes.Book;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Data
@Slf4j
@Repository
public class BookDao implements BookDaoImpl {

    private final List<Book> bookList;

    public BookDao() {
        this.bookList = new ArrayList<>();
        bookList.add(new Book(1, "The Kite Runner", "Khaled HOSSEINI"
                , "2017", "Novel", "Afghan"));
        bookList.add(new Book(2, "The Notes From The Underground", "Fyodor DOSTOYEVSKİ"
                , "1988", "Novel", "Russian"));
        bookList.add(new Book(3, "The Picture of Dorian Gray's", "Oscar WILDE"
                , "2001", "Novel", "English"));
        bookList.add(new Book(4, "Araba Sevdası", "Recaizade Mahmut Ekrem"
                , "1898", "Novel", "Turkish"));


    }

    @Override
    public List<Book> getAll() {
        return this.bookList;

    }

    @Override
    public Book getById(int id) {
        for (Book book : this.bookList) {
            if (book.getId() == id) {
                return book;
            }

        }

        log.info("Book is not founded.");
        return null;

    }

    @Override
    public Book addBook(Book book) {
        this.getBookList().add(book);
        return book;
    }
}
