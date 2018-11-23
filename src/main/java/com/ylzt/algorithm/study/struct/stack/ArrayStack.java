package com.ylzt.algorithm.study.struct.stack;
/**
 * 数组实现栈
 * @author Administrator
 *
 */
public class ArrayStack {
	private String[] items;
	private int length;
	private int top=0;
	public ArrayStack(int cap) {
		this.items=new String[cap];
		this.length=cap;
	}
	
	/**
	 * 压入操作
	 * @param item
	 * @return
	 */
	public boolean push(String item) {
		if(top==length) return false;
		items[top]=item;
		top++;
		return true;
	}
	/**
	 * 弹出操作
	 * @return
	 */
	public String pop() {
		if(top==0) return null;
		String result=items[top-1];
		top--;
		return result;
	}
    
	public static void main(String args[]) {
		ArrayStack stack=new ArrayStack(10);
		for(int i=0;i<10;i++) {
			stack.push(new Integer(i).toString());
			System.out.print(i);

		}
		System.out.println();
		for(int i=0;i<10;i++) {
			System.out.print(stack.pop());
		}
	}
}
