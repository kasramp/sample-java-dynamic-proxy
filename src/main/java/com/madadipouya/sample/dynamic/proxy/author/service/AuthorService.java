package com.madadipouya.sample.dynamic.proxy.author.service;

import com.madadipouya.sample.dynamic.proxy.Service;
import com.madadipouya.sample.dynamic.proxy.author.entity.Author;

import java.util.List;

public interface AuthorService extends Service {

    List<Author> getAllAuthors();

    Author addAuthor(Author author);
}
