    package ru.startandroid.lesson23activitylifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

    public class MainActivity extends AppCompatActivity {

        private static final String TAG = "States";

        @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //В логах этот метод будет иметь заданное название
        Log.d(TAG, "MainActivity: onCreate()");
    }

    @Override
    protected void onStart() {
        super.onStart();
        //В логах этот метод будет иметь заданное название
        Log.d(TAG, "MainActivity: onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        //В логах этот метод будет иметь заданное название
        Log.d(TAG, "MainActivity: onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        //В логах этот метод будет иметь заданное название
        Log.d(TAG, "MainActivity: onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        //В логах этот метод будет иметь заданное название
        Log.d(TAG, "MainActivity: onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        //В логах этот метод будет иметь заданное название
        Log.d(TAG, "MainActivity: onDestroy()");
    }
}
