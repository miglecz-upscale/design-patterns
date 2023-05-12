package com.labs.upscale.interview.questions;

import java.math.BigDecimal;
import java.util.function.BinaryOperator;

public class E implements BinaryOperator<BigDecimal> {
    @Override
    public BigDecimal apply(BigDecimal a, BigDecimal b) {
        return a.add(b);
    }
}
