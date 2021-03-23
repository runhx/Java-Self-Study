package javaBasics;

import javax.security.auth.callback.LanguageCallback;

/*
 * 	类中属性的使用
 * 	属性(成员变量)  VS 局部变量
 * 	
 * 1.相同点
 * 			1.格式一样
 * 			2.先声明后使用
 * 			3.都有其作用域
 * 
 * 
 * 2.不同点
 * 			1.类中声明位置不一样
 * 			属性: 直接定义在{}内
 * 			局部变量:  声明在方法内   方法形参   代码块内  构造器形参  构造器内部变量
 * 
 * 			2.权限修饰符不同
 * 			属性; 可以在声明属性时指明其权限,使用权限修饰符.
 * 				常见的权限修饰符: private public 缺省  protected  --->封装
 * 			局部变量:  不能用
 * 			3.默认初始化值的轻狂
 * 			属性:类的属性根据其类型,都有默认初始化值
 * 					整型:(int short byte long )--->0
 * 					浮点型(double float)---->0.0
 * 					字符型(char)------>0
 *  				布尔型(boolean)---->false
 *  
 *  				引用数据类型:(类,接口,数组):null
 *			局部变量	没有初始化值 
 *					意味着:在使用局部变量之前要先赋值
 *			  		特别的:形参调用时,赋值即可
 *			4.加载位置
 *				属性:加载在堆空间	(非static)
 *				局部变量:加载在栈空间
 */
public class Java16_User {

}
class User{
	int age;//属性(成员变量)
	String nameString ;
	
	public void talk(String language) {//language  形参,局部变量
		System.out.println("我们用"+language+"交流");
	}
	public void eat() {
		String foodString = "烙饼";
		System.out.println("北方人都爱吃"+foodString);
		
	}
	
}