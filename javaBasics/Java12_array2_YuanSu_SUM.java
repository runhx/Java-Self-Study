package javaBasics;

public class Java12_array2_YuanSu_SUM {
	
	public static void main(String[] args) {
		
		
		//求arr数组中的所有元素和{{3,5,8},{12,9},{7,0,6,4}}
		int[][] arr = new int[][] {{3,5,8},{12,9},{7,0,6,4}};
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				sum +=arr[i][j];
			}
		}
			System.out.println("arr数组中元素的总和为: "+sum);
	}
}
