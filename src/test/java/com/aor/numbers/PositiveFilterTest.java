package com.aor.numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PositiveFilterTest {

    private Integer inte_pos;
    private Integer inte_neg;
    @BeforeEach
    public void setUp(){
        inte_pos = 2;
        inte_neg = -2;
    }
    @Test
    public void accept(){
        PositiveFilter filter = new PositiveFilter();
        boolean positive_answer = filter.accept(inte_pos);
        boolean negative_answer = filter.accept(inte_neg);

        Assertions.assertTrue(positive_answer);
        Assertions.assertFalse(negative_answer);

    }
}
