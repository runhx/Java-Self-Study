package javaBasics;
/*
 * 	数组中的常见异常
 * 	1数组角标越界java.lang.ArrayIndexOutOfBoundsException
 *	2.空指针异常: 
 * 
 */
public class Java13_ArryExceptionTest {
	public static void main(String[] args) {
		//1数组角标越界java.lang.ArrayIndexOutOfBoundsException
		int[] arr =new int[]{1,2,3,4,5,6,7,8,9,10};
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		//2.空指针异常: 
//		int[][] arr2 = new int[4][];
//		System.out.println(arr2[0][0]);
		
		String[] arr3=new String[] {"AA","BB","CC"};
		arr3[0]= null;
		System.out.println(arr3.toString());
		
	}
}
