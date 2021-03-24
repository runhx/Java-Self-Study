package Thread_safety_Test;

/**
 *
 *  银行有一个账户，
 *  有两个储户分别向同一个账户存3000 每次存1000 存3次 打印每次存完后的余额
 *
 * @author shkstart @create 2021-03-20 18:28
 */

class Account{
    private double balance;
    //余额
    public Account(double balance) {
        this.balance = balance;
    }
    //存钱
    public synchronized void deposit(double money){
        if (money>=0){
            balance+=money;
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"存钱成功！！ 当前余额为： "+balance);
        }else{
            System.out.println("存储值不合法");
        }
    }
}
class Customer extends Thread{
    private Account accou;

    public Customer(Account accou) {
        this.accou = accou;
    }

    @Override
    public void run() {
        for (int i = 0; i <6 ; i++) {
            accou.deposit(1000);
        }
    }
}

public class Test02 {
    public static void main(String[] args) {
        Account acct = new Account(0);

        Customer c1 = new Customer(acct);
        Customer c2 = new Customer(acct);

        c1.setName("储户一");
        c2.setName("储户二");

        c1.start();
        c2.start();

    }
}
