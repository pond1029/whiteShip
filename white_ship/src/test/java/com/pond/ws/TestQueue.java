/**
  * @Package : com.pond.ws
  * @FileName : TestQueue.java
  * @Date : 2020. 12. 18. 
  * @Author : "LeeJaeYeon"
  * @Version :
  * @Information :
  */

package com.pond.ws;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.pond.ws.dataStructure.MyQueue;

import lombok.extern.slf4j.Slf4j;

/**
  * @Package : com.pond.ws
  * @FileName : TestQueue.java
  * @Date : 2020. 12. 18. 
  * @Author : "LeeJaeYeon"
  * @Version :
  * @Information :
  */

@Slf4j
public class TestQueue {

	@DisplayName("입력")
	@Test
	void push() {
		MyQueue mq = new MyQueue("1");
		mq.enQueue("2");
	}
	
	@DisplayName("삭제")
	@Test
	void remove() {
		MyQueue ms = new MyQueue("1");
		ms.deQueue();
		ms.deQueue();
		ms.deQueue();		
	}
	
	@DisplayName("조회")
	@Test
	void retireve() {
		MyQueue ms = new MyQueue();
		ms.enQueue("1");
		ms.enQueue("2");
		ms.enQueue("3");
		
		while(!ms.isEmpty()) {
			log.info(ms.peek());
			ms.deQueue();
		}
		
	}
	
}
