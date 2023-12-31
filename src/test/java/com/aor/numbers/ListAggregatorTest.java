package com.aor.numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListAggregatorTest {

    private List<Integer> list;
    private ListAggregator aggregator;

    @BeforeEach
    public void setUp(){
        list = Arrays.asList(1,2,4,2,5);
        aggregator = new ListAggregator();
    }

    @Test
    public void sum() {


        int sum = aggregator.sum(list);

        Assertions.assertEquals(14, sum);
    }

    @Test
    public void max() {

        int max = aggregator.max(list);

        Assertions.assertEquals(5, max);
    }
    @Test
    public void max_bug_7263() {

        list = Arrays.asList(-1,-4, -5);
        int max = aggregator.max(list);

        Assertions.assertEquals(-1, max);
    }

    @Test
    public void min() {

        int min = aggregator.min(list);

        Assertions.assertEquals(1, min);
    }

    @Test
    public void distinct() {


        GenericListDeduplicator deduplicator = Mockito.mock(GenericListDeduplicator.class);
        Mockito.when(deduplicator.deduplicate(Mockito.anyList(), Mockito.any())).thenReturn(Arrays.asList(1,2,4,5));

        GenericListSorter sorter = Mockito.mock(GenericListSorter.class);
        Mockito.when(sorter.sort(Mockito.anyList())).thenReturn(Arrays.asList(1,2,2,4,5));


        int distinct = aggregator.distinct(list, deduplicator, sorter);

        Assertions.assertEquals(4, distinct);
    }
}
