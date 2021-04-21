package enumerationTest;

/**
 *   一.枚举类的使用:
 *        1.枚举类的理解: 类的对象只有有限个,确定的. 我们称此类为枚举类
 *        2.当需要定义一组常量时,强烈建议使用枚举类
 *        3.如果枚举类中只有一个对象则可以作为单例模式的实现方法.
 *
 *  二.枚举类的定义:
 *       1.方式一: 5.0之前自定义枚举类
 *       1.方式`二:5.0之后可以使用enum关键字定义枚举类
 *
 *  三.Enum中的常用方法:
 *      Enum中的常用方法:
 *          1.values()方法:返回枚举类型的对象数组,可以很方便的遍历所有枚举值
 *          2.valueOf(String str): 可以把一个字符串转化为对应的枚举类对象,要求: 字符串必须是枚举类对象的名字,否则报错
 *          3.toString():返回当前枚举类对象常量的名称
 * 四.实现接口;
 *          1.实现接口,在enmu中实现抽象方法
 *          2.让枚举类的对象分别实现接口中的抽象方法--->在每个对象后{重写接口方法}
 * @author shkstart @create 2021-04-21 14:41
 */
public class SeasonTest {
    public static void main(String[] args) {
        Season spring = Season.Spring;
        System.out.println(spring.getSeasonName());
        System.out.println(spring.getSeasonDesc());
    }
}
//1.方式一: 5.0之前自定义枚举类
class Season{
    //1.声明Season对象的属性:需要用private final 修饰;
    private final String SeasonName;
    private final String SeasonDesc;
    //2.私有化类的构造器,并给对象属性赋值
    private Season(String seasonName,String seasonDesc){
        this.SeasonDesc = seasonDesc;
        this.SeasonName = seasonName;
    }
    //3.提供当前枚举类的多个对象: public static final 的
    public static final Season Spring = new Season("春天","春暖花开~");
    public static final Season Summer = new Season("夏天","冰块西瓜~");
    public static final Season Autumn = new Season("秋天","硕果磊磊~");
    public static final Season Winter = new Season("冬天","梵天飞雪~");
    //4.其他诉求1 : 获取枚举类对象属性

    public String getSeasonName() {
        return SeasonName;
    }
    public String getSeasonDesc() {
        return SeasonDesc;
    }
    //4.其他诉求2 : 提供toString()

    @Override
    public String toString() {
        return "Season{" +
                "SeasonName='" + SeasonName + '\'' +
                ", SeasonDesc='" + SeasonDesc + '\'' +
                '}';
    }

}


