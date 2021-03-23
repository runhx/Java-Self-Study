package javaBasics;

public class Java05_while_learn {

	public static void main(String[] args) {
		
		//用WHILE输出水仙花数
		// 输出所有三位数的水仙花数-->153=1*1*1+5*5*5+3*3*3
		int i = 1;
		while (i<=9) {
			int j = 1;
			while (j<=9) {
				int k = 1;
				while (k<=9) {
					if (i*i*i+j*j*j+k*k*k==i*100+j*10+k) {
						System.out.println(i*100+j*10+k);
					}			
					k++;//System.out.println("k= "+k);
				}
				j++;//System.out.println("j= "+j);
			}
			i++;//System.out.println("i= "+i);
		}
		
		
		//遍历100内的偶数
		int oushu = 0;
		while (oushu<=100) {
			if (oushu%2==0) {
				System.out.println(oushu);
			}
			oushu++;
		}
	}
}


