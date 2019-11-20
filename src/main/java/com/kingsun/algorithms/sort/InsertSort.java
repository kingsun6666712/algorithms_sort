package com.kingsun.algorithms.sort;

import java.util.Arrays;

public class InsertSort {
    public int[] sort(int[] numbers) {
        int j; // 已排序列表下标
        int t; // 待排序元素
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < numbers[i - 1]) {
                t = numbers[i]; // 赋值给待排序元素
                for (j = i - 1; j >= 0 && numbers[j] > t; j--) {
                    numbers[j + 1] = numbers[j]; // 从后往前遍历已排序列表，逐个和待排序元素比较，如果已排序元素较大，则将它后移
                }
                numbers[j + 1] = t; // 将待排序元素插入到正确的位置
            }
        }
        return numbers;
    }
}
