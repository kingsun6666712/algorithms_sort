package com.kingsun.algorithms.sort;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class BubbleSortTest {

    @Test
    public void test() {

        BubbleSort sort = new BubbleSort();

        int numbers[] = {7, 3, 19, 6, 28, 15, 2, 17};

        int[] results = sort.sort(numbers);

        for (int i = 0; i < results.length - 1; i++) {
            assertTrue(results[i] < results[i + 1]);
        }


    }
}
