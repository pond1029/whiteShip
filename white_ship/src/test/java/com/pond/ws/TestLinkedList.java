/**
  * @Package : com.pond.ws
  * @FileName : TestLinkedList.java
  * @Date : 2020. 12. 17. 
  * @Author : "LeeJaeYeon"
  * @Version :
  * @Information :
  */

package com.pond.ws;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestMethodOrder;

import com.pond.ws.dataStructure.MyLinkedList;
import com.pond.ws.dataStructure.MyNode;

import lombok.extern.slf4j.Slf4j;

/**
  * @Package : com.pond.ws
  * @FileName : TestLinkedList.java
  * @Date : 2020. 12. 17. 
  * @Author : "LeeJaeYeon"
  * @Version :
  * @Information :
  */

@Slf4j
public class TestLinkedList {

	@DisplayName("초기화")
	@Test
	void init(){
		MyLinkedList mll = new MyLinkedList(new MyNode("l"));
	}

	@DisplayName("추가")
	@Test
	void add() {
		MyLinkedList mll = new MyLinkedList(new MyNode("l"));
		mll.add(new MyNode("2"));
		mll.add(new MyNode("3"));
	}
	
	@DisplayName("삭제")
	@Test
	void remove() {
		MyLinkedList mll = new MyLinkedList(new MyNode("l"));
		mll.add(new MyNode("2"));
		mll.add(new MyNode("3"));
		mll.remove(-11);
		
	}
	
	@DisplayName("조회")
	@Test
	void retrieve() {
		MyLinkedList mll = new MyLinkedList(new MyNode("l"));
		mll.add(new MyNode("2"));
		mll.add(new MyNode("3"));
		
		mll.get(-4);
		
	}
	
	void print(MyLinkedList mll) {
		for(int i = 0; i < mll.size(); i++) {
			log.info(mll.get(i).getData());
		}
	}
}
