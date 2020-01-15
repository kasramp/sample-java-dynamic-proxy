package com.madadipouya.sample.dynamic.proxy.book.service;

import com.madadipouya.sample.dynamic.proxy.book.entity.Book;

import java.util.List;

public class DefaultBookService implements BookService {

    @Override
    public void getBookById(long id) {
        // Implementation details
        System.out.println(String.format("Found Book with Id = %s", id));
    }

    @Override
    public List<Book> getBooks() {
        // Implementation details
        System.out.println("Querying to get all books");
        return List.of();
    }

    @Override
    public Book addBook(Book book) {
        // Implementation details
        System.out.println("Book added");
        return new Book();
    }

    @Override
    public boolean deleteBook(long bookId) {
        // Implementation details
        System.out.println(String.format("Book %s deleted", bookId));
        return true;
    }
}
