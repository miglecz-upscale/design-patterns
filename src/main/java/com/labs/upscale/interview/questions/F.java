package com.labs.upscale.interview.questions;

import java.util.function.UnaryOperator;

public class F implements UnaryOperator<String> {
    private UnaryOperator<String> o;

    public F(UnaryOperator<String> o) {
        this.o = o;
    }

    @Override
    public String apply(String s) {
        return String.format("[%s]", o.apply(s));
    }
}
