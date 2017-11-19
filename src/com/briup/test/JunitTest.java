package com.briup.test;
import org.junit.Test;
//单元测试
public class JunitTest {
	@Test
	public void hello(){
		try {
			int i=10/0;
			System.out.println("hello.....");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Test
	public void world(){
		System.out.println("world.....");
	}
	public void test(){
		System.out.println("ddddd");
	}
}
