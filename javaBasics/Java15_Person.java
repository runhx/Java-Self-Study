package javaBasics;
/*
 * 
 *  1.设计类,其实就是设计类成员
 *  
 * 	属性  = 成员变量 = field = 域,字段
 * 	
 * 	方法 = 成员方法 = 函数 = method
 * 
 * 	创建类的对象 = 类的实例化 = 实例化类
 * 
 *	2.类和对象的使用(面向对象思想落地的实现)
 *		1.创建类,设计类成员
 *		2.创建类的对象
 *		3.通过  对象.属性 或 对象.方法 调用对象结构 
 *	3.如果创建了一个类的多个对象,则每个对象都独立拥有一套类的属性(非static)
 *
 *	4.对象的内存解析
 */
//测试类
public class Java15_Person {
	public static void main(String[] args) {
	//创建person类的对象
		Person p1 = new Person();
	//调用对象的结构: 属性,方法
		//调用属性:  对象.属性
		p1.name = "Tom";
		p1.age = 19;
		//调用方法:  对象.方法
		p1.eat();
		p1.sleep();
		p1.talk("English");
		
	}
}
class Person{
	//属性
	String name;
	int age;
	boolean isMale;
	
	//方法
	 public void eat() {
		System.out.println("可以吃饭");
	}
	 public void sleep() {
		System.out.println("可以睡觉");
	}
	 public void talk(String language) {
		System.out.println("可以说话,使用的是: "+language);
	}
}