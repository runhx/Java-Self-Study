package lock_Dead_Test;

import java.util.concurrent.locks.ReentrantLock;

/**
 *  解决线程安全问题的方式三:　lock锁　————> JDK5.0新增
 *  1. 面试题： synchronized 与 lock 的异同
 *    相同： 二者都可以解决线程安全问题
 *    不同： synchronized--->在执行完同步代码块之后，自动释放同步监视器
 *          lock-->需要手动的启动同步lock()  手动的关闭同步unlock()
 *
 *    二者如何选择---->lock-->同步代码块-->同步方法
 *
 *  2.解决线程安全问题的方式：
 *          1.lock 2.同步代码块 3.同步方法
 *
 * @author shkstart @create 2021-03-20 17:12
 */
public class LockTest {
    public static void main(String[] args) {
        window w = new window();

        Thread t1 = new Thread(w);
        Thread t2 = new Thread(w);
        Thread t3 = new Thread(w);

        t1.setName("窗口一");
        t2.setName("窗口二");
        t3.setName("窗口三");

        t1.start();
        t2.start();
        t3.start();
    }
}
class window implements Runnable{

    private int tickets = 100;
    //1.实例化 ReentrantLock
    private ReentrantLock lock=new ReentrantLock(true);

    @Override
    public void run() {
        while (true){
            try {
                //2.调用lock()
                lock.lock();

                if (tickets>0){
                    System.out.println(Thread.currentThread().getName()+"卖票，票号为："+tickets);
                    tickets--;
                }else {
                    break;
                }
            }finally {
                //3. 调用解锁方法： unlock()
                lock.unlock();
            }

        }
    }
}