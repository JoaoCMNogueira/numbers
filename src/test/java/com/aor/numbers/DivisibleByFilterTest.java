package com.aor.numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DivisibleByFilterTest {

    private Integer inte;
    private Integer inte_div;
    private Integer inte_notdiv;
    @BeforeEach
    public void setUp(){
        inte = 3;
        inte_div = 9;
        inte_notdiv = 5;
    }

    @Test
    public void accept(){
        DivisibleByFilter div_filter = new DivisibleByFilter(inte_div);
        DivisibleByFilter notdiv_filter = new DivisibleByFilter(inte_notdiv);
        boolean positive_answer = div_filter.accept(inte);
        boolean negative_answer = notdiv_filter.accept(inte);

        Assertions.assertTrue(positive_answer);
        Assertions.assertFalse(negative_answer);
    }
}
