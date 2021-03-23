package javaBasics;

public class Java04_for_test01 {
	
	public static void main(String[] args) {
		
		//用FOR输出水仙花数
		//输出所有三位数的水仙花数-->shus:153=1*1*1+5*5*5+3*3*3花
		for (int i = 1; i < 9; i++) {
			for (int j = 1; j < 9; j++) {
				for (int k = 1; k < 9; k++) {
					int sum = i*100+j*10+k;
					if (sum ==i*i*i+j*j*j+k*k*k) {
						System.out.println(sum);
					}System.out.println("k= "+k);
				}System.out.println("j= "+j);
			}System.out.println("i= "+i);
		}
	}
}
