package me.varunon9.remotecontrolpc;

import android.app.Application;


import com.appspector.sdk.AppSpector;

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // We recommend to start AppSpector from Application#onCreate method

        // You can start all monitors
        AppSpector
                .build(this)
                .withDefaultMonitors()
                .run("android_YTUwNjc5YzAtNmY3My00MDUwLWFmMzItZTJkNDY3MzFjYzg1");

        // Or you can select monitors that you want to use
        AppSpector
                .build(this)
                .addPerformanceMonitor()
                .addHttpMonitor()
                // If specific monitor is not added then this kind of data won't be tracked and available on the web
                .addLogMonitor()
                .run("android_YTUwNjc5YzAtNmY3My00MDUwLWFmMzItZTJkNDY3MzFjYzg1");
    }
}