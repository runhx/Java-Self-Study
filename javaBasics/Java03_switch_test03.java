package javaBasics;

import java.util.Scanner;

public class Java03_switch_test03 {
	//编写程序:从键盘上输入2019年的"month" 和"day" 要求输出为2019的第几天
	
	
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 System.out.println("输入年份");
		 int year = scanner.nextInt();
		 System.out.println("输入月份");
		 int month = scanner.nextInt();
		 System.out.println("输入日期");
		 int day = scanner.nextInt();	 
		 int sumDays = 0;//定义变量保存总天数
		 /*//方法一:冗余
		 switch(month) {
		 case 1:
			 sumDays = day;
			 break;
		 case 2 :
			 sumDays = day+31;
			 break;
		 case 3 :
			 sumDays = day+59;
			 break;
		 case 4 :
			 sumDays = day+90;
			 break;
		 case 5 :
			 sumDays = day+120;
			 break;
		 case 6 :
			 sumDays = day+151;
			 break;
		 case 7 :
			 sumDays = day+181;
			 break;
		 case 8 :
			 sumDays = day+212;
			 break;
		 case 9 :
			 sumDays = day+242;
			 break;
		 case 10 :
			 sumDays = day+273;
			 break;
		 case 11 :
			 sumDays = day+303;
			 break;
		 case 12 :
			 sumDays = day+333;
			 break;
		 }
		 System.out.println("您输入的日期为2019年的第"+sumDays+"天");
		 */
		 //方法二:倒叙相加
		 //break在switch-case中可选
		 /*判断是否为闰年的标准:
		  * 1.可以被4整除,但不可以被100整除
		  * 2.可以被400整除
		  */
		 switch(month) {
		 case 12:			 
			 sumDays+=30;
		 case 11:
			 sumDays+=31;
		 case 10:
			 sumDays+=30;
		 case 9:
			 sumDays+=31;
		 case 8:
			 sumDays+=31;
		 case 7:
			 sumDays+=30;
		 case 6:
			 sumDays+=31;
		 case 5:
			 sumDays+=30;
		 case 4:
			 sumDays+=31;
		 case 3:
			 if (year%400==0|(year%4==0 && year%100!=0)) {
				sumDays+=29;
			}else {
				sumDays+=28;
			}
		 case 2:
			 sumDays+=31;
		 case 1:
			 sumDays+=day;
		 }
		 System.out.println("您输入的日期为2019年的第"+sumDays+"天");
		 
	}
}
