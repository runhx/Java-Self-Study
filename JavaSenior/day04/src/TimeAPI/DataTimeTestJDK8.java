package TimeAPI;

import org.junit.Test;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.TemporalAccessor;
import java.util.Date;

/**
 * jdk8中日期时间API测试
 * @author shkstart @create 2021-04-12 9:01
 */
public class DataTimeTestJDK8 {
    @Test
    public void test01(){
        //偏移量
        Date date1 = new Date(2020,9,8);
        System.out.println(date1);//Fri Oct 08 00:00:00 GMT+08:00 3920
        //因为从1900年算起的事件 从1月份算起的月份,年要减去1900 月要减去1
        Date date2 = new Date(2020-1900,9-1,8);
        System.out.println(date2);//Tue Sep 08 00:00:00 GMT+08:00 2020
    }
    /**
    LocalTest, LocalTime, LocalDateTime 的使用
     */
    @Test
    public void test02(){
        /***
         * 方式一
        */
        //now() : 获取当前的 日期 时间 日期+时间
        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDate);
        System.out.println(localTime);
        System.out.println(localDateTime);

        /***
         * 方式二
         */
        //of 的方式-->设置指定的 年 月 日 时 分 秒 的时候,没有偏移量
        LocalDateTime localdateTime = LocalDateTime.of(2020, 10, 6, 13, 46, 56, 89);
        System.out.println(localdateTime);

        //getXxx();
        System.out.println(localDateTime.getMonth());
        System.out.println(localDateTime.getHour());
        System.out.println(localDateTime.getDayOfYear());
        System.out.println(localDateTime.getMinute());

        //LocalDate这一堆 体现了不可变性
        LocalDate localDate1 = localDate.withDayOfMonth(9);
        System.out.println(localDate1);
        //在当前时间的基础上添加时间
        System.out.println(localDateTime.plusHours(5));
        //在当前时间的基础上减掉时间
        System.out.println(localDateTime.minusDays(5));
    }

    /***
     * instant 的使用
     *类似于java.util.Date类
     *
     */
    @Test
    public void test03(){
        //获取本初子午线上的时间
        Instant instant = Instant.now();
        System.out.println(instant);//2021-04-12T02:26:55.506Z

        // 添加时间的偏移量
        OffsetDateTime offsetDateTime = instant.atOffset(ZoneOffset.ofHours(8));
        System.out.println(offsetDateTime);

        //获取自1970年1月1日0时0分0秒(UTC)开始的豪秒数
        long mili = instant.toEpochMilli();
        System.out.println(mili);

        //ofEpochMilli() 通过给定的毫秒数,获取Instant的实例  ---> Date(long millis)
        Instant instant1 = Instant.ofEpochMilli(1618195006243L);
        System.out.println(instant1);
    }

    /**
     * 用来格式化或解析日期或时间
     * 类似于SimpleDateFormat
     */
    @Test
    public void test04(){
     //实例化:
    //方式一: 预定义的标准格式 : 如: ISO_LOCAL_DATE_TIME;ISO_LOCAL_DATE;ISO_LOCAL_DATE
        DateTimeFormatter  formatter= DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        //格式化 : 日期-->字符串
        LocalDateTime localDateTime = LocalDateTime.now();
        String format = formatter.format(localDateTime);
        System.out.println(localDateTime);
        System.out.println(format);
        //解析: 字符串 --> 日期
        TemporalAccessor parse = formatter.parse("2021-04-12T11:28:31.273");
        System.out.println(parse);


     //方式二: 本地化相关的格式 : 如: ofLocalizedDateTime(FormatStyle.LONG)
//        DateTimeFormatter formatter1 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);//21-4-12 上午11:38
//        DateTimeFormatter formatter1 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG);//2021年4月12日 上午11时40分02秒
        DateTimeFormatter formatter1 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);//2021-4-12 11:40:29
        //格式化
        String format1 = formatter1.format(localDateTime);
        System.out.println(format1);

        //方式三: 自定义格式 : 如 ofPattern("yyyy-MM-dd hh:mm:ss E")
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("YYYY-MM-dd hh:MM:ss");
        //格式化
        String format2 = formatter2.format(LocalDateTime.now());
        System.out.println(format2);
        //解析:
        TemporalAccessor parse1 = formatter2.parse("2021-04-12 11:04:52");
        System.out.println(parse1);

    }
}
