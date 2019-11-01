package com.kingsun.algorithms.sort;

import com.kingsun.utils.PrintUtil;
import main.java.algorithms.sort.InsertSort;

public class InsertSortTest {

	public static void main(String[] args) {
		
		InsertSort sort = new InsertSort();
		
		PrintUtil util = new PrintUtil();
		
		int[] arr = {9,3,71,24,4,86,10,85};
		
		util.print(sort.insert(arr));
		
		
	}

}
