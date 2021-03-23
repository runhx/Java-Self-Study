package javaBasics;

public class Java09_Break_continue {


	
	public static void main(String[] args) {
		// 打出质数
		long start = System.currentTimeMillis();
		
		
		Flag:for (int i = 2; i <= 100; i++) {
			
			for (int j = 2; j < Math.sqrt(i); j++) {
				
				if (i % j == 0) {
					continue Flag; 
				}
			}System.out.println(i);
		}
		
		
		long end = System.currentTimeMillis();
		System.out.println("运行时长为: "+(end-start));
	}
}
