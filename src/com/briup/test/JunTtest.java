package com.briup.test;

import org.junit.Test;

//单元测试
public class JunTtest {
	@Test   
	//不能加参数
	public void hello() {
		try {
			int i=10/0;
			System.out.println("hello...");
		} catch (Exception e) {
			//e.printStackTrace();
		}
	}
	public void world() {
		System.out.println("world...");
	}
}
