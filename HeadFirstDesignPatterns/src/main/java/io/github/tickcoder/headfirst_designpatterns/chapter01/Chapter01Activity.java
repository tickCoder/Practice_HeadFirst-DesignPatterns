package io.github.tickcoder.headfirst_designpatterns.chapter01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import io.github.tickcoder.headfirst_designpatterns.R;

public class Chapter01Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chapter01);

        Duck duck = new MallarDuck();
        duck.performFly();
        duck.performQuack();

        duck.setFlyBehavior(new FlyNoWay());
        duck.performFly();

        duck.display();
    }


}
