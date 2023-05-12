package com.labs.upscale.interview.answers;

import java.util.function.UnaryOperator;

//null object
public class FF implements UnaryOperator<String> {
    @Override
    public String apply(String s) {
        return s;
    }
}
