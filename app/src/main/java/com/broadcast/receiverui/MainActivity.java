package com.broadcast.receiverui;

import android.content.Intent;
import android.content.IntentFilter;
import android.support.v4.content.LocalBroadcastManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements CastCallback, View.OnClickListener {

    private Button btnClick;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyApplication myApplication = (MyApplication) getApplicationContext();
        myApplication.setContext(this);

        btnClick = (Button) findViewById(R.id.btn_click);
        btnClick.setOnClickListener(this);

        MyReceiver myReceiver = new MyReceiver();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("receiver.broadcast.com.testbroad");
        LocalBroadcastManager.getInstance(this).registerReceiver(myReceiver, intentFilter);

        Intent intent = new Intent("receiver.broadcast.com.testbroad");
        LocalBroadcastManager.getInstance(this).sendBroadcast(intent);
    }


    @Override
    public void updateUi() {
        Toast.makeText(this, "Hello", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onClick(View view) {

        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }
}
