package com.akshaykant.com.poc_login;

import android.app.Application;

import com.facebook.FacebookSdk;
import com.facebook.appevents.AppEventsLogger;

/**
 * Created by Akshay Kant on 14-12-2016.
 */

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        //Facebook Logger
        AppEventsLogger.activateApp(this);

    }
}
