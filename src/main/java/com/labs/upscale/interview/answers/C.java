package com.labs.upscale.interview.answers;

import java.io.PrintStream;
import java.math.BigDecimal;

public class C {
    private B b;
    private PrintStream ps = System.out;

    //dependency injection
    public C(B b) {
        this.b = b;
    }

    //dependency injection, mutator
    public void setB(B b) {
        this.b = b;
    }

    void operation1(String s, BigDecimal d) {
    }

    //a: parameter object
    void operation1(A a) {
        if (a.getS() != null) {
            operation2(a.getS());
        }
        if (a.getD() != null) {
            operation3(a.getD());
        }
    }

    void operation2(String s) {
        println(s);
    }

    void operation3(BigDecimal d) {
        println(d.toString());
    }

    //delegation
    public void println(String s) {
        ps.println(s);
    }

    //facade
    void operation5() {
        A a = b.m1();
        a.setS("s1");
        operation1(a);
    }
}
