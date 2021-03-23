package javaBasics;
/*
 			二维数组
		1.二维数组的声明及初始化
		2.如何调用数组指定位置的元素
		3.如何获取数组的长度
		4.如何遍历数组
		5.数组元素的默认初始化值 
		6.数组内存的解析
 */
public class Java11_array2_learn {

	public static void main(String[] args) {
		//1.二维数组的声明及初始化
		int[] arr = new int[] {1,2,3,4,5,6,7}; //一维数组
		//静态初始化
		int[][] arr1 =new int[][] {{1,2,3},{1,2,3},{1,2,3}};//二维数组
		//动态初始化
		int[][] arr2 = new int[3][2];
		int[][] arr3 = new int[3][];
		
		
		//2.如何调用数组指定位置的元素
		System.out.println(arr1[1][1]);//2
		System.out.println(arr2[1][1]);//0
		//System.out.println(arr3[1][0]);//报错-->空指针
		
		//3.获取数组的长度
		System.out.println(arr1.length);//3
		System.out.println(arr1[0].length);//3
		
		//4.如何遍历二维数组
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				System.out.print(arr[j]);
			}
			System.out.println();
		}
		
		//数组元素的默认初始化
		int arrx[][] = new int[][] {{1,2,3,4},{1,2,3,4},{1,2,3,4},{1,2,3,4}};
		System.out.println(arrx);// [[I@15db9742  -->二维数组 int 地址
		System.out.println(arrx[0]);//  [I@6d06d69c -->一维数组 int 地址
		System.out.println(arrx[0][0]);// 1
		
		int arrx1[][] =new int[4][];
		System.out.println(arrx[1]);//null -->因为内部的一维数组还没初始化 

	}
}
