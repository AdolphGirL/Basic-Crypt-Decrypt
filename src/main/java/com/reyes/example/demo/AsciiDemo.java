package com.reyes.example.demo;

public class AsciiDemo {
	
	public static void main(String[] args) {
//		字元處理
		char a = 'A';
		int a_int = a;
		
//		ascii上的數值
		System.out.println("[+] [AsciiDemo] a_int: " + a_int);
		
		
//		字串轉換
		String b = "AvB";
		for(char item : b.toCharArray()) {
			System.out.println("[+] [AsciiDemo] b_int: " + (int)(item));
		}
	}
	
}
