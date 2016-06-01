package com.ttz.ttzandroid;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.igexin.sdk.PushManager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        PushManager.getInstance().initialize(this.getApplicationContext());

        Log.v("onCreate","MainActivity");
    }
}
