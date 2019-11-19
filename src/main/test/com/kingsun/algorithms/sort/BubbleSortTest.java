package com.kingsun.algorithms.sort;

import org.junit.Test;
import com.kingsun.algorithms.sort.BubbleSort;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class BubbleSortTest {

    @Test
    public void should_sort_large_array() {
        for (int i = 0; i < 10; i++) {
            int count = (i + 1) * 5000;
            int[] numbers = aRandomArray(count);

            long start = System.currentTimeMillis();
            int[] results = new BubbleSort().sort(numbers);
            long end = System.currentTimeMillis();
            System.out.println(count +"耗时：" + (end - start));

            for (int j = 0; j < results.length - 1; j++) {
                assertTrue(results[j] <= results[j + 1]);
            }

        }
    }

    public int[] aRandomArray(int count) {
        int[] numbers = new int[count];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (count * (Math.random()));
        }
        return numbers;
    }
}
