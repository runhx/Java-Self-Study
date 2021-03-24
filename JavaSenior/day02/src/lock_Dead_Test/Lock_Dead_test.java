package lock_Dead_Test;

/**
 * 线程的死锁问题:
 * 线程死锁演示
 * 1. 死锁的理解: 不同的线程分别占用对方需要的资源不放弃,都在等待对方释放自己所需的资源,
 *            就形成了线程的死锁------>死锁既不会抛异常也不会报错
 * 2.我们使用同步时避免使用死锁
 *
 * @author shkstart @create 2021-03-20 15:56
 */
public class Lock_Dead_test {
    public static void main(String[] args) {

        StringBuffer s1 = new StringBuffer();
        StringBuffer s2 = new StringBuffer();

        new Thread() {
            @Override
            public void run() {
                synchronized (s1) {
                    s1.append("a");
                    s2.append("1");

                    try {
                        Thread.sleep(1100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    synchronized (s2) {
                        s1.append("b");
                        s2.append("2");
                        System.out.println(s1);
                        System.out.println(s2);
                    }
                }
            }
        }.start();


        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (s2) {
                    s1.append("c");
                    s2.append("3");

                    try {
                        Thread.sleep(1100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    synchronized (s1) {
                        s1.append("d");
                        s2.append("4");

                        System.out.println(s1);
                        System.out.println(s2);

                    }
                }
            }
        }).start();
    }
}