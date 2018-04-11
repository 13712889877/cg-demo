package com.cg.foreach;

public class WhileLoop {
	public static void main(String[] args) {
		/*
		 * System.out.println("我准备无限循环"); }
		 */
		/*
		 * String a = "我在无限循环"; int i = 5;
		 * 
		 * while (true) { System.out.println(a);
		 * 
		 * }
		 */
		String b = "我在无限循环而且不一样";

		int k = 0;
		// 判断是否正确.
		while (true) {
			System.out.println(k + b);
			k++;
		}
	}
}
