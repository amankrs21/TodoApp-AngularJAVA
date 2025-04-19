package com.example.books.books.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.books.books.models.BookModel;

@Repository
public interface BooksRepo extends JpaRepository<BookModel, Long> {
    
}
