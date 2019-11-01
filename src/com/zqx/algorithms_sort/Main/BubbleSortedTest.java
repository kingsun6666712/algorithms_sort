package com.zqx.algorithms_sort.Main;

import com.zqx.algorithms_sort.Utils.PrintUtil;
import com.zqx.algorithms_sort.delegation.BubbleSort;

public class BubbleSortedTest {

    public static void main (String args[]){
    	
      BubbleSort sort = new BubbleSort();
      
      PrintUtil print = new PrintUtil();
    
      int arr[] = {7,3,19,6,28,15,2,17};
      
      print.print(sort.sort(arr));
    }
}
