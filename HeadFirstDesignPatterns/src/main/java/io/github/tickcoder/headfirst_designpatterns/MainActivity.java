package io.github.tickcoder.headfirst_designpatterns;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import io.github.tickcoder.headfirst_designpatterns.chapter01.Chapter01Activity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void actionChapter01Duck(View view) {
        Intent intent = new Intent(this, Chapter01Activity.class);
        startActivity(intent);
    }
}
