package com.cg.constanst.testequals;

import com.cg.javabean.User;

public class EqualsTest {

	public static void main(String[] args) {

		/*
		 * int a = 1; int b = 1; Integer ia = new Integer(1); String sa = "1"; String sb
		 * =sa; String ssa = new String("1"); String ssa1 = new String("1");
		 * System.out.println(a == ia); System.out.println(a == ia);
		 * System.out.println(sa == ssa); System.out.println(ssa == ssa1);
		 * System.out.println("sa == sb>>>"+ sa == sb);
		 * 
		 * 
		 * 
		 * System.out.println("ssa.equals(ssa1)>>>"+ssa.equals(ssa1));
		 * 
		 * User user1 = new User(55555,"¹ö¹ö¹öÎ¯2222Çü"); User user2 = new
		 * User(55555,"¹ö¹ö¹öÎ¯2222Çü");
		 * System.out.println("user1.equals(user2)"+user1.equals(user2));
		 * 
		 * }
		 * 
		 * }
		 */

		String str1 = "java";
		String str2 = "java";
		System.out.println(str1 == str2);
		 String str4= new String("java");
		   String str3 = new String("java");
		   System.out.println(str3==str4);
	}
}