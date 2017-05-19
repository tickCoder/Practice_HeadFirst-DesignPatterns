package io.github.tickcoder.headfirst_designpatterns.chapter01;

import android.util.Log;

/**
 * Created by claris on 2017.05.19.Friday.
 */

public class MallarDuck extends Duck {

    public MallarDuck() {
        super();
        setFlyBehavior(new FlyWithWings());
        setQuackBehavior(new Squeak());
    }

    @Override
    public void display() {
        Log.e("XX", "display：绿头鸭");
    }
}
