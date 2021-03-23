package javaBasics;
public class Java12_array2_YangHuiSanJiao {
	/*
	  用二维数组 打印10行 杨辉三角
	 
	 提示:
	 	1.第一行 1 个元素,第n行n个元素
	 	2.第一行和最后一行 都是1
	 	3.从第三行开始, 对于非第一个和非最后一个元素.即:
	 		yanghui[i][j] = yanghui[i-1][j-i] + yanghui [i-i][j];
	 */
	public static void main(String[] args) {
		//1声明并初始化二维元组
		int[][] yanghui =new int[10][]; 
		
		
		//2给数组元素赋值
		for (int i = 0; i < yanghui.length; i++) {
			yanghui[i] = new int[i+1];
			//2.1给首末元素赋值
			yanghui[i][0] = yanghui[i][i] = 1; 
			//2.2给每行的非首末元素赋值
			if (i>1) {
				for (int j = 1; j < yanghui[i].length-1; j++) {
					yanghui[i][j] = yanghui[i-1][j-1] + yanghui [i-1][j];
				}
			}
		}
		
		
		
		//3.遍历二维数组
		for (int i = 0; i < yanghui.length; i++) {
			for (int j = 0; j < yanghui[i].length; j++) {
				System.out.print(yanghui[i][j]+"  ");
			}
			System.out.println();
		}
	}
}
