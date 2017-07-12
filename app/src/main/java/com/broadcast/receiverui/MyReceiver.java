package com.broadcast.receiverui;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import com.broadcast.receiverui.CastCallback;
import com.broadcast.receiverui.MyApplication;

/**
 * Created by Colan Infotech.
 */

public class MyReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        MyApplication myApplication=(MyApplication)context;

        CastCallback callback=(CastCallback)myApplication.getContext();
        callback.updateUi();



    }
}
