package com.mph.testcase;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestClass {

	@Test
	public void testAllAssertMethods() {
		String str1 = new String("Rahul");
		String str2 = new String("Rahul");
		String str3 = null;
		String str4 = "tejal";
		String str5 = "tejal";

		int val1 = 5;
		int val2 = 6;

		 assertEquals(str4, str5);

	}

	@Test
	public void testAllAraayMethods() {

		String[] arr1 = { "one", "two", "three" };
		String[] arr2 = { "one", "two", "three" };

		assertArrayEquals(arr1, arr2);

	}
	
	@Test
	public void testAllNumberMethods() {
		
		int val1 = 5;
		int val2 = 6;

	 assertTrue(val1<val2);
			

	}


}