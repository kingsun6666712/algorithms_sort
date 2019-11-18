package com.kingsun.algorithms.sort;

import org.junit.Test;
public class BubbleSortedTest {

    @Test
    public void test (){
    	
      BubbleSort sort = new BubbleSort();
      
      //PrintUtil print = new PrintUtil();
    
      int numbers[] = {7,3,19,6,28,15,2,17};

      int[] results =sort.sort(numbers);

      org.junit.Assert.assertEquals(results[0],2);

    }
}
