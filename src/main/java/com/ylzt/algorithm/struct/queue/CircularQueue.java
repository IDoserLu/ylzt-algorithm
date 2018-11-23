package com.ylzt.algorithm.struct.queue;
/**
 * ѭ�����������ʵ��
 * @author Administrator
 *
 */
public class CircularQueue {
	private String[] items;
	private int length;
	private int head=0;
	private int tail=0;
	
	public CircularQueue(int capacity) {
		items=new String[capacity];
		length=capacity;
	}
	
	/**
	 * ���
	 * @param item
	 * @return
	 */
	public boolean enqueue(String item) {
		if((tail+1)%length==head) return false;
		items[tail]=item;
		tail=(tail+1)%length;
		return true;
	}
	/**
	 * ����
	 * @return
	 */
	public String dequeue() {
		if(head==tail) return null;
		String result=items[head];
		head=(head+1)%length;
		return result;
	}
}
