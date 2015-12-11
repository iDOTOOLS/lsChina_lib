
package com.lockscreen.lib.googleplay;

import android.content.Context;

public class IsGooglePlay_DuAdManager {

    private static IsGooglePlay_DuAdManager mInstance;
    private IsGooglePlay_DuAdManager() {
    }
    public static IsGooglePlay_DuAdManager getInstance() {
        if (mInstance == null) {
            mInstance = new IsGooglePlay_DuAdManager();
        }
        return mInstance;
    }

    public void ConfigDuadNetWork(Context context) {}

    public void jumpToAdWall(Context mContext) {}
}