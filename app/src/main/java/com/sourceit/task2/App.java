package com.sourceit.task2;

import android.app.Application;

import com.sourceit.task2.utils.Toasts;
/**
 * Created by User on 01.02.2016.
 */
public class App extends Application {
    private static App instance;

    public static App getApp() {
        return instance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
        Toasts.init(this);
    }
}
