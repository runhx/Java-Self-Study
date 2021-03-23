package javaBasics;
/*
 * 算法考察:数组复制
 * 
 * 
 * 	声明两个int[] 类型的两个变量数组  arr1  arr2  
 * 	arr1初始化{2,3,5,7,11,13,17,19}
 * 	显示arr1 的内容
 * 	赋值arr2变量等于arr1,修改arr2中偶数检索的元素,使其等于检索值  
 * 	shus: arr[0]=0  arr[2]=2
 */

public class Java12_array2_test02 {
	public static void main(String[] args) {
		int[] arr1 = new int[] {2,3,5,7,11,13,17,19};
		int[] arr2 = new int[8];
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i]+" ");
			if (i%2!=0) {
				arr2[i]=arr1[i];
			}
			if (i%2==0) {
				arr2[i]=i;
			}
		}System.out.println("\n");
		
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i]+" ");
		}
	}
}
