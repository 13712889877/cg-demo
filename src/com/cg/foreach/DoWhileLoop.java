package com.cg.foreach;

public class DoWhileLoop {
	public static void main(String[] args) {
		String t = "我也在无限循环";
		int v = -1;
		
		 do { System.out.println(t); v++; } while (v > 0);
		 
		// 无论while判断正确与否结果都将执行一次.
		do {
			System.out.println(t);
		} while (v < 0);

		
	}
}
