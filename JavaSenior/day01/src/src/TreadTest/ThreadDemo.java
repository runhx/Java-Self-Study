package src.TreadTest;

/**
 *  练习创建两个分线程,其中一个线程遍历100以内的偶数,其中一个遍历100以内的奇数
 *  方法一: 写两个不同的类分别重写run()
 *  方法二: 创建Thread匿名子类的方式-->见-->ThreadDemoMore
 *
 * @author shkstart @create 2021-03-14 14:34
 */
public class ThreadDemo {
    public static void main(String[] args) {
        Odd odd =new Odd();
        odd.start();
        even even =new even();
        even.start();
    }
}

class Odd extends Thread{
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i%2 !=0){
                System.out.println(Thread.currentThread().getName()+" "+i);
            }
        }
    }
}

class even extends Thread{
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 2==0){
                System.out.println(Thread.currentThread().getName()+" "+i);
            }
        }
    }
}