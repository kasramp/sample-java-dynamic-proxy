package com.madadipouya.sample.dynamic.proxy.library.service;

import com.madadipouya.sample.dynamic.proxy.library.entity.Library;

public class DefaultLibraryService implements LibraryService {

    @Override
    public Library searchForLibraryByLatitudeLongitude(long latitude, long longitude) {
        System.out.println("Searching for a library based on the given lat and lon");
        // Implementation details
        return new Library();
    }
}
