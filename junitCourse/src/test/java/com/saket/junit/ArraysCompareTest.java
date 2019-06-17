package com.saket.junit;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class ArraysCompareTest {

	// Arrays.sort
	
	@Test(expected=NullPointerException.class)
	public void testArraySortException() {
		
		int[] numbers = {};
		Arrays.sort(numbers);		
	}
	
	
	@Test
	public void testArraySort() {
		
		int[] numbers = {12,3,4,1};
		int[] expected = {1,3,4,12};
		Arrays.sort(numbers);
		assertArrayEquals(expected, numbers);
	}
	
	@Test(timeout=10000)
	public void testSort_performance() {
		int array[] = {12,23,4};
		for (int i=1; i<=1000000000;i++)
		{
			array[0]  = i;
			Arrays.sort(array);
		}
		
	}
	

}
