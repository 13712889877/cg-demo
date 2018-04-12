package com.cg.javabean;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class UserTest {

	
	public static void main(String[] args) {
		
		String a = "1234124123412weewfwq‡≈‡≈Œ“»•∂Ó∆Û∂ÏŒ—»Ù";
		int c = a.compareTo("1234124123412weewfwq‡≈‡≈Œ“»•∂Ó∆Û∂ÏŒ—1»Ù");
		
		List list = new LinkedList<>();//
		List list12 = new LinkedList<>();//
		String aa = "";

		User u1 = new User(3,"aad");
		
	
		
		System.out.println(	u1.name);
	
		
		new UserTest().method654123(aa,u1);
	}
	
	public Map<String,Map<String,Integer>> method654123(String sql,User wangpeng) {
		
		Map<String,Map<String,Integer>> map = new HashMap<String,Map<String,Integer>>();
		
		Map<String,Integer> map1 = new HashMap<String,Integer>();
		
		Map<String,Integer> map2 = new HashMap<String,Integer>();
		
		map.put("12", map1);
		map.put("13", map2);
		System.out.println(map2 == map1);
		Map<String,Integer> map3 = map.get("13");
		System.out.println(map3 == map2);
		
		String a = "";
		
		User u = new User();
		
		List<String> l = new ArrayList<String>();
		
		l.add(null);
		l.add(null);
		l.add("123423322332");
		l.add("256465") ;	 
		String o = l.get(2);
		
		o.toUpperCase();
		
		
		
		String a1 = o.substring(1, 5);
		boolean td=o.endsWith("4521");
		System.out.println(td);
		
		
        String ss=String.format("545", "sda");
		
		System.out.println(a1);
		boolean ss1=o.equalsIgnoreCase("5416546");
		System.out.println(ss);
		System.out.println(wangpeng.name);
		return null;
	}
}
