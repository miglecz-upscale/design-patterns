package com.labs.upscale.interview.answers;

//singleton
public class B {

    private static B b;

    private B() {
    }

    //lazy init=virtual proxy
    public static B b() {
        if (b == null) {
            b = new B();
        }
        return b;
    }

    //factory
    public A m1() {
        return new A();
    }
}
