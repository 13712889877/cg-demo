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

	private int size;// ��¼�¶��г���
	private Object[] src = new Object[0];

	public void add(E e) {
		Object[]  newsrc = new Object[src.length+1];//����һ����ԭ�����鳤�ȳ�1������
		
		newsrc[src.length]=e;//���¶������������ĩ��
		for(int i=0;i<src.length;i++) {
			newsrc[i]=src[i];//��ԭ�������ݴ���������
		}//��ԭ�����ַָ��������
		src=newsrc;
		size++;



	}

}
