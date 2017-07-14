package com.CircularArray.Question;

public class ArraysFuction {
	
	public static void main(String[] args) {
		
	    int [] arr = {0};
        boolean index = circularArrayOfRelativeIndexes(arr);
        System.out.println(index);
	}
	
	public static boolean circularArrayOfRelativeIndexes(int[] circularArr) {
	    final int x = circularArr.length;
	    int index = 0;
	    for(int i = 0; i < x; i++) {
	    	
	    	index = ((index + circularArr[index]) % x + x) % x;
	    	if(index == 0 && i < x - 1) {
	        return false;
	      } 
	    }
	    return index == 0;
	  }

}
