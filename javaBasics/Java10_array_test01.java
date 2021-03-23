package javaBasics;

import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class Java10_array_test01 {
	public static void main(String[] args) {
		/*从键盘读入学生成绩,并输出最高分,并输出学生成绩等级
		  * 成绩>= 最高分-10 等级为 A
		  * 成绩>= 最高分-20 等级为 B
		  * 成绩>= 最高分-30 等级为 C
		  * 其他人  		 等级为 D
		  * */
		 //1.用Scanner类,读取学生个数
		 Scanner scanner = new Scanner(System.in);
		 System.out.println("请输入学生人数:  ");
		 int peosum = scanner.nextInt();//获得人数信息
		 
		 
		 //2.创建数组,储存学生成绩
		 int[]achievement = new int[peosum];//数组长度定义
		 //给数组中的元素赋值
		 System.out.println("输入"+peosum+"个成绩"); 		 
		 for (int i = 0; i <achievement.length; i++) {
			 achievement[i] = scanner.nextInt();//给数组赋值			
			}
		 //取最大值
		 int Max = 0;
		 for (int i = 0; i < achievement.length; i++) {
			 if (Max < achievement[i]) {
				 Max = achievement[i];
			 }
		 	}
		 //判断成绩等级
		 char level;
		 for (int i = 0; i < achievement.length; i++) {
			 if (Max - achievement[i]<=10) {
				level='A';
			}else if (Max - achievement[i]<=20) {
				level='B';
			}else if (Max - achievement[i]<=30) {
				level='C';
			}else {
				level='D';
			}
			 System.out.println("学生: "+i+" achievement: "+achievement[i]+" grade: "+level);
		}
	}
}
