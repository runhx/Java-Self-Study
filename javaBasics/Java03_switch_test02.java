package javaBasics;

import java.util.Scanner;

public class Java03_switch_test02 {

	//根据指定的月份打印改月份季节
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入相应的月份");
		int season =scanner.nextInt();
		switch(season) {
		case 3:
		case 4:
		case 5:
			System.out.println("春季");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("夏季");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("秋季");
			break;
		case 12:
		case 1:
		case 2:
			System.out.println("冬季");
			break;
		}
	}
}


