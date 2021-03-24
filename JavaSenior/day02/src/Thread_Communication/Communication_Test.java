package Thread_Communication;

/**
 *
 * sleep执行过后不会把锁释放
 * wait执行过后会释放锁
 * 线程的通信
 *
 *
 * 涉及到的三个方法:
 * 使用前提: 只能出现在 同步代码块 / 同步方法
 * wait();------>一旦执行此方法,当前线程进入阻塞,并释放同步监视器
 * notitfy();----->一旦执行此方法,就会唤醒被wait的一个线程,如果有多个线程被wait();就唤醒优先级高的同级随机
 * notifyall----->一旦执行此方法,会唤醒所有1被wait的线程
 *
 *
 * 说明:
 * wait(); / notitfy(); / notifyall必须使用在 同步代码块或同步方法中
 * wait(); / notitfy(); / notifyall的 调用者 必须是同步代码块或同步方法中的同步监视器
 * wait(); / notitfy(); / notifyall 定义在Object类中
 *
 * 面试题sleep　和　wait  的异同？:
 * 　相同点：都会使线程进行阻塞状态
 *   不同带：声明的位置不同  sleep:--->声明在 Thread 中
 *                         wait:---->声明在Object类中
 *          调用要求不同  sleep()可以随时调用
 *                       wait()必须使用在同步代码块 同步方法中
 *          关于是否释放同步监视器
 *                       sleep使线程阻塞的同时不会释放同步监视器
 *                       wait使线程阻塞的同时会释放同步监视器
 *
 *
 * @author shkstart @create 2021-03-20 22:59
 */
public class Communication_Test {
    public static void main(String[] args) {
        number n = new number();

        Thread t1 = new Thread(n);
        t1.setName("线程1");
        t1.start();

        Thread t2 = new Thread(n);
        t2.setName("线程2");
        t2.start();
    }
}

class number implements Runnable {
    private int sum = 1;
    @Override
    public void run() {
        while (true){
            synchronized (this) {
                //2.唤醒线程---->解除线程阻塞
                notify();
                if (sum<= 100){

                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    System.out.println(Thread.currentThread().getName()+"打印的数为: "+sum);
                    sum++;

                    try {
                        //1.使得如下调用waiit方法的线程进入阻塞
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }else {
                    break;
                }
            }
        }
    }
}
