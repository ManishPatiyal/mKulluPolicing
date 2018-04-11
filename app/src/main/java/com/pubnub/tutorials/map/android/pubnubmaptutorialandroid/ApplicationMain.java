package com.pubnub.tutorials.map.android.pubnubmaptutorialandroid;

import android.app.Application;
import android.content.Context;
import android.support.multidex.MultiDex;

public class ApplicationMain extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
    }

    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        MultiDex.install(this);
    }
}
