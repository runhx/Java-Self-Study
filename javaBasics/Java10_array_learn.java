package javaBasics;

public class Java10_array_learn {
	
	//一维数组的声明和初始化	
	public static void main(String[] args) {
		//一般
		int num;//声明
		num = 10;//初始化
		int id =1001;//声明+初始化
		
		//数组的初始化
		int[]ids;//数组声明
		//1.1静态初始化: 数组的初始化和数组元素的赋值操作同时进行
		ids = new int[] {1001,1002,1003,1004};
		//1.2动态初始化: 数组的初始化和数组元素的赋值操作分开进行
		String[]names;
		names = new String[5] ;
		//总结;一旦初始化之后,数组的的长度就确定了
		
		//数组调用指定位置的元素: 通过索引的方式进行调用
		//数组的索引从0开始,到数组长度-1结束
		names[0] ="name; ";
		names[1] = "hu";
		names[2] = "xing";
		names[3] = "yao";
		names[4] = "ming";

		 
		//获取数组的长度
		//属性:length
		System.out.println(names.length);
		
		//遍历数组元素
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
		
		//5.数组元素的默认初始化值
		//数组元素是整形,初始化值: 0
		//数组元素是浮点形,初始化值: 0.0
		//数组元素是char形,初始化值: 0 或 ascll码 里边的0
		//数组元素是boolean型初始化值: false
		
		//数组类型是引用数据类型时,初始化值: null->空值
		
		int[] arr =new int[8];
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		//6.数组的内存解析
		//内存的结构:主要结构:栈(stack)  堆(heap)  方法区():  常量池  静态域
		//栈:局部变量
		//堆:new出来的结构:对象, 数组,   
		
		
		
	}
}
