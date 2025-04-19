package com.example.books.books.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.books.books.models.BookModel;
import com.example.books.books.repository.BooksRepo;

@Service
public class BookService {
    @Autowired
    BooksRepo booksRepo;

    public List<BookModel> getAllBooks() {
        try {
            return booksRepo.findAll();
        } catch (Exception e) {
            return null;
        }
    }

    public BookModel getBookById(int bookId) {
        try {
            return booksRepo.findById((long) bookId).orElse(null);
        } catch (Exception e) {
            return null;
        }
    }

    public BookModel addBook(BookModel book) {
        try {
            return booksRepo.save(book);
        } catch (Exception e) {
            return null;
        }
    }

    public BookModel updateBook(int bookId, BookModel book) {
        try {
            BookModel existingBook = booksRepo.findById((long) bookId).orElse(null);
            if (existingBook != null) {
                existingBook.setTitle(book.getTitle());
                existingBook.setAuthor(book.getAuthor());
                existingBook.setDescription(book.getDescription());
                return booksRepo.save(existingBook);
            } else {
                return null;
            }
        } catch (Exception e) {
            return null;
        }
    }

    public boolean deleteBook(int bookId) {
        try {
            booksRepo.deleteById((long) bookId);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
