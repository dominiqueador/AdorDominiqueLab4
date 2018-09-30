package com.ador.dominique;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("Application Status", "onCreate has executed.");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Application Status", "onStart has executed.");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Application Status", "onResume has executed.");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Application Status", "onPause has executed.");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Application Status", "onStop has executed.");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Application Status", "onDestroy has executed.");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Application Status", "onRestart has executed.");
    }

    public void showMessage1(View view){
        Toast.makeText(this, "Go to the previous page.", Toast.LENGTH_LONG).show();
    }

    public void showMessage2(View view){
        Snackbar.make(view, "Go to the next page.", Snackbar.LENGTH_LONG).show();
    }
}