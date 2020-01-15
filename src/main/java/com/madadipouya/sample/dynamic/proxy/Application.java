package com.madadipouya.sample.dynamic.proxy;

import com.madadipouya.sample.dynamic.proxy.author.entity.Author;
import com.madadipouya.sample.dynamic.proxy.author.service.AuthorService;
import com.madadipouya.sample.dynamic.proxy.author.service.DefaultAuthorService;
import com.madadipouya.sample.dynamic.proxy.book.service.BookService;
import com.madadipouya.sample.dynamic.proxy.book.service.DefaultBookService;
import com.madadipouya.sample.dynamic.proxy.library.service.DefaultLibraryService;
import com.madadipouya.sample.dynamic.proxy.library.service.LibraryService;
import com.madadipouya.sample.dynamic.proxy.proxy.MethodExecutorLogger;

import java.lang.reflect.Proxy;

public class Application {

    public static void main(String[] args) {
        // Get proxy of author service
        AuthorService authorServiceProxy = getProxyOf(new DefaultAuthorService(), AuthorService.class);
        authorServiceProxy.addAuthor(new Author());

        // Get proxy of book service
        BookService bookServiceProxy = getProxyOf(new DefaultBookService(), BookService.class);
        bookServiceProxy.getBooks();

        // Get proxy of library service
        LibraryService libraryServiceProxy = getProxyOf(new DefaultLibraryService(), LibraryService.class);
        libraryServiceProxy.searchForLibraryByLatitudeLongitude(10, 20);

    }

    private static <T extends Service> T getProxyOf(T instanceImplementation, Class<? extends Service> interfaceClass) {
        return (T) Proxy.newProxyInstance(interfaceClass.getClassLoader(), new Class[] {interfaceClass},
                new MethodExecutorLogger(instanceImplementation));
    }
}