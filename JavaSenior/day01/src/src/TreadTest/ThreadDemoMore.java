package src.TreadTest;

/**
 * 练习创建两个分线程,其中一个线程遍历100以内的偶数,其中一个遍历100以内的奇数
 * 方法二:Thread匿名子类
 *
 * @author shkstart @create 2021-03-14 15:04
 */
public class ThreadDemoMore {
    public static void main(String[] args) {
        //1.创建匿名Thread类的匿名子类对象
        new Thread() {
            @Override
            //2.重写run()方法
            public void run() {
                for (int i = 0; i < 100; i++) {
                    if (i % 2 == 0) {
                        System.out.println(Thread.currentThread().getName() + " " + i);
                    }
                }
            }
            //3.调用start()
        }.start();
        new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    if (i % 2 != 0) {
                        System.out.println(Thread.currentThread().getName() + " " + i);
                    }
                }
            }
        }.start();
    }
}
