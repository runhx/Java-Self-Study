package StringLearn;

import org.junit.Test;

/**
 *  stringBuffer 可变字符序列
 * @author shkstart @create 2021-03-29 11:33
 */
public class StringBufferBuliderLearn {

    /**
     * string stringBuffer stringBuilder 三者的异同? ?
     * 不同:
     * string : 不可变的字符序列
     * stringBuffer : 可变的字符序列 线程安全的 效率偏低 (如果涉及线程安全问题了,只能选他)
     * stringBuilder : 可变的字符序列 jdk5.0新增 线程安全的 效率高些 (如果不是多线程问题推荐选他)
     * 相同:
     * 都用char型数组存储
     * 
     *
     * 源码分析:
     * string s1 = new string();//new char[0]
     * string str1 = new string("abc");//new char[]{'a','b','c'}
     *
     * stringBuffer sb1 = new StringBuffer();//char[] value = new char[16];底层创建了一个长度为16的数组
     * sb1.append('a');  //value[]='a';
     * sb1.append('a');  //value[]='b';
     * stringBuffer sb1 = new StringBuffer("abc");//char[] value = new char["abc".length()+16]
     *
     * StringBuffer sb2 = new StringBuffer("abc");
     * 问题一 :System.out.println(sb2.length());//3
     * 问题二 : 扩容问题: 如果要添加的数据底层数组盛不下了 , 那就需要扩容底层数组.
     *          默认情况下,扩容为原来容量的 2倍+2,同时将原有数组的元素复制到新的数组中.
     *
     *          指导意义: 开发中建议大家使用:
     *                   stringBuffer (int capacity) 或 stringBuffer (int capacity)--> 指定容量
     */
    @Test
    public void test1(){
        StringBuffer sb1 = new StringBuffer("abc");
        sb1.setCharAt(0,'m');//直接更改sb1 不会有返回值
        System.out.println(sb1);

    }
}
