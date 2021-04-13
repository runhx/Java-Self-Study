package TimeAPI;

import org.testng.annotations.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * JDK8之前日期和时间的API测试
 * 1.System 类中的 currentTimeMillis
 * 2.java.util.Date类
 * 3.SimpleDateFormat的使用
 *
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
    public void test2() {
        //构造器一:
        Date date1 = new Date();
        System.out.println(date1);//Thu Apr 01 15:18:25 GMT+08:00 2021
    }

    /**
     * SimpleDateFormat的使用 : SimpleDateFormat对日期 date类的格式化和解析
     * 1.两个操作:
     * 1.格式化: 日期---> 字符串
     * 2.解析: 格式化的逆过程,字符串 ---> 日期
     * <p>
     * 2.SimpleDateFormat的实例化
     */
    @Test
    public void test3() throws ParseException {
        //实例化
        SimpleDateFormat sdf = new SimpleDateFormat();
        //1.格式化: 日期---> 字符串
        Date date = new Date();
        System.out.println(date);

        String format = sdf.format(date);
        System.out.println(format);

        //解析: 格式化的逆过程,字符串 ---> 日期
        String str = " 21-4-9 下午4:50 ";
        Date parse = sdf.parse(str);
        System.out.println(parse);

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        sdf.format(parse);
        System.out.println(parse);
    }

    //java.util.calender日历类

    @Test
    public void test4() {
        //1. 实例化
        //方式一: 创建其子类(GregorianCalendar)的对象-->不常用
        //方式二: 调用它的静态方法--> 一般用这个
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getClass());
        //2. 常用方法
        //get()
        int day0 = calendar.get(Calendar.DAY_OF_MONTH); //获取这个月的第几天
        int day1 = calendar.get(Calendar.DAY_OF_YEAR); //获取这个年的第几天
        int day2 = calendar.get(Calendar.DAY_OF_WEEK); //获取这个周的第几天
        System.out.println("今天是这月的第" + day0 + "天");
        System.out.println("今天是这年的第" + day1 + "天");
        System.out.println("今天是这周的第" + day2 + "天");

        //set()
        calendar.set(Calendar.DAY_OF_MONTH, 22);//更改当前月份的第几天为 --> 指定值
        day0 = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(day0);
        //add()
        calendar.set(Calendar.DAY_OF_MONTH, 22);//更改当前月份的第几天为 --> 指定值
        day0 = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(day0);
        //getTime()
        /*calendar.getTime();
        //setTime()
        //calendar.setTime();
         */
    }
}