package javaBasics;

public class Java06_do_while_learn {
	public static void main(String[] args) {



		//用DO-WHILE输出水仙花数
		// 输出所有三位数的水仙花数-->153=1*1*1+5*5*5+3*3*3
		int i=1;
		do {
			int j=1;
			do {
				int k=1;
				do {
					if (i*i*i+j*j*j+k*k*k==i*100+j*10+k) {
						System.out.println(i*100+j*10+k);
					}
					k++;
				} while (k<=9);
				j++;
			} while (j<=9);
			i++;
		} while (i<=9);
	
	//遍历100内的偶数
		int oushu = 0;
		do {
			if (oushu%2==0) {
				System.out.println(oushu);
			}
			oushu++;
		} while (oushu<=100);
	}
}
