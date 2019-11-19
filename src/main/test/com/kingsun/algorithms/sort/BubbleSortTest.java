package com.kingsun.algorithms.sort;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class BubbleSortTest {

    @Test
    public void test (){
    	
      BubbleSort sort = new BubbleSort();
    
      int numbers[] = {7,3,19,6,28,15,2,17};

      int[] results =sort.sort(numbers);

        assertEquals(results[0],2);
        assertEquals(results[1],3);
        assertEquals(results[2],6);
        assertEquals(results[3],7);

        assertEquals(results[4],15);
        assertEquals(results[5],17);
        assertEquals(results[6],19);
        assertEquals(results[7],28);

        for(int i=0;i<results.length-1;i++) {
            assertTrue(results[i]<results[i+1]);
        }



    }
}
