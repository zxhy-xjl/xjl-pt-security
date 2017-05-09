package com.xjl.pt.security;

import org.junit.Test;

public class CoderTest {
	@Test
	public void password(){
		Coder coder = new Coder();
		String pwd = coder.password("abc", "123");
		String pwd2 = coder.password("abc1", "23");
		System.out.println("pwd:" + pwd);
		System.out.println("pwd2:" + pwd2);
		System.out.println(pwd.equals(pwd2));
	}
}
