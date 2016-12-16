package com.akshaykant.com.poc_login;

import android.app.Application;

import com.facebook.FacebookSdk;
import com.facebook.accountkit.AccountKit;
import com.facebook.appevents.AppEventsLogger;

/**
 * Created by Akshay Kant on 14-12-2016.
 */

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        FacebookSdk.sdkInitialize(getApplicationContext(), 8001);
        AppEventsLogger.activateApp(this);

        //Initialize Account Kit
        AccountKit.initialize(getApplicationContext());
    }
}
