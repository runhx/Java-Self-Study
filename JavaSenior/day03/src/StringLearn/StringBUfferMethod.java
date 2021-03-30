package StringLearn;

import org.junit.Test;

/**
 *
 *
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
        s1.delete(2,4);    //删除指定位置的内容
        System.out.println(s1);
        s1.replace(2,4," Hellow ");//把[start,end) 位置替换成str
        System.out.println(s1);
        s1.insert(2," false ");
        System.out.println(s1.length());

    }
}
