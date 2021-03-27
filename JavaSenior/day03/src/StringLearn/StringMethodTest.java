package StringLearn;

import org.junit.Test;

import javax.sound.midi.Soundbank;

/**
 * @author shkstart @create 2021-03-27 12:15
 */
public class StringMethodTest {
    /**
     * string 的常用方法
     */

    @Test
    public void test1() {
        String s1 = "HelloWorld";
        System.out.println(s1.length());//返回字符串长度
        System.out.println(s1.charAt(0));//返回制定索引处的字符
        System.out.println(s1.charAt(9));

        System.out.println(s1.isEmpty());//判断输入的字符是否为空 Ture/False

        String s2 = s1.toLowerCase();//将字符串全部转化为小写
        String s3 = s1.toUpperCase();//将字符串全部转化为大写
        System.out.println("s3-->大写 :" + s3);
        System.out.println("s2-->小写 :" + s2);
        System.out.println("s1 :" + s1);//s1不可变,仍为原先的字符串

        String s4 = "  He lloW or l d  ";
        System.out.println("s4 :" + "--" + s4 + "--");
        String s5 = s4.trim();//去除首尾空格
        System.out.println("s5 :" + "--" + s5 + "--");
    }

    @Test
    public void test2() {
        String s1 = "HEllOWORLD";
        String s2 = "HelloWorld";

        System.out.println(s1.equals(s2));//比较字符串内容是否相同
        System.out.println(s1.equalsIgnoreCase(s2));//忽略大小写的 比较字符串内容是否相同

        String s3 = "abc";
        System.out.println("s3 --> :"+s3);
        String s4 = s3.concat("def");
        System.out.println("s4 --> :"+s4);

    }
}
