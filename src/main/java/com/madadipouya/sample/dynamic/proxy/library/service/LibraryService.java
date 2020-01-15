package com.madadipouya.sample.dynamic.proxy.library.service;

import com.madadipouya.sample.dynamic.proxy.Service;
import com.madadipouya.sample.dynamic.proxy.library.entity.Library;

public interface LibraryService extends Service {

    Library searchForLibraryByLatitudeLongitude(long latitude, long longitude);
}
