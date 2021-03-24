package src.TreadTest;

/**
 * 多线程的创建二:
 * 创建多线程方式二: 实现 Runnable接口的方式
 * 1.创建一个实现了 Runnable接口的类
 * 2.实现类去实现Runnable中的run()抽象方法
 * 3.创建实现类的对象
 * 4.将此对象作为参数传递到Thread类的构造器中,创建Thread类的的对象
 * 5.通过Thread类的对象调用Start()
 ***********************************************
 *
 * 两种创建线程的比较
 *  开发当中 优先选择runnable接口的方式
 *  原因: 1.实现的方式没有类的单继承的局限性
 *        2.实现的方式更适合来处理多个线程共享数据的情况
 *
 * 联系: 1.Thread也实现了Runnable接口
 *      2.都需要重写RUN() ,将线程要执行的逻辑声明在Run()中;
 *      
 *
 *
 * @author shkstart @create 2021-03-14 17:09
 */
//1.创建一个实现了 Runnable接口的类
class MThread implements Runnable {

    //2.实现类去实现Runnable中的run()抽象方法
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + " : " + i);
            }
        }
    }
}

public class ThreadLearn01 {
    public static void main(String[] args) {
        //3.创建实现类的对象
        MThread M1 = new MThread();
        //4.将此对象作为参数传递到Thread类的构造器中,创建Thread类的的对象
        Thread t1 = new Thread(M1);
        //5.通过Thread类的对象调用Start(): -->1.启动线程  2.调用当前线程的run()-->
        // 调用了Runnable类型的target的run方法
        t1.setName("线程一");
        t1.start();

        //再启动一个线程遍历100以内的偶数
        Thread t2 = new Thread(M1);
        t2.setName("线程二");
        t2.start();
    }
}
