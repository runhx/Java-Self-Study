package compareTest;

import org.junit.Test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

/*
 JAVA比较器
     自然排序
         Comparable 接口使用举例:
             1.像String ,包装类等实现了 Comparable接口,重写了Compare(obj)方法,给出了比较两个对象的方法
             2.像string ,包装类重写CompareTo()方法以后 ,进行了从大到小的排列
             3.重写CompareTo(obj)的规则:
                  如果当前对象this大于形参对象obj,则返回正整数
                  如果当前对象this小于形参对象obj,则返回负整数
                  如果当前对象this等于形参对象obj,则返回零
             4. 对于自定义类来说,如果需要排序,我们可以自定义类实现Comparable重写CompareTo()方法
                   CompareTo()方法中指明如何排序
     定制排序
            Comparator接口使用:
                1.背景:
                    当元素类型没有实现java.lang.comparable接口而又不方便修改代码时
                    或者实现了java.lang.comparable接口的排序规则不适合当前的操作,
                    可以考虑使用comparable的对象来排序
                2.重写compare(Object o1,Object o2)方法,比较o1 o2的大小:
                    如果返回正数 o1 > o2
                    如果返回负数 o1 < o2
                    如果返回 0 o1 = o2
    Comparable接口 与 Comparator 的对比:
            1.Comparable 接口 的方式一旦指定,能够保证Comparable接口实现类的对象在任何位置都能比较大小
            2.Comparator 接口 相当于是临时性的比较,
*/
public class CompareTest {
    @Test
    public void test01() {
        String[] arr = new String[]{"AA", "EE", "GG", "JJ", "ZZ", "DD"};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    @Test
    public void test02() {
        Goods[] goods = new Goods[6];
        goods[0] = new Goods("leioshe", 35);
        goods[1] = new Goods("xiaomi", 55);
        goods[2] = new Goods("luoji", 95);
        goods[3] = new Goods("haikou", 55);
        goods[4] = new Goods("nanshan", 57);
        goods[5] = new Goods("leishen", 65);

        Arrays.sort(goods);
        System.out.println(Arrays.toString(goods));
    }

    /*
        定制排序
            Comparator接口使用:
                1.背景:
                    当元素类型没有实现java.lang.comparable接口而又不方便修改代码时
                    或者实现了java.lang.comparable接口的排序规则不适合当前的操作,
                    可以考虑使用comparable的对象来排序
                2.重写compare(Object o1,Object o2)方法,比较o1 o2的大小:
                    如果返回正数 o1 > o2
                    如果返回负数 o1 < o2
                    如果返回 0 o1 = o2
    */
    @Test
    public void test03() {
        String[] arr = new String[]{"AA", "EE", "GG", "JJ", "ZZ", "DD"};
        Arrays.sort(arr, new Comparator() {
            //字符串从大到小排序
            @Override
            public int compare(Object o1, Object o2) {
                if (o1 instanceof String && o2 instanceof String) {
                    String s1 = (String) o1;
                    String s2 = (String) o2;
                    return -s1.compareTo(s2);
                }
//                return 0;
                throw new RuntimeException("输入的数据类型不一致");
            }
        });
        System.out.println(Arrays.toString(arr));
    }

    @Test
    public void test04() {
        Goods[] goods = new Goods[6];
        goods[0] = new Goods("leioshe", 35);
        goods[1] = new Goods("xiaomi", 55);
        goods[2] = new Goods("luoji", 95);
        goods[3] = new Goods("haikou", 55);
        goods[4] = new Goods("nanshan", 57);
        goods[5] = new Goods("leishen", 65);

        Arrays.sort(goods, new Comparator() {
            //指明商品比较大小的方式: 先按照产品名称从低到高,再按照价格从高到低排序
            @Override
            public int compare(Object o1, Object o2) {
                if (o1 instanceof Goods &&o2 instanceof Goods){
                    Goods goods1 = (Goods) o1;
                    Goods goods2 = (Goods) o2;
                    if (goods1.getName().equals(goods2.getName())){
                        return -Double.compare(goods1.getPrice(),goods2.getPrice());
                    }else {
                        //默认从低到高
                        //想要颠倒顺序--->return 后 +"-"
                        return goods1.getName().compareTo(goods2.getName());
                    }
                }
                throw new RuntimeException("数据类型不准确~");
            }
        });
        System.out.println(Arrays.toString(goods));
    }
}
