package javaBasics;

import java.util.Scanner;

public class Java07_Loop_test {

	
	
	//题目:从键盘读入不确定个数的整数,并判断读入正数和负数的个数,
	//		当输入为0时程序结束
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int Positivenumber = 0;
		int negative = 0;
		System.out.println("请输入一个自然数(正负都行!!)");

		while (true) {
			int number = scanner.nextInt();
			System.out.println("请输入一个自然数(正负都行!!)");
			if (number > 0) {
				Positivenumber++;
			} else if (number < 0) {
				negative++;
			} else {
				System.out.println("game over");
				break;
			}
			
		}
		System.out.println("正数个数: " + Positivenumber);
		System.out.println("负数个数: " + negative);
	}
}


