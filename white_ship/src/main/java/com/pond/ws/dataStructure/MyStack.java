/**
  * @Package : com.pond.ws.dataStructure
  * @FileName : MyStack.java
  * @Date : 2020. 12. 17. 
  * @Author : "LeeJaeYeon"
  * @Version :
  * @Information :
  */

package com.pond.ws.dataStructure;

/**
  * @Package : com.pond.ws.dataStructure
  * @FileName : MyStack.java
  * @Date : 2020. 12. 17. 
  * @Author : "LeeJaeYeon"
  * @Version :
  * @Information :
  */

public class MyStack {

	private MyNode front;

	public MyStack() {
		this.front = null;
	}
	public MyStack(String data) {
		this.front = new MyNode(data);
	}
	
	public String pop() {
		if(front == null) return null;
		
		MyNode popNode = front;
		front = front.link;
		return popNode.getData();
	}
	
	public boolean push(String data) {
		MyNode pushNode = new MyNode(data);
		pushNode.link = front;
		front = pushNode;
		return true;
	}
	
	public String peek() {
		if(front == null) return null;				
		return front.getData();
	}
	
	public boolean isEmpty() {
		return (front == null) ? true : false;
	}
	
}
