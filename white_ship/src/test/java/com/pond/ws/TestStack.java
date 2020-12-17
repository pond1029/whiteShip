/**
  * @Package : com.pond.ws
  * @FileName : TestStack.java
  * @Date : 2020. 12. 17. 
  * @Author : "LeeJaeYeon"
  * @Version :
  * @Information :
  */

package com.pond.ws;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.pond.ws.dataStructure.MyStack;

import lombok.extern.slf4j.Slf4j;

/**
  * @Package : com.pond.ws
  * @FileName : TestStack.java
  * @Date : 2020. 12. 17. 
  * @Author : "LeeJaeYeon"
  * @Version :
  * @Information :
  */

@Slf4j
public class TestStack {

	@DisplayName("입력")
	@Test
	void push() {
		MyStack ms = new MyStack("1");
		ms.push("2");
	}
	
	@DisplayName("삭제")
	@Test
	void remove() {
		MyStack ms = new MyStack("1");
		ms.pop();
		ms.pop();
		ms.pop();		
	}
	
	@DisplayName("조회")
	@Test
	void retireve() {
		MyStack ms = new MyStack();
		ms.push("1");
		ms.push("2");
		ms.push("3");
		
		while(!ms.isEmpty()) {
			log.info(ms.peek());
			ms.pop();
		}
		
	}
}
