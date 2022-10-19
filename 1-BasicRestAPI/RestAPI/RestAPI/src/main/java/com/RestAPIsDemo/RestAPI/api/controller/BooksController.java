package com.RestAPIsDemo.RestAPI.api.controller;

import com.RestAPIsDemo.RestAPI.business.abstracts.BookService;
import com.RestAPIsDemo.RestAPI.entities.concretes.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/books")
public class BooksController {

    @Autowired
    private BookService bookService;

    @GetMapping("/hello")
    public String hi() {
        return "Hello World";
    }

    @GetMapping("/getAll")
    public List<Book> findAll() {
        return this.bookService.getAllBooks();
    }

    @GetMapping("/findBook")
    public Book getBook(@RequestParam int id) {
        return this.bookService.getBookById(id);

    }

    @PostMapping("/add")
    public Book addBook(@RequestBody Book book) {
        return this.bookService.addBook(book);
    }

}
