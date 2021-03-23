package javaBasics;
/*
 *	 类中方法的使用和声明
 * 
 * 	1.方法:描述类该有的功能
 * 	  比如:Math类:sqrt()\random()\...
 * 		Scanner类:nextXxx()...
 * 		Arrays类:sort()\binarySearch()\toString()\equal()\...
 * 		
 * 		举例:
 * 			1.public void eat() {}
 * 			2.public void sleep(int hour) {}
 * 			3.public String getName() {}
 * 			4.public String getNation(String nation) {}
 * 
 * 	2.方法的声明:-->   权限修饰符  返回值类型   方法名(形参列表){
 * 							方法体
 * 						}
 * 		注意:static,final,abstract, 来修饰的方法后面讲
 * 3.说明:
 * 			3.1关于权限修饰符:默认先都使用public
 * 				java规定4种权限修饰符:  private,public,缺省,protected --->封装再说
 * 
 * 			3.2返回值类型:有返回  VS  无返回
 * 				如果有返回值,   必须指定返回值类型.同时方法中 需要时return关键字返回指定类型的变量或常量
 * 				
 * 				如果没有返回值, 声明是使用void来表示.通常,没有返回值不用return,只表示结束此方法
 * 			
 * 
 *  		3.3我们定义是该不该有返回值?
 *  				1.题目要求
 *  				2.凭经验 
 *  		3.4方法名属于标识符,遵循标识符规则和规范
 *    		3.5形参列表:方法可以可以声明1个  0个  或多个形参
 *     			1.格式:数据类型1 形参1 ,数据类型2 形参2,....
 *       		2.定义方法时该不该定义形参?--->1题目要求2.凭经验
 *         	3.6方法体:方法功能的体现
 *      	
 *      4.return关键字的使用:
 *      	1.使用范围
 *      	2.作用: 1.结束方法
 *      		  2.针对于有返回值类型的方法,使用"return 数据"方法返回 所要的数据
 *      		  3.注意:不能声明在执行语句
 *      
 *      5.方法使用中,可以调用当前类的 属性 & 方法
 *      				特殊的:  方法A中调用方法A:递归方法.
 *      
 */
public class Java17_Customer {

}
//客户类
class Custer{
	//属性
	int age;
	String nameString ;
	//方法
	public void eat() {
		System.out.println("客户吃饭");
	}
	public void sleep(int hour) {
		System.out.println("客户休息了"+hour+"个小时");
	}
	public String getName() {
		return getName();
	}
	public String getNation(String nation) {
		String info = "我的国籍是: "+nation;
		return info;
	}
	
}
