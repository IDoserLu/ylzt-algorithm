package com.ylzt.algorithm.struct.queue;
/**
 * ������е�ʵ��
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
	 * ���
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
	 * ����
	 * @return
	 */
	public String dequeue() {
		if(head==tail) return null;
		String result=items[head];
		head++;
		return result;
	}
	
	/**
	 * ��һ����Ӳ���
	 * @param item
	 * @return
	 */
	public boolean enqueue1(String item) {
		if(tail==length) {
			if(head==0) return false;//�������ж���
			for(int i=head;i<tail;i++) {
				items[i-head]=items[i];
			}
			tail=tail-head;
			head=0;
		}
		//�������֮���ٴ����
		items[tail]=item;
		tail++;
		return true;
		
	}

}
