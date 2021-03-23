package javaBasics;

import java.util.Scanner;

public class Java03_switch_test01 {
	
	//例题:对于大学生成绩大于60的,输出合格,对于小于60的输出不合格;
	//用switch-case做
	//如果swit-case结构中的多个case的执行语句相同则可以合并
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入成绩");
		int sum = scanner.nextInt();//从键盘获取成绩
		//先除10减少判断情况
		switch(sum/10) {
		case 0:
//			System.out.println("不合格");
//			break;
		case 1:
//			System.out.println("不合格");
//			break;
		case 2:
//			System.out.println("不合格");
//			break;
		case 3:
//			System.out.println("不合格");
//			break;
		case 4:
//			System.out.println("不合格");
//			break;
		case 5:
			System.out.println("不合格");
			break;
		case 6:
//			System.out.println("合格");
//			break;
		case 7:
//			System.out.println("合格");
//			break;
		case 8:
//			System.out.println("合格");
//			break;
		case 9:
//			System.out.println("合格");
//			break;
		case 10:
			System.out.println("合格");
			break;
		}
		//更优的解决方法:/60
		switch(sum/60) {
		case 0 :
			System.out.println("不及格");
			break;
		case 1 :
			System.out.println("及格");
			break;
		}
		 
	}
}
