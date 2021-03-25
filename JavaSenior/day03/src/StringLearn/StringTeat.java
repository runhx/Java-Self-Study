package StringLearn;

import org.junit.Test;

/**
 * String 的使用
 *
 * @author shkstart @create 2021-03-25 17:49
 */
public class StringTeat {
    /**
     * String: 字符串,使用一对""引起来表示
     * 1. String声明为final的不可被继承
     * 2. String实现了 Serializable 接口:  表示字符串是支持序列化的
     * 实现了 comparable 接口: 表示String可以比较大小
     * 3. 在内部定义了 final chr[] value 用于存储字符串数据
     * 4. String: 代表不可变的字符序列. 简称: 不可变性
     *
     *    体现:
     *       1. 当对字符串重新负值时,需要重写指定内存区域赋值,不能使用原有的Value赋值
     *       2. 在现有的字符串后拼接一些字符 也要新建,不能在原有Value上更改
     *       3. 当调用string的 replace()方法  修改指定的  字符 或 字符串时 不能在原有Value上更改
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
        String s4 ="abc";
        String s5 = s4.replace('a','m');
        System.out.println(s4);
        System.out.println(s2);
        System.out.println(s5);

    }
}
