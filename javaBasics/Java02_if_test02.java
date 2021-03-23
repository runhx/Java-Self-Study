package javaBasics;

import java.util.Scanner;

public class Java02_if_test02 {
	public static void main(String[] args) {
		
		Scanner scanner =new Scanner(System.in);
		int num1 = scanner.nextInt();
		System.out.println(num1);
		
		
		System.out.println("请输入第一个整数");
		System.out.println("请输入第二个整数");
		int num2 = scanner.nextInt();
		System.out.println("请输入第三个整数");
		int num3 = scanner.nextInt();
		
		if (num1>num2 && num1>num3) {
			System.out.println("最大值为: "+num1);
		}else if (num2 >num1 && num2>num3) {
			System.out.println("最大值为: "+num2);
		}else {
			System.out.println("最大值为: "+num3);
		}
				
	}
}

