package com.broadcast.receiverui;

import android.app.Application;
import android.content.Context;

/**
 * Created by Colan Infotech.
 */

public class MyApplication extends Application {
    private Context mContext;
    @Override
    public void onCreate() {
        super.onCreate();

    }
    public void setContext(Context context){
        mContext=context;
    }
    public Context getContext(){
        return mContext;
    }
}
