package com.aor.numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DivisibleByFilterTest {

    private Integer inte;
    private Integer inte_div;
    @BeforeEach
    public void setUp(){
        inte = 3;
        inte_div = 9;
    }

    @Test
    public void accept(){
        DivisibleByFilter filter = new DivisibleByFilter(inte_div);
        boolean answer = filter.accept(inte);

        Assertions.assertEquals(true, answer);
    }
}
