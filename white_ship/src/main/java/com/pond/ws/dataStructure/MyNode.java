/**
  * @Package : com.pond.ws.study
  * @FileName : MyNode.java
  * @Date : 2020. 12. 17. 
  * @Author : "LeeJaeYeon"
  * @Version :
  * @Information :
  */

package com.pond.ws.dataStructure;

import lombok.Getter;
import lombok.Setter;

/**
  * @Package : com.pond.ws.study
  * @FileName : MyNode.java
  * @Date : 2020. 12. 17. 
  * @Author : "LeeJaeYeon"
  * @Version :
  * @Information :
  */

@Getter @Setter
public class MyNode {

	private String data;
	MyNode link;
	
	/**
	 * @param data
	 */
	public MyNode(String data) {
		this.data = data;
	}
	
}
