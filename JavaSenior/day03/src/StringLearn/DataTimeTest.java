package StringLearn;

import org.junit.Test;
import java.util.Date;

/**
 *
 * JDK8之前日期和时间的API测试
 * @author shkstart @create 2021-04-01 13:26
 */
public class DataTimeTest {
    //1.System 类中的 currentTimeMillis
    @Test
    public void test1() {
        long time = System.currentTimeMillis();
        //返回当前与1970年1.10.0.0之间以毫秒为单位的时间差
        //称为时间戳
        System.out.println(time);
    }

    /*2.java.util.Date类
            //|---Java.sql.Date类
        1.两个构造器的使用
            >构造器一: Date(); 创建一个对应当前时间的Date对像
            >构造器二: 创建指定毫秒数的Data对象

        2.两个方法的使用
            >toString() 显示当前: 年月日时分秒
            >getTime() 获取当前Date对象对应的毫秒数(时间戳)
     */
    @Test
    public void test2(){
        //构造器一:
        Date date1 = new Date();
        System.out.println(date1);//Thu Apr 01 15:18:25 GMT+08:00 2021
    }
}
