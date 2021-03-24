package Thread_safety_Test;

import java.util.concurrent.locks.ReentrantLock;

/**
 *
 * 银行有一个账户，
 * 有两个储户分别向同一个账户存3000 每次存1000 存3次 打印每次存完后的余额
 * @author shkstart @create 2021-03-20 17:58
 */
public class Teat01 {
    public static void main(String[] args) {
        depositors d = new depositors();

        Thread a1 = new Thread(d);
        a1.setName("用户一");
        a1.start();

        Thread a2 = new Thread(d);
        a2.setName("用户二");
        a2.start();
    }
}
class depositors implements Runnable{

    private int Account = 0;
    private ReentrantLock lock = new ReentrantLock(true);

    @Override
    public void run() {
        try {
            lock.lock();
            for (int i = 0; i <3 ; i++) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                Account+=1000;
                System.out.println(Thread.currentThread().getName()+"存款，当前余额为："+Account+"元");
            }
        }finally {
            lock.unlock();
        }

    }
}
