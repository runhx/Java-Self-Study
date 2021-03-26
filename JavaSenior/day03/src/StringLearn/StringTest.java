package StringLearn;

import org.junit.Test;

/**
 * String 的使用
 * <p>
 * test1 string value值一旦定义就不会改变
 * test2 string 实例化方式:
 * test3
 * 面试题: string s = new string (" abc "); 的方式创建对象,在内存中创建了几个对象?
 * 两个: 一个是 堆空间中 new结构 创建的
 * 一个是char[] 对应常量池中的数据: "abc"
 *
 * @author shkstart @create 2021-03-25 17:49
 */
public class StringTest {
    /**
     * String: 字符串,使用一对""引起来表示
     * 1. String声明为final的不可被继承
     * 2. String实现了 Serializable 接口:  表示字符串是支持序列化的
     * 实现了 comparable 接口: 表示String可以比较大小
     * 3. 在内部定义了 final chr[] value 用于存储字符串数据
     * 4. String: 代表不可变的字符序列. 简称: 不可变性
     * <p>
     * 体现:
     * 1. 当对字符串重新负值时,需要重写指定内存区域赋值,不能使用原有的Value赋值
     * 2. 在现有的字符串后拼接一些字符 也要新建,不能在原有Value上更改
     * 3. 当调用string的 replace()方法  修改指定的  字符 或 字符串时 不能在原有Value上更改
     * 5. 通过字面量的方式给一个字符串赋值,此时的字符串值声明在字符串常量池当中
     * 6. 字符串常量池中不会存储两个相同内容的字符串的
     */
    @Test
    public void test1() {
        String s1 = "abc";//字面量定义方式
        String s2 = "abc";
        int i = 12;
        int i1 = 12;
        s1 = "hello";
        System.out.println(s1 == s2);
        System.out.println(i == i1);
        System.out.println("***************************************");

        String s3 = "abcd";
        s3 += "ef";//在现有的字符串后拼接一些字符 也要新建,不能在原有Value上更改
        System.out.println(s3);

        System.out.println("***************************************");
        String s4 = "abc";
        String s5 = s4.replace('a', 'm');
        System.out.println(s4);
        System.out.println(s2);
        System.out.println(s5);
    }

    /**
     * string 实例化方式:
     * 方式一: 字面量的方式
     * 方式二: 通过 new + 构造器的方式
     */
    @Test
    public void test2() {
        //1.字面量的方式赋值: 此时 s1 和 s2 的数据JAVAEE声明在方法区字符串的常量池中
        String s1 = "javaEE";
        String s2 = "javaEE";
        //2.通过 new + 构造器的方式: 此时的s3 和s4 保存的地址值,是数据在堆空间中开辟之后对应的地址值
        String s3 = new String("javaEE");
        String s4 = new String("javaEE");

        System.out.println(s1 == s2);//True
        System.out.println(s1 == s3);//False
        System.out.println(s1 == s4);//False
        System.out.println(s3 == s4);//False

        System.out.println("**************************************");
        Person p1 = new Person("Tom", 19);
        Person p2 = new Person("Tom", 19);

        System.out.println(p1.name.equals(p2.name));//True
        System.out.println(p1.name == p2.name);//True
        p1.name = "jerry";
        System.out.println(p2.name);
    }

    /**
     * 结论:
     *      用 字面量定义的 (常量 )并拼接是在常量池中进行的,常量池中不会出现相同内容的常量
     *      只要有一个是变量,该结果就在堆中
     *      如果拼接的结果调用intern()方法,返回值就在常量池中
     *
     */
    @Test
    public void test3() {
        String s1 = "javaEE";
        String s2 = "hadoop";

        String s3 = "javaEEhadoop";
        String s4 = "javaEE" + "hadoop";
        String s5 = s1 + "hadoop";
        String s6 = "javaEE" + s2;
        String s7 = s1 + s2;
        //如果拼接的结果调用intern()方法,返回值就在常量池中
        String s8 = s5.intern();

        System.out.println(s3 == s4);//T
        System.out.println(s3 == s5);//F
        System.out.println(s3 == s6);//F
        System.out.println(s5 == s6);//F
        System.out.println(s5 == s7);//F
        System.out.println(s6 == s7);//F
        System.out.println(s8 ==s3);//T
    }
}
