package javaBasics;
import java.util.Arrays;
/*
 * java.util.Arrys:操作数组的工具类,里边定义了很多操作数组的方法
 */
public class Java13_ArryTest {
	public static void main(String[] args) {
		
		//1.boolean  equals(int[]a,int[]b)//判断两个数组是否相等
		int[] arr1 = new int[] {1,2,3,4};
		int[] arr2 = new int[] {1,3,2,4};
		boolean isEquals = Arrays.equals(arr1, arr1);
		//2.Arrays.toString(arr2)//输出数组
		System.out.println(Arrays.toString(arr2));
		
		//3.Arrays.fill(a, val);//将指定值填充到数组中-->将数组中所有元素替换为你定义的数
		Arrays.fill(arr1, 10);
		System.out.println(Arrays.toString(arr1));
		
		//4.Arrays.sort(arr2);//对数组元素排序
		Arrays.sort(arr2);
		System.out.println(Arrays.toString(arr2));
		
		//5.
		int[] arr3 = new int[] {-21 ,1 ,12 ,1,3, 34, 46, 46, 54, 56, 99 };
		int index = Arrays.binarySearch(arr3, 59);
		if (index>=0) {
			System.out.println(index);
		}else {
			System.out.println("没找到!!!!");
		}
		
		
	}
}
