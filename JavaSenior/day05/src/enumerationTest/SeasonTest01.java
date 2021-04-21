package enumerationTest;

/**
 * 方式`二:
 * 5.0之后可以使用enum关键字定义枚举类
 * 说明: 定义的枚举类默认继承于java.lang.Enum类中
 * @author shkstart @create 2021-04-21 15:09
 */
public class SeasonTest01 {
    public static void main(String[] args) {
        season1 season1 = enumerationTest.season1.Summer;

//toString():返回当前枚举类对象常量的名称
        System.out.println("**************************");
        System.out.println(season1.toString());//Sunmmer
            //System.out.println(season1.class.getSuperclass());//继承于class java.lang.Enum

//values()方法:返回枚举类型的对象数组,可以很方便的遍历所有枚举值
        System.out.println("**************************");
        //values();
        season1[] values = enumerationTest.season1.values();
        for(int i = 0; i < values.length; i++) {
            System.out.println(values[i]);
            values[i].show();
        }

//.valueOf(String str): 可以把一个字符串转化为对应的枚举类对象,要求: 字符串必须是枚举类对象的名字,否则报错
        System.out.println("**************************");
        season1 winter = enumerationTest.season1.valueOf("winter");
        System.out.println(winter);
        winter.show();
    }
}
interface info{
    void show();
}
enum  season1 implements info{
    //提供当前枚举类的对象
    //多个对象间 以 , 隔开 最后一个对象以 ; 结尾
    Spring ("春天","春暖花开~"){
        @Override
        public void show() {
            System.out.println("这是个繁殖季节~!");
        }
    },
    Summer ("夏天","冰块西瓜~"){
        @Override
        public void show() {
            System.out.println("这是个抱冰季节~!");
        }
    },
    Autumn ("秋天","硕果磊磊~"){
        @Override
        public void show() {
            System.out.println("这是个收获季节~!");
        }
    },
    Winter ("冬天","梵天飞雪~"){
        @Override
        public void show() {
            System.out.println("这是个睡觉季节~!");
        }
    };


    //1.声明season1对象的属性:需要用private final 修饰;
    private final String season1Name;
    private final String season1Desc;
    //2.私有化类的构造器,并给对象属性赋值
    private season1(String season1Name,String season1Desc){
        this.season1Desc = season1Desc;
        this.season1Name = season1Name;
    }
    //3.提供当前枚举类的多个对象: public static final 的

    //4.其他诉求1 : 获取枚举类对象属性

    public String getseason1Name() {
        return season1Name;
    }
    public String getseason1Desc() {
        return season1Desc;
    }


    //4.其他诉求2 : 提供toString()
//    @Override
//    public String toString() {
//        return "season1{" +
//                "season1Name='" + season1Name + '\'' +
//                ", season1Desc='" + season1Desc + '\'' +
//                '}';
//    }

//@Override
//    public void show() {
//    System.out.println("这是个季节~!");
//    }
}
