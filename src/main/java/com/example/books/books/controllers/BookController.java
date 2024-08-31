package com.example.books.books.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.books.books.models.BookModel;
import com.example.books.books.services.BookService;

@RestController
public class BookController {

    @Autowired
    BookService bookService;

    @GetMapping("/books")
    public List<BookModel> getAllBooks() {
        return bookService.getAllBooks();
    }
    
    @GetMapping("/books/{bookId}")
    public BookModel getBookById(@PathVariable int bookId) {
        return bookService.getBookById(bookId);
    }

    @PostMapping("/books")
    public BookModel addBook(@RequestBody BookModel book) {
        return bookService.addBook(book);
    }

    @PutMapping("/books/{bookId}")
    public BookModel updateBook(@PathVariable int bookId, @RequestBody BookModel book) {
        return bookService.updateBook(bookId, book);
    }

    @DeleteMapping("/books/{bookId}")
    public boolean deleteBook(@PathVariable int bookId) {
        return bookService.deleteBook(bookId);
    }
}
