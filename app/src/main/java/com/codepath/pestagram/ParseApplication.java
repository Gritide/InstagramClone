package com.codepath.pestagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application
{
    //Initializes Parse SDK as soon as the application is created.
    @Override
    public void onCreate()

    {
        super.onCreate();

        //Register your parse models
        ParseObject.registerSubclass(Post.class);
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("mSS2maCy5VmT7X3Rnqj9VCCvA927vvrJRvNwWYTN")
                .clientKey("7E3vUmpwdZbK4FLn7obTDZZvqnLUMraSVPNyfHzl")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}

