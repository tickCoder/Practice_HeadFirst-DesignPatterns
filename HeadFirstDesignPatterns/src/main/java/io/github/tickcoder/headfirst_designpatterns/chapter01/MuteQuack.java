package io.github.tickcoder.headfirst_designpatterns.chapter01;

import android.util.Log;

/**
 * Created by claris on 2017.05.19.Friday.
 */

public class MuteQuack implements IQuackBehavior {
    @Override
    public void quack() {
        Log.e("XX", "MuteQuack: 不会叫");
    }
}
