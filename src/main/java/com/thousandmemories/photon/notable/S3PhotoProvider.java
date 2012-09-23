package com.thousandmemories.photon.notable;

import com.thousandmemories.photon.core.PhotoProvider;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class S3PhotoProvider implements PhotoProvider {
    @Override
    public InputStream getPhotoInputStream(String path) throws IOException {
        return new URL("http://s3.amazonaws.com/projectxhj/" + path).openStream();
    }
}
