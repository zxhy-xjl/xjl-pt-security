package com.xjl.pt.security;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * 
 * @author leasonlive
 *
 */
public class Coder {
	/**
	 * 密码加密
	 * @param username 用户名称
	 * @param password 原始密码
	 * @return
	 */
	public static final String password(String username, String password){
		try {
			MessageDigest md5 = MessageDigest.getInstance("MD5");
			md5.update((username + "$$" + password).getBytes()); 
	        return new String(md5.digest());  
		} catch (NoSuchAlgorithmException e) {
			throw new RuntimeException(e);
		} 
	}

}
