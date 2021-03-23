package javaBasics;
/*
 *  算法考察:求数值型元素中元素的最大值,最小值,平均数,总和
 * 
 * 	定义一个  int型的一维数组 包含10个元素,并随机分配随机整数
 *	求出其最大值   最小值  总和  平均数   并输出
 * 	要求:所有随机数都是两位数
 */

public class Java12_array2_test01 {
	public static void main(String[] args) {
		int[] arr = new int[10];
		int sum = 0;
		int max = 0;
		int min = 100;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 90 + 10);
			System.out.print(arr[i]+"  ");
			
			sum += arr[i];// 总和

			if (arr[i] > max) {// 最大
				max = arr[i];
			}
			if (arr[i] < min) {// 最小
				min = arr[i];
			}

		}
		System.out.println("\n");
		double average = sum / arr.length;// 平均值
		System.out.println("总和为:" + sum + "  最小值为:" + min + "  最大值为:" + max + "  平均值为:" + average);
	}
}
