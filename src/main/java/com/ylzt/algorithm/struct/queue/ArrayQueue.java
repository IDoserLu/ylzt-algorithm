package com.ylzt.algorithm.struct.queue;
/**
 * 数组队列的实现
 * @author Administrator
 *
 */
public class ArrayQueue {
	private String[] items;
	private int length;
	private int head=0;
	private int tail=0;
	
	public ArrayQueue(int capacity) {
		items=new String[capacity];
		length=capacity;
	}
	
	/**
	 * 入队
	 * @param item
	 * @return
	 */
	public boolean enqueue(String item) {
		if(tail==length) return false;
		items[tail]=item;
		tail++;
		return true;
	}
	/**
	 * 出队
	 * @return
	 */
	public String dequeue() {
		if(head==tail) return null;
		String result=items[head];
		head++;
		return result;
	}
	
	/**
	 * 另一种入队操作
	 * @param item
	 * @return
	 */
	public boolean enqueue1(String item) {
		if(tail==length) {
			if(head==0) return false;//整个队列都满
			for(int i=head;i<tail;i++) {
				items[i-head]=items[i];
			}
			tail=tail-head;
			head=0;
		}
		//数组搬完之后再次入队
		items[tail]=item;
		tail++;
		return true;
		
	}

}
