package src.TreadTest;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * 创建线程的方式三: 实现Callable--->5.0新增**********************************************
 *  1. 创建一个实现 Callable 接口的实现类
 *  2.实现call方法,将此线程将要执行的操作声明在call()方法中
 *  3.创建Callable 实现类的对象
 *  4.将此Callable 实现类的对象作为参数传递到 FutureTask 构造器当中, 创建FutureTask的对象
 *  5.将FutureTask类的对象,作为参数传递到Threa类的构造器中,创建Thread的对象,并start()方法调用
 *  6.获取Callable中call的返回值***
 *
 *           @author shkstart @create 2021-03-24 10:58
 *
 * 如何理解实现Callable接口的方式创建多线程要比实现Runnable接口强大???************************
 * 1. call() 方法可以有返回值
 * 2. call(0方法可以抛出异常,可以被外面的操作捕获,获取异常的信息
 * 3. callable支持泛型
 * 4.
 */
public class ThreadLearn02 {
    public static void main(String[] args) {
        //3.创建Callable 实现类的对象
        NumThread n1= new NumThread();
        //4.将此Callable 实现类的对象作为参数传递到 FutureTask 构造器当中, 创建FutureTask的对象
        FutureTask futureTask = new FutureTask(n1);
        //5.将FutureTask类的对象,作为参数传递到Threa类的构造器中,创建Thread的对象,并start()方法调用
        new Thread(futureTask).start();

        try {
            //get()放返回值即为FutureTask构造器参数callable实现类重写的call()的返回值
            Object sum = futureTask.get();
            System.out.println("总和为: "+sum);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
//1. 创建一个实现 Callable 接口的实现类
class NumThread implements Callable {
//2.实现call方法,将此线程将要执行的操作声明在call()方法中
    @Override
    public Object call() throws Exception {
        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
                sum += i;
            }
        }
        return sum;
    }
}