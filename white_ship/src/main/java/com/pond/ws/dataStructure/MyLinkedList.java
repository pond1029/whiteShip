/**
  * @Package : com.pond.ws.study
  * @FileName : MyLinkedList.java
  * @Date : 2020. 12. 17. 
  * @Author : "LeeJaeYeon"
  * @Version :
  * @Information :
  */

package com.pond.ws.dataStructure;

/**
  * @Package : com.pond.ws.study
  * @FileName : MyLinkedList.java
  * @Date : 2020. 12. 17. 
  * @Author : "LeeJaeYeon"
  * @Version :
  * @Information :
  */

public class MyLinkedList {

	private MyNode head;
		
	/**
	 * @param head
	 * @param tail
	 */
	public MyLinkedList(MyNode head) {
		this.head = head;
	}
	
	public MyLinkedList() {
	}
	
	public boolean add(MyNode node) {
		if(head == null) {
			head = node;
			return true;
		}
		MyNode lastNode = head;
		while(lastNode.link != null) {
			lastNode = lastNode.link;
		}
		lastNode.link = node;
		return true;
	}
	
	public boolean add(MyNode node, int index) {
		if(head == null) {
			head = node;
			return false;
		}
		MyNode lastNode = get(index);
		lastNode.link = node;
		return true;
	}
	
	public MyNode get(int index) {
		if(size() < index || index < 0) return null;
		
		MyNode findNode = head;
		for(int i = 0; i < index; i++) {
			findNode = findNode.link;
		}
		return findNode;		
	}
	
	public boolean remove(int index) {
		if(size() < index|| index < 0) return false;
		
		MyNode before = get(index - 1);
		MyNode current = get(index);
		MyNode next = get(index + 1);
		
		before.link = next;	
		current.link = null;
		return true;
	}
	
	public int size() {
		if(head == null) return 0;
		
		int size = 1;
		MyNode node = head;		
		while(node.link != null) {
			node = node.link;
			size++;
		}
		return size;
	}
	
}
