package src.TreadTest;

/**
 * Thread 练习
 * 例子: 创建三个窗口卖票,总票数为100张--------->使用继承Thread的方式
 * 问题大致解决就但是存在线程安全问题
 *
 * @author shkstart
 * @create 2021-03-14 16:49
 */

class window extends Thread {
    private static int ticket = 100;

    @Override
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

public class WindowTest {
    public static void main(String[] args) {
        window w1 = new window();
        window w2 = new window();
        window w3 = new window();

        w1.setName("窗口1");
        w2.setName("窗口2");
        w3.setName("窗口3");

        w1.start();
        w2.start();
        w3.start();
    }
}
