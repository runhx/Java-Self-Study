package Thread_Test;

/**
 * 线程通信应用: 生产者/消费者 问题
 * 生产者 Producer 将生产好的产品交给店员 clerk  消费者 customer 从店员取走商品
 * 店员一次最多能拿20 个商品
 * 如果生产者想生产更多产品店员会叫生产者停一下,有位置了再生产
 * 如果店中没有商品了,店员会叫消费者定一下,等的有了商品再消费
 *
 * @author shkstart @create 2021-03-22 14:48
 */
public class ProductTest {
    public static void main(String[] args) {
        clerk clerk = new clerk();
        Producer producer = new Producer(clerk);
        producer.setName("生产者");

        customer customer = new customer(clerk);
        customer.setName("消费者");

        customer customer1 = new customer(clerk);
        customer.setName("消费者");

        producer.start();
        customer.start();
        customer1.start();

    }
}


class clerk {//店员
    private int productNum = 0;
    //生产产品
    public synchronized void produceProduct() {
        if (productNum<20){
            productNum++;
            System.out.println(Thread.currentThread().getName()+"生产第"+productNum+"个产品...");
            notify();
        }else {
            //等待
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    //消费产品
    public synchronized void consumeProduct() {
        if (productNum>0){
            System.out.println(Thread.currentThread().getName()+"生产第"+productNum+"个产品...");
            productNum--;
            notify();
        }else{
            //等待
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Producer extends Thread {//生产者
    private clerk clerk = new clerk();

    public Producer(Thread_Test.clerk clerk) {
        this.clerk = clerk;
    }

    @Override
    public void run() {
        System.out.println("生产者生产中.........");
        while (true){

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            clerk.produceProduct();
        }
    }
}

class customer extends Thread {//消费者

    private clerk clerk = new clerk();

    public customer(Thread_Test.clerk clerk) {
        this.clerk = clerk;
    }

    @Override
    public void run() {
        System.out.println("顾客购买中.........");
        while (true){

            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            clerk.consumeProduct();
        }
    }

}