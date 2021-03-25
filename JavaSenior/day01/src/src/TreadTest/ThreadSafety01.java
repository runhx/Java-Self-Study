package src.TreadTest;

/**
 *
 * 问题: 卖票过程中 出现了重票,错票------->出现了线程的安全问题
 * 问题出现的原因:　当某个线程操作车票过程中，尚未完成操作时，其他线程参与进来也操作车票
 * 如何解决：　当一个线程Ａ在操作共享资源（ticket）时其他线程不能参与进来，直到Ａ操作结束，其他线程才可以开始
 *          　操作 这种情况即使Ａ出现了阻塞也不能被改变
 * java中通过同步机制，来解决线程的安全问题
 *
 *  解决方式一：　同步代码块
 *              　synchronized(同步监视器){
 *                  被同步的代码----->操作共享数据的代码
 *                  共享数据： 多个1线程共同操作的变量----->本题的ticket
 *                  同步监视器： 俗称锁 ----->任何一个类的对象都可以充当锁要求多个线程必须共用同一把锁-->
 *                              可以用当前对象this
 *                 }
 *  解决方式二：同步方法
 *
 * 同步方式 解决了现成的安全问题-->好处
 * 操作同步代码时，只有一个线程参与其他线程等待，相当于是一个单线程的·过程，降低效率-->局限性
 *
 * @author shkstart @create 2021-03-18 16:37
 * 使用实现的方式卖票
 */
public class ThreadSafety01 {
    public static void main(String[] args) {
        Ticket_sales01 w1 = new Ticket_sales01();

        Thread t1 = new Thread(w1);
        Thread t2 = new Thread(w1);
        Thread t3 = new Thread(w1);

        t1.setName("窗口一");
        t2.setName("窗口二");
        t3.setName("窗口三");

        t1.start();
        t2.start();
        t3.start();
    }
}

class Ticket_sales01 implements Runnable {
    private static int ticket = 100;
    Object obj = new Object();
    @Override
    public void run() {//synchronized直接放到void前也行
        while (true) {
            synchronized (this){// 此时this：唯一的window01的对象  方式二： synchronized (obj){
                if (ticket > 0) {
                    System.out.println(Thread.currentThread().getName() + ": 卖票,当前票号为: " + ticket);
                    ticket--;
                } else {
                    break;
                }
            }
        }
    }
}


