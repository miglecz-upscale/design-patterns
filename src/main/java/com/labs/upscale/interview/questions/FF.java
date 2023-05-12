package com.labs.upscale.interview.questions;

import java.util.function.UnaryOperator;

public class FF implements UnaryOperator<String> {
    @Override
    public String apply(String s) {
        return s;
    }
}
