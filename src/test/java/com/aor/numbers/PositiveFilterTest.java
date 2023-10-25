package com.aor.numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PositiveFilterTest {

    private Integer inte;
    @BeforeEach
    public void setUp(){
        inte = 2;
    }
    @Test
    public void accept(){
        PositiveFilter filter = new PositiveFilter();
        boolean answer = filter.accept(inte);

        Assertions.assertEquals(true, answer);

    }
}
