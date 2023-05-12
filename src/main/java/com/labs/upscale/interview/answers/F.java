package com.labs.upscale.interview.answers;

import java.util.function.UnaryOperator;

//decorator
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
