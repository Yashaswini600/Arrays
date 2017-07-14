package com.CircularArray.Question.test;

import static com.CircularArray.Question.ArraysFuction.circularArrayOfRelativeIndexes;

import org.junit.Assert;
import org.junit.Test;

public class ArraysFuntionTest {
	
	@Test
	  public void test() {
	    Assert.assertEquals(true,  circularArrayOfRelativeIndexes(new int[] {0}));
	    Assert.assertEquals(true,  circularArrayOfRelativeIndexes(new int[] {1, -1}));
	    Assert.assertEquals(true,  circularArrayOfRelativeIndexes(new int[] {1, 1, 1}));
	    Assert.assertEquals(true,  circularArrayOfRelativeIndexes(new int[] {2, 2, 2}));
	    Assert.assertEquals(true,  circularArrayOfRelativeIndexes(new int[] {-1, -1, -1}));
	    Assert.assertEquals(true,  circularArrayOfRelativeIndexes(new int[] {2, 2, -1}));
	    Assert.assertEquals(true,  circularArrayOfRelativeIndexes(new int[] {5, 5, 5}));
	    Assert.assertEquals(true,  circularArrayOfRelativeIndexes(new int[] {-5, -5, -5}));
	    Assert.assertEquals(false, circularArrayOfRelativeIndexes(new int[] {2, 0, 2}));
	    Assert.assertEquals(false, circularArrayOfRelativeIndexes(new int[] {2, 2, 0}));

	  }

}


