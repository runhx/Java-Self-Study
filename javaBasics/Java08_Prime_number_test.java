package javaBasics;

import java.util.Iterator;

public class Java08_Prime_number_test {
	public static void main(String[] args) {
		
		
//		//打印九九乘法表
//		for (int i = 1; i <=9; i++) {
//			for (int j = 1; j <=i; j++) {
//				System.out.print(i+"*"+j+"= "+i*j+"  ");
//			}System.out.println("");
//		}
//		System.out.println();
//		System.out.println();
//		for (int i = 0; i <=5; i++) {
//			for (int j = 0; j <=5; j++) {
//				System.out.print("*");
//			}System.out.println();
//		}
		//100以内所有质数-->一个数除了自己和1 没有其他能除  1  2  3  5  7 
		
		long start = System.currentTimeMillis(); 
		
		boolean isFlag = true;//标识i
		for (int i = 2; i <=100; i++) {//遍历100内的数
			
			for (int j = 2; j < i; j++) {//遍历除数
				
				if (i%j==0) {
					isFlag = false;
				}	
			}
			if (isFlag == true) {
				System.out.println(i);
			}//重置isFlag,使每次重新循环使时,isFlag是ture;
			if (isFlag==false) {
				isFlag=true;
			} 
		}
		long end = System.currentTimeMillis(); 
		
		System.out.println("运行花费时间: "+(end-start));
		
		
		
	}
}
