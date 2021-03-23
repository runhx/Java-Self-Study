package javaBasics;

import java.util.Scanner;

public class Java03_switch_case {
	public static void main(String[] args) {
		
		Scanner putin = new Scanner(System.in);
		System.out.println("请输入季节");
		String season = putin.next();
		switch(season) {
			case"春天":
				System.out.println("春暖花开");
				break;
			case"夏天":
				System.out.println("夏日炎炎");
				break;
			case"秋天":
				System.out.println("硕果累累");
				break;
			case"冬天":
				System.out.println("白雪皑皑");
				break;
			default:
				System.out.println("季节输入有误");
		}
	}
}

