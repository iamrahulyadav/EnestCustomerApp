package com.enestcustomerapp;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;

import com.onesignal.OneSignal;

public class MyApplication extends Application {
    private static final String ONESIGNAL_APP_ID = "dbe7ce54-7932-484c-8541-ff3594e1d5a0";
    @SuppressLint("StaticFieldLeak")
    public static Context mContext;

    @Override
    public void onCreate() {
        super.onCreate();
        mContext = this;
        OneSignal.initWithContext(this);
        OneSignal.setAppId(ONESIGNAL_APP_ID);
    }
}