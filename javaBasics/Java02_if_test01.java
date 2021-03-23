package javaBasics;

import java.util.Scanner;

public class Java02_if_test01 {
	
	/*小明爸爸按成绩奖励小明
	 * 100:一辆BMW
	 * 80~99:一个ipad
	 * 60~80:一部iphon
	 * 0~60:啥也不是
	 */
	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		System.out.println("输入你的成绩");
		int ach = sca.nextInt();
		if (ach>=100) {
			System.out.println("一辆BMW");
		}else if (ach>=80 && ach<=99) {
			System.out.println("一个ipad");
		}else if (ach <= 80 && ach >=60 ) {
			System.out.println("一部iphon");
		}else {
			System.out.println("啥也不是");
		}
	}
}
