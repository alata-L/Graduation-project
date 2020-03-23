package com.autolight.utils;

import org.apache.shiro.crypto.hash.Md5Hash;
import org.omg.CORBA.PUBLIC_MEMBER;

public class CryptographyUtil {
	public static String MD5(String str, String salt) {
		return new Md5Hash(str,salt).toString();
	}

	public static void main(String[] args) {
		System.out.println();

	}

}
