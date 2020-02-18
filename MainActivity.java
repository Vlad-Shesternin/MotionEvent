package com.example.motionevent;

import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.MotionEventCompat;

public class MainActivity extends AppCompatActivity implements View.OnTouchListener {
    private static final String TAG = "MainActivity";

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        button.setOnTouchListener(this);
    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        int action = MotionEventCompat.getActionMasked(event);

        switch (action) {
            //1
            case (MotionEvent.ACTION_DOWN):
                Log.i(TAG, "DOWN");
                return true;
            //2
            case (MotionEvent.ACTION_UP):
                Log.i(TAG, "UP");
                return true;
            //3
            case (MotionEvent.ACTION_MOVE):
                Log.i(TAG, "MOVE");
                return true;
            default:
                return super.onTouchEvent(event);
        }
    }
}