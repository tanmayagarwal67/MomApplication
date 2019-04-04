package com.example.momapplication;

import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView mNumber = (TextView) findViewById(R.id.mNumber);
        final TextView done = (TextView) findViewById(R.id.done);
        new CountDownTimer(10000,1000)
        {
            public void onTick(long func)
            {
                mNumber.setText("Time :" + String.valueOf(func/1000));
            }
            public void onFinish()
            {
                done.setText("you are done!!!");
                done.animate().rotationY(360).setDuration(1000);
            }
        }.start();
    }
}
