package com.broadcast.receiverui;

import android.content.Intent;
import android.support.v4.content.LocalBroadcastManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;


public class SecondActivity extends AppCompatActivity implements CastCallback {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        MyApplication myApplication=(MyApplication)getApplicationContext();
        myApplication.setContext(this);

        Intent intent = new Intent("receiver.broadcast.com.testbroad");
        LocalBroadcastManager.getInstance(this).sendBroadcast(intent);
    }

    @Override
    public void updateUi() {
        Toast.makeText(this,"WAIT",Toast.LENGTH_LONG).show();
    }
}
