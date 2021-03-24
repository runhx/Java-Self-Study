package src.TreadTest;

/**
 * 测试Thread中的常用方法
 * 1 .start(): 启用当前线程;调用当前线程的run()
 * 2. run(): 通常需要重写Thread类中的此方法,将创建的线程要执行的操作声明在run()方法中
 * 3. currentThread():静态方法,返回执行当前代码执行的线程
 * 4. getname():获取当前线程的名字
 * 5. setname():设置当前线程的名字
 * 6. yield():时放当前cpu的执行权
 * 7. join(): 在线程A中调用线程B的join(),此时线程A进入阻塞状态,直到线程B完全执行完后,
 * 线程A结束阻塞状态
 * 8. stop(): 已过时  当执行此方法时,强制结束当前线程
 * 9. sleep():让当前线程"睡眠"指定mi.在HellowThread毫秒时间内为阻塞状态
 * 10. isAlive(): 判断该线程是否还存活
 * <p>
 * ******************************************************************
 * 线程的优先级:
 * 1. MAX_PRIOITY:10
 * 2. MIN_PRIOITY:1
 * 3. NORM_PRIOITY:5--->默认优先级
 * 如何获取和设置当前线程的优先级:
 * getPRIOITY():获取线程的优先级
 * setPRIOITY():设置线程的优先级
 * 说明:高优先级的线程会抢占低优先级的执行权但是只是从概率上来讲!!!!!
 *
 * @author shkstart @create 2021-03-14 15:18
 */
public class ThreadMethodLearn {
    public static void main(String[] args) {
        //通过构造器给线程命名
        HellowThread h1 = new HellowThread("线程一");
//      h1.setName("线程一");
        h1.setPriority(Thread.MAX_PRIORITY);
        //设置分线程的优先级
        h1.start();
        //给主线程命名
        Thread.currentThread().setName("主线程");
        for (int i = 0; i < 100; i++) {
            if (i % 2 != 0) {
                System.out.println(Thread.currentThread().getName() + " " + i);
            }
            if (i == 20) {
                try {
                    h1.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

class HellowThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0)
//sleep
//                try {
//                    sleep(500);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
                System.out.println(Thread.currentThread().getName() + " " + i);
        }
//            if(i%20 == 0){
//                yield();
//            }
    }
    //通过构造器给线程命名
    public HellowThread(String name) {
        super(name);
    }
}
