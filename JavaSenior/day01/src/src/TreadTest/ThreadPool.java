package src.TreadTest;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 创建线程的方式四:  使用线程池
 *  1.提供指定线程数量的线程池
 *  2.执行指定的线程操作,需要提供实现Runnable接口或Callable接口实现类的对象
 *
 *  好处:
 *  1.提高响应速度 ( 减少创建新线程的时间 ) 降低资源消耗 ()
 *  2.降低资源消耗 ( 重复利用线程池中的线程 , 不需要每次都去创建)
 *  3.便于线程管理
 *      1.corepoolSize: 核心池大小
 *      2.maximumPoolSize: 最大线程数
 *      3.keepAliveTime: 线程没有任务时最多保持多长时间后会终止
 *
 *       //1.提供指定线程数量的线程池
 *       //2.执行指定的线程操作,需要提供实现Runnable接口或Callable接口实现类的对象
 *       //3.关闭线程池
 * @author shkstart @create 2021-03-24 17:14
 */
class NumberThread implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName()+": "+i);
            }
        }
    }
}
class NumberThread1 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 != 0) {
                System.out.println(Thread.currentThread().getName()+": "+i);
            }
        }
    }
}
public class ThreadPool {
    public static void main(String[] args) {
        //1.提供指定线程数量的线程池
        ExecutorService Service = Executors.newFixedThreadPool(10);//创建了一个线程池
        //2.执行指定的线程操作,需要提供实现Runnable接口或Callable接口实现类的对象
        Service.execute(new NumberThread());//适合使用于Runnable
        Service.execute(new NumberThread1());//适合使用于Runnable
        //Service.submit(Callable called);//适合使用与Callable
        //3.关闭线程池
        Service.shutdown();//关闭线程池
    }
}
