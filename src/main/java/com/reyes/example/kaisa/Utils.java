package com.reyes.example.kaisa;

import java.io.FileReader;

/**
 * 懶得寫，後續再補
 * https://blog.csdn.net/weixin_38538285/article/details/107129322
 *
 */
public class Utils {
	
	public static void print(byte[] bytes) {
		StringBuilder sb = new StringBuilder();
		for (byte aByte : bytes) {
			sb.append(aByte).append(" ");
		}
		
		System.out.println("[+] [Utils] print bytes: " + sb.toString());
	}
	
	public static String file2String(String path) throws Exception {
		FileReader reader = new FileReader(path);
		char[] buffer = new char[1024];
		
		int len = -1;
		StringBuilder sb = new StringBuilder();
		while((len = reader.read(buffer)) != -1) {
			sb.append(buffer, 0, len);
		}
		
		reader.close();
		return sb.toString();
	}
	
	public static void string2File(String data, String path) {
		
	}
}
