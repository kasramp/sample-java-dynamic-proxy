package com.madadipouya.sample.dynamic.proxy.author.service;

import com.madadipouya.sample.dynamic.proxy.author.entity.Author;

import java.util.List;

public class DefaultAuthorService implements AuthorService {

    @Override
    public List<Author> getAllAuthors() {
        // Implementation details
        System.out.println("Getting list of all authors");
        return List.of();
    }

    @Override
    public Author addAuthor(Author author) {
        // Implementation details
        System.out.println("Adding the author!");
        return new Author();
    }
}
