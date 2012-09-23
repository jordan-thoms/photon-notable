package com.thousandmemories.photon.notable;

import com.thousandmemories.photon.core.PhotoResource;
import com.yammer.dropwizard.Service;
import com.yammer.dropwizard.config.Configuration;
import com.yammer.dropwizard.config.Environment;
import com.yammer.dropwizard.logging.Log;

public class PhotonNotableService extends Service<Configuration> {
    public static void main(String[] args) throws Exception {
        new PhotonNotableService().run(args);
    }

    @Override
    protected void initialize(Configuration configuration, Environment environment) throws Exception {
        Log.forClass(PhotoResource.class).debug("-----------STARTING-----");
        environment.addResource(new PhotoResource(new S3PhotoProvider()));
    }
}
