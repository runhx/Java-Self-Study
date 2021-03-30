package StringLearn;

import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/**
 * 涉及到string类与其他结构之间的转换
 *
 * @author shkstart @create 2021-03-29 8:54
 */
public class StringTest1 {
    /**
     * string 与基本数据类型之间的转换
     * String --> 基本数据类型 , 包装类:调用包装类的静态方法ParseXxx(str)
     *
     * 基本数据类型 , 包装类 --> string 调用string重载的 Valueof(xxx)
     */
    @Test
    public void test1(){
        String s1= "123";
        int i1 = Integer.parseInt(s1);//将string --> 基本数据类型
        System.out.println(s1);
        String s2 = String.valueOf(i1);//将基本数据类型 --> string
    }

    /**
     * string 与char[]数组之间的转换
     * string --> char[] : 调用 string 的 toCharArray()
     * char[] --> string : 调用 string 的构造器
     */
    @Test
    public void test2(){
        String s1 = "abc123";//题目: a21cb3

        char[] chars = s1.toCharArray();//调用 string 的 toCharArray()
        for (int i = 1; i <3; i++) {
            char grande = chars[i];
            chars[i] = chars[5-i];
            chars[5-i] = grande;
        }
        String s3 = new String(chars);
        System.out.println(s3);

        char[] arr = new char[]{'h','e','l','l','o','w'};
        String str2 = new String(arr);//调用 string 的构造器
        System.out.println();
        System.out.println(str2);
    }


    /**
     * string 与 byte[]数组之间的转换
     * string --> byte[] : 调用 string 的 getBytes()
     * byte[] --> string : 调用 string 的构造器
     *
     *
     * 编码: 字符串 string --> 字节 byte[] (从能看的懂得-->看不懂的二进制数据)
     * 解码: 字节 byte[] --> 字符串 string (从看不懂得二进制-->看的 懂的数据)
     */
    @Test
    public void test3() throws UnsupportedEncodingException {
        String s1= "abc123上海";
        byte[] b1 = s1.getBytes();//使用默认的字符串编码集,进行转换
        System.out.println(Arrays.toString(b1));//string --> byte[]
        byte[] gbks = s1.getBytes("gbk");
        System.out.println(Arrays.toString(b1));

        String s2 = new String(b1);
        System.out.println(s2);//使用默认的字符集进行解码

        String s3 = new String(gbks);
        System.out.println(s3);//乱码---->用啥编码--用啥解码  不然会乱编码
    }
}

