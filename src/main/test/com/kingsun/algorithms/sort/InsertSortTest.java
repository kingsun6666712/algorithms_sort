package com.kingsun.algorithms.sort;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class InsertSortTest {

//    @Test
//    public void test() {
//        int[] numbers = {10, 3, 5, 1, 24, 38, 15, 98, 21};
//        InsertSort sort = new InsertSort();
//        int[] results = sort.sort(numbers);
//
//        for(int i=0;i<numbers.length-1;i++) {
//            assertTrue(numbers[i]<=numbers[i+1]);
//        }
//    }

    @Test
    public void should_large_arrays() {
        for (int i = 0; i < 10; i++) {
            int count = (i + 1) * 5000;
            int[] numbers = aRandomArray(count);

            long start = System.currentTimeMillis();
            int[] results = new InsertSort().sort(numbers);
            long end = System.currentTimeMillis();
            System.out.println(count + "耗时：" + (end - start));

            for (int j = 0; j < results.length - 1; j++) {
                assertTrue(results[j] <= results[j + 1]);
            }
        }
    }

    private int[] aRandomArray(int count) {
        int[] numbers = new int[count];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (count * (Math.random()));
        }
        return numbers;
    }
}
