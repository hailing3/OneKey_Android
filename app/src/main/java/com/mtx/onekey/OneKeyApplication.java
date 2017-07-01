package com.mtx.onekey;

import android.app.Application;
import android.content.Context;

/**
 * Created by lishaoming on 17/06/25.
 */
public class OneKeyApplication extends Application {
    private static Context mContext;

    @Override
    public void onCreate() {
        super.onCreate();
        init();
    }

    private void init() {
        mContext = getApplicationContext();
    }

    public static Context getContext() {
        return mContext;
    }
}
