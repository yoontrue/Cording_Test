package com.yoontrue.kim;

public class Greedy {
	public static void main(String[] args) {
		String name = "JAN";
		int answer = 0;
		
		// 상하이동
		for(int i=0;i<name.length();i++) {
			char tmp = name.charAt(i);
			if(tmp <= 'N') {
				answer += tmp - 65;
			} else {
				answer += ('Z' + 1) - tmp;
			}
		}
		
		
		// 좌우이동
		for(int i=0;i<name.length();i++) {
			if('A' == name.charAt(name.length())) {
				
			}
		}
		
		
		
		System.out.println("답>>>>"+answer);
	}
}
