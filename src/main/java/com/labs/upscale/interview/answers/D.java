package com.labs.upscale.interview.answers;

import java.math.BigDecimal;

//Servant=helper=utility
public final class D {
    private D() {
    }

    public static void operation1(A a, BigDecimal d) {
        a.setS(a.getD().add(d).toString());
    }
}
