package src.TreadTest;

/**
 * 多线程的创建一:
 *
 * 方式`一:继承于Tread类
 * 1.创建一个继承于Thread的子类
 * 2.重写Thread的run()方法----->将想要此线程想要做的事写在run()里边
 * 3.创建Thread的子类对象
 * 4.通过此对象调用Start() 方法
 * ******************************************重点******************************************
 * 一个线程对象只能调用一次start方法
 * 要想创建多个线程就要创建多个对象
 * @author shkstart @create 2021-03-14 12:02
 */
public class ThreadLearn{
    public static void main(String[] args) {
        //3.创建Thread的子类对象
        MyTherad t1 = new MyTherad();
        //4.通过此对象调用Start() 方法---->1.启动当前线程 2.调用当前线程的run()
        t1.start();

        //如下操作在main主线程中进行
        for (int i = 0; i < 100; i++) {
            if (i % 2 != 0) {
                System.out.println(Thread.currentThread().getName() + i);
            }
        }
    }
}

//    1.创建一个继承于Thread的子类
class MyTherad extends Thread {
    // 2.重写Thread的run方法
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
//                Thread.currentThread().getName()---->线程名
                System.out.println(Thread.currentThread().getName() + " " + i);
            }
        }
    }
}

