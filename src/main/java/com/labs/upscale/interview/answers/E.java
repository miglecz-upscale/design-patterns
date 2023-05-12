package com.labs.upscale.interview.answers;

import java.math.BigDecimal;
import java.util.function.BinaryOperator;

//strategy
public class E implements BinaryOperator<BigDecimal> {
    @Override
    public BigDecimal apply(BigDecimal a, BigDecimal b) {
        return a.add(b);
    }
}
