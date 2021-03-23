package javaBasics;

import java.util.Scanner;

public class Java04_for_learn {
	
	public static void main(String[] args) {
		//遍历100以内的偶数,输出所有偶数和
		int ousum = 0;
		for (int i = 0; i <= 100; i++) {
			if (i%2==0) {
				System.out.print(i+" ");
				ousum += i;
			}
		}
		System.out.println("\n"+ousum);
		
		
		//从一循环到150 每行打印一个值,3的倍数输出 foo,5的倍数输出biz,7的背书输出baz
		for (int i = 0; i <= 150; i++) {
			System.out.print(i);
			if (i%3==0) {
				System.out.print(" 3的倍数");
			} if (i%5==0) {
				System.out.print(" 5的倍数");
			} if (i%7==0) {
				System.out.print(" 7的倍数");
			}System.out.println("");
		}
		
		
		//输入两个整数M N 求其最大公约数和最小公倍数
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("输入第一个整数");
		int m = scanner.nextInt();
		System.out.println("输入第二个整数");
		int n = scanner.nextInt();
		
		//获取两个数中的最小值
		int min=(m<=n)? m:n;//用三元取最小
		for (int i = min; i > 1; i--) {
			if (m%i==0 &&  n%i==0) {
				System.out.println("最大公约数为: "+i);
				break;//一旦找到最大约数跳出
			}
		}
		
		int max = (m>=n)? m:n;//用三元取最大
		for (int j = max; j < m*n; j++) {
			if (j%m==0 && j%n==0) {
				System.out.println("最小公倍数为: "+j);
				break;
			}
		} 
		
	}
}
