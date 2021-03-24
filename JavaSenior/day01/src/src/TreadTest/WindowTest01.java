package src.TreadTest;

/**
 *
 *  Thread 练习
 *  例子: 创建三个窗口卖票,总票数为100张--------->使用继承Thread的方式
 *  问题大致解决就但是存在线程安全问题
 *
 * @author shkstart @create 2021-03-14 17:44
 */
//1.创建继承Runnable的子类
class Window implements Runnable{
    private static int ticket = 100;
    @Override
    //实现run();
    public void run() {
        while (true) {
            if (ticket > 0) {
                System.out.println(Thread.currentThread().getName() + ": 卖票,当前票号为: " + ticket);
                ticket--;
            } else {
                break;
            }
        }
    }
}

public class WindowTest01 {
    public static void main(String[] args) {
        //创建继承自Runnable的类的对象
        Window w1 = new Window();
        //将此对象作为参数传递到Thread的构造器中
        Thread t1 = new Thread(w1);
        t1.setName("窗口一");
        //通过Thread类的对象调用Start()
        t1.start();

        Thread t2 = new Thread(w1);
        t2.setName("窗口二");
        t2.start();

        Thread t3 = new Thread(w1);
        t3.setName("窗口三");
        t3.start();
    }
}
