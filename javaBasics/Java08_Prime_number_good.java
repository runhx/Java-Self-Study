package javaBasics;

public class Java08_Prime_number_good {
	public static void main(String[] args) {

		// 对Java08_Prime_number_test.java的优化
		// 100000以内所有质数-->一个数除了自己和1 没有其他能除 1 2 3 5 7

		boolean isFlag = true;// 标识i

		//获取当前时间到1970年01-01的时间
		long start = System.currentTimeMillis(); 

		for(int i = 2;i<=100;i++){// 遍历100内的数
			for (int j = 2; j <= i/*Math.sqrt(i)*/; j++) {// 遍历除数//优化二:j<根号i:对本身是质数的自然数有效

				if (i % j == 0) {
					isFlag = false;
					//break;//优化一 break:只对本身非质数的自然数有效
				}
			}
			if (isFlag == true) {
				System.out.println(i);
				
			} // 重置isFlag,使每次重新循环使时,isFlag是ture;
			if (isFlag == false) {
				isFlag = true;
			}
		}
		long end = System.currentTimeMillis(); 
		
		System.out.println("运行花费时间: "+(end-start));//不优化时间:37902->优化一:break: 3308
		//																优化二:j<根号i:208
	}
}

