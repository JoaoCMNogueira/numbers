package com.aor.numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListFiltererTest {

    private List<Integer> list;

    @BeforeEach
    public void setUp(){
        list = Arrays.asList(-1,10,-6,8,6);

    }

    @Test
    public void filter(){

        GenericListFilter passedFilter = Mockito.mock(PositiveFilter.class);
        Mockito.when(passedFilter.accept(Mockito.anyInt())).thenReturn(true);

        GenericListFilter deniedFilter = Mockito.mock(DivisibleByFilter.class);
        Mockito.when(deniedFilter.accept(Mockito.anyInt())).thenReturn(false);

        ListFilterer passedfilterer = new ListFilterer(passedFilter);
        ListFilterer deniedfilterer = new ListFilterer(deniedFilter);

        List<Integer> positivefilter_list = passedfilterer.filter(list);
        List<Integer> divisiblebyfilter_list = deniedfilterer.filter(list);

        Assertions.assertEquals(Arrays.asList(-1,10,-6,8,6),positivefilter_list);
        Assertions.assertEquals(Collections.emptyList(),divisiblebyfilter_list);
    }
}
