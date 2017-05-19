package io.github.tickcoder.headfirst_designpatterns.chapter01;

/**
 * Created by claris on 2017.05.19.Friday.
 */

public abstract class Duck {

    protected IFlyBehavior mFlyBehavior;
    protected IQuackBehavior mQuackBehavior;

    public void swim() {
    }

    public abstract void display();

    public void performQuack() {
        this.mQuackBehavior.quack();
    }

    public void performFly() {
        this.mFlyBehavior.fly();
    }

    public void setFlyBehavior(IFlyBehavior flyBehavior) {
        this.mFlyBehavior = flyBehavior;
    }

    public void  setQuackBehavior(IQuackBehavior quackBehavior) {
        this.mQuackBehavior = quackBehavior;
    }
}
