/**
  * @Package : com.pond.ws.dataStructure
  * @FileName : MyQueue.java
  * @Date : 2020. 12. 18. 
  * @Author : "LeeJaeYeon"
  * @Version :
  * @Information :
  */

package com.pond.ws.dataStructure;

/**
  * @Package : com.pond.ws.dataStructure
  * @FileName : MyQueue.java
  * @Date : 2020. 12. 18. 
  * @Author : "LeeJaeYeon"
  * @Version :
  * @Information :
  */

public class MyQueue {

	private MyNode front;

	public MyQueue() {
		this.front = null;
	}
	
	public MyQueue(String data) {
		this.front = new MyNode(data);
	}
	
	public boolean enQueue(String data) {
		if(front == null) {
			front = new MyNode(data);
			return true;
		}

		MyNode node = front;
		while(node.link != null) {
			node = node.link;
		}
		node.link = new MyNode(data);
		return true;
	}

	public String deQueue() {
		if(front == null) {
			return null;
		}
		MyNode node = front;
		front = front.link;
		return node.getData();
	}
	
	public String peek() {
		return (front == null) ? null : front.getData();
	}
	
	public boolean isEmpty() {
		return (front == null) ? true : false;
	}
	
}
