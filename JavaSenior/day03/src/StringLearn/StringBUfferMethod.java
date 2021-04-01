package StringLearn;

import org.junit.Test;

/**
 *  总结: string buffer 是一个可变的字符序列
 *         增:  append(xxx)
 *         删    delete(xxx)
 *         改    setCharAt(int n , char ch ) /replace(int start, int end ,String str )
 *         查    charAt(int n )
 *         插    insert(int offset , xxx)
 *         长度   length();
 *         遍历   for + charAt() / toString
 *
 * @author shkstart @create 2021-03-29 19:12
 */
public class StringBUfferMethod {
    @Test
    public void test1 (){
        StringBuffer s1 = new StringBuffer("aaaaaaaa");
        s1.append(1);       //StringBuftter提供了很多append()方法,用于字符串拼接
        s1.append('1');
        System.out.println(s1);
//        s1.delete(2,4);    //删除指定位置的内容
        System.out.println(s1);
        s1.replace(2,4," Hellow ");  //把[start,end) 位置替换成str
        System.out.println(s1);
        s1.insert(2," false ");//在指定位置插入XXXX
        System.out.println(s1.length());
        s1.reverse();               //将字符串序列逆序
        System.out.println(s1);
       String s2 =  s1.substring(2,6);//返回从start--> end 之间的子字符串
        System.out.println(s2);

    }
}
