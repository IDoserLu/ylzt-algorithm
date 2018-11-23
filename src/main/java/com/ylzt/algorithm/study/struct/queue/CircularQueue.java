package com.ylzt.algorithm.study.struct.queue;
/**
 * 循环队列数组的实现
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
	 * 入队
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
	 * 出队
	 * @return
	 */
	public String dequeue() {
		if(head==tail) return null;
		String result=items[head];
		head=(head+1)%length;
		return result;
	}
}
