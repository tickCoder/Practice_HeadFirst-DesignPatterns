package io.github.tickcoder.headfirst_designpatterns.chapter01;

import android.util.Log;

/**
 * Created by claris on 2017.05.19.Friday.
 */

public class FlyWithWings implements IFlyBehavior {
    @Override
    public void fly() {
        Log.e("XX", "FlyWithWings");
    }
}
