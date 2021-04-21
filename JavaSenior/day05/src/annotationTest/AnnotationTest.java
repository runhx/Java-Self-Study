package annotationTest;

/**
 *
 * 一.注解的使用:
 *      1.jdk5.0新增功能
 *      2.Annotation --->代码中的特殊标记,在编译,类加载,运行时被读取,并执行相应处理
 *               可以在不改变原有逻辑的情况下,在源文件中嵌入一些补充信息
 *      3.在javase中目的简单: 标记过时的功能,忽略警告
 *           在框架中非常重要--->框架 = 注解 + 反射 + 设计模式
 *
 * 二.Annotation的使用示例:
 *      示例一 : 生成文档相关的注解
 *
 *      示例二 : 在编译时进行格式检查(JDK内置的三种基本注解)
 *              @Override: 限定重写父类方法,只能用于方法
 *              @deprecated: 用于表示修饰的元素(类,方法)已经过时.--->通常因为存在更好的选择
 *              @SupperessWarnings: 抑制编译器警告
 *      示例三 :跟踪代码依赖性,实现替代配置文件的功能
 *
 * 三.自定义注解: 参照 @SupperessWarnings: 定义
 *      而无法的人注解声明为: @interface
 *      内部定义成员,通常使用 value 表示
 *      可以指定成员的默认值, 使用 default 定义
 *      如果自定义注解没有成员,表明是一个标识作用;
 *
 *          如果注解有成员,在使用注解时,要指明成员的值
 *          自定义的注解必须配上注解的信息处理流程(使用反射)才有意义
 *四,原注解
 * @author shkstart @create 2021-04-21 16:47
 */
public class AnnotationTest {
}
class Person{
    private String name;
    private int age;

    public void person(){

    }
    public void person(String name,int age){
        this.age = age;
        this.name = name;
    }
//@MyAnnotation(value = "hellow")//
    public void walk(){
        System.out.println("人走~");
    }
    public void eat(){
        System.out.println("人吃~");
    }
    public void run(){
        System.out.println("人跑~");
    }
}
class student extends Person{
    @Override
    //
    public void walk() {
        System.out.println("学生走!!!");
    }
}
