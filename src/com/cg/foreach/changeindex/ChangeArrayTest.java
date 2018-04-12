package com.cg.foreach.changeindex;

public class ChangeArrayTest<E> {

	/*
	 * public static void main(String[] args) {
	 * 
	 * /* int[] list = new int[]{ 1, 2, 3, 4, 5 }; for (int i = 0; i <
	 * list.length;i++) {
	 * 
	 * int start = list[0]; //1
	 * 
	 * list[0] = list[list.length - 1]; list[list.length - 1] = start; }
	 * 
	 * for (int x = 0; x < list.length; x++) { System.out.println(list[x]); }
	 */
	/*
	 * int[] list = new int[] { 8, 4, 69, 4, 2, 3, 7 }; for (int i = 0; i <
	 * list.length; i++) { int start = list[0]; list[0] = list[list.length - 1];
	 * list[list.length - 1] = start; } for (int x = 0; x < list.length; x++) {
	 * System.out.println(list[x]);
	 * 
	 * } }
	 */
	public static void main(String[] args) {

	}

	private int size;// 记录新队列长度
	private Object[] src = new Object[0];

	public void add(E e) {
		Object[]  newsrc = new Object[src.length+1];//创建一个比原来数组长度长1的数组
		
		newsrc[src.length]=e;//将新对象存入新数组末端
		for(int i=0;i<src.length;i++) {
			newsrc[i]=src[i];//将原数组内容存入新数组
		}//将原数组地址指向新数组
		src=newsrc;
		size++;



	}

}
