package com.mph.testcase;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.mph.test.*;

	public class CalculateTest {
		Calculation calc;
		
		@BeforeClass
		public static void setUpBeforeClass()
		{
			
			System.out.println("@BeforeClass called ");
		}
		
		@Before
		public void setUp()  throws java.lang.Exception{
			calc = new Calculation();
			System.out.println("@Before called ");
		}
		
		
		
		@Test
		public void testAdd()
		{
			System.out.println("Add Test");
			assertEquals(130, calc.add(80,20,30));
			
		}
		@Test
		public void testMultiply()
		{
			System.out.println("Multiply Test");
			assertEquals(120, calc.multiply(1,2,3,4,5));
			
		}
		
		@After
		public  void tearDown() throws java.lang.Exception{
			calc= null;
			System.out.println("@After called ");
		}
		
		@AfterClass
		public static void tearDownAfterClass()
		{
			
			System.out.println("@AfterClass called ");
		}

	}
