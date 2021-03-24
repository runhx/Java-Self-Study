package Thread_safety_Review;

/**
 *  线程的安全问题
 *  三个窗口卖票
 * @author shkstart @create 2021-03-20 12:11
 */
public class safety_Review {
    public static void main(String[] args) {
        window_list w1 = new window_list();
        Thread t1 = new Thread(w1);
        Thread t2 = new Thread(w1);
        Thread t3 = new Thread(w1);

        t1.setName("窗口一:");
        t2.setName("窗口二:");
        t3.setName("窗口三:");

        t1.start();
        t2.start();
        t3.start();
    }
}

class window_list implements Runnable {
    int tickets = 100;

    @Override
    public void run() {
        synchronized (this) {
            while (true) {
                if (tickets > 0) {
                    System.out.println(Thread.currentThread().getName() + "卖票:　票号为：" + tickets);
                    tickets--;
                } else {
                    break;
                }
            }
        }
    }
}