package com.madadipouya.sample.dynamic.proxy.book.service;

import com.madadipouya.sample.dynamic.proxy.Service;
import com.madadipouya.sample.dynamic.proxy.book.entity.Book;

import java.util.List;

public interface BookService extends Service {

    void getBookById(long id);

    List<Book> getBooks();

    Book addBook(Book book);

    boolean deleteBook(long bookId);
}
