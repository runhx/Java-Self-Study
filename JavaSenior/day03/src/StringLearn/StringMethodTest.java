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
        System.out.println("s3 --> :" + s3);
        String s4 = s3.concat("def");//链接到字符串的末尾
        System.out.println("s4 --> :" + s4);

        String s5 = "abc";
        String s6 = "abe";
        System.out.println(s5.compareTo(s6));//比较两个字符串的大小  //涉及到字符串的排序


        String s7 = "苏州经贸职业技术学院";
        String s8 = s7.substring(2, 4);//截取从所选的第一个位置到所远得最后一个位置之间的字符串--0[)
        String s9 = s7.substring(2);//截取从所选的第一个位置到最后一个位置
        System.out.println(s8);
        System.out.println(s9);
    }

    @Test
    public void test3() {

        String s1 = "HelloWorld";
        boolean b1 = s1.endsWith("ld");//判断此字符串是否以指定的后缀结束
        boolean b2 = s1.startsWith("He");//判断是否以指定前缀开始
        boolean b3 = s1.startsWith("ll", 2);//判断字符串从指定索引开始的字符串是否以指定前缀开始
        System.out.println(b1);//True
        System.out.println(b2);//True
        System.out.println(b3);//True

        String s2 = "HelloWorld";
        boolean b4 = s2.contains("lloW");//当且仅当此字符串包含指定的char值序列时,返回true
        System.out.println(b4);

        System.out.println(s2.indexOf("lo"));//返回出现该字符串的第一个索引  如果没有找到返回-1

        System.out.println(s1.indexOf("lo", 5));//查找指定位置之后的,字符串出现的位置

        //练习: 找s3中的所有lo
        String s3 = "lohdulolfgrlolofgeuygflofgeyhvglogfvyedvglohdvus";
        int isFlag = 0;
        for (int i = 0; i < s3.length(); i++) {

            if (s3.indexOf("lo") >= 0) {
                if (s3.indexOf("o", isFlag)<0){
                    break;
                }
                System.out.println(s3.indexOf("o", isFlag));
                isFlag = s3.indexOf("o", isFlag) + 2;
            } else {
                break;
            }
        }

        String s4 = "how Mandy pig in the room";
        System.out.println(s4.lastIndexOf(" th"));//从后往前找指定字符串
        System.out.println(s4.lastIndexOf(" th", 6));//从后往前的指定位置 找指定字符串
        //什么情况下 lastIndexOf 和 IndexOf 返回值相同?
        //1. 该字符串只有一个符合条件的字符
        //2. 该字符串没有符合条件的字符

    }

    @Test
    public void test4() {

    }
}
