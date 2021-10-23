package com.mph.test;

public class Calculation {
	
     
		public int add(int... number)
		{
			int result =0;
			for(int i: number) {
				result = result + i;
			}
		return result;
		}
		public int multiply(int... number) 
		{
			int result = 1;
			for(int i:number) {
				result = result *i;
			}
			return result;
		}
		
		public static void main(String[] args) {
			Calculation c = new Calculation();
			System.out.println(c.add(11,22));
			System.out.println(c.add(1,2,3,4));
			System.out.println(c.add(4,5,1));
			System.out.println(c.multiply(4,5));
		}


}
