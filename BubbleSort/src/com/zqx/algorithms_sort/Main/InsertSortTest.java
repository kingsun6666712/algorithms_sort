package com.zqx.algorithms_sort.Main;

import com.zqx.algorithms_sort.Utils.PrintUtil;
import com.zqx.algorithms_sort.delegation.InsertSort;

public class InsertSortTest {

	public static void main(String[] args) {
		
		InsertSort sort = new InsertSort();
		
		PrintUtil util = new PrintUtil();
		
		int[] arr = {9,3,71,24,4,86,10,85};
		
		util.print(sort.insert(arr));
		
		
	}

}
