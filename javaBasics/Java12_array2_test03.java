package javaBasics;
/*
 * 
 * 算法的考察:数组的复制,反转,查找,(线性查找 , 二分法查找)
 * 
 * 
 */
public class Java12_array2_test03 {
	public static void main(String[] args) {
		
		String[] arr = new String[]{"AA","DD","QQ","PP","LL","XX","MM"};
		
		//数组的复制(区别于数组变量的赋值: arr1=arr)
		String[] arr1 = new String[7];
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = arr[i];
		}
		
		//数组的反转
		//方法一:
		String[] arr2 =new String[7];
		for (int i = 0; i < arr.length; i++) {
			arr2[i]=arr[(arr.length-i-1)];
			System.out.print(arr2[i]+"  ");
		}
		//方法二:****推荐
		for (int i = 0; i < arr2.length/2; i++) {
			String temp = arr[i];
			arr[i]= arr[(arr.length-i-1)];
			arr[(arr.length-i-1)] =temp;
		}
		
		//数组的查找1.2.
		//1.线性查找
		String des = "BB";
		boolean isFlag= true;
		for (int i = 0; i < arr2.length; i++) {
			if (des.equals(arr[i])) {
				System.out.println("找到了指定元素,位置为: "+i);
				isFlag =isFlag;
				break;
			}
		}
		if (isFlag) {
			System.out.println("没有找到指定元素");
		}
		
		
		//2.二分法查找:快  前提: 数组有序
		
		int[] arr3 = new int[] {1,2,3,4,5,6,7,8,9,44,88,99,101,450,550,660,790};
		
		int des1 = 445;
		int head = 0;//开始的索引
		int end = arr3.length-1;//末尾的索引
		boolean isFlag1 = true;
		while (head <= end) {
			int middle = (head+end)/2;
			if (des1 == middle) {
				System.out.println("找到了指定元素位置为:  "+middle);
				isFlag = false;
				break;
			}else if(arr3[middle]>des1) {
				end = middle-1;
			}else {
				head = middle +1;
			}
		}
		if (isFlag1) {
			System.out.println("没有找到指定元素");
		}
		
	}
}
