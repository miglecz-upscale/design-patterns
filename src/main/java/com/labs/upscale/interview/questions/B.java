package com.labs.upscale.interview.questions;

public class B {

    private static B b;

    private B() {
    }

    public static B b() {
        if (b == null) {
            b = new B();
        }
        return b;
    }

    public A m1() {
        return new A();
    }
}
