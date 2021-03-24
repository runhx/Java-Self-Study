package Lazy_man_style;

/**
 * 使用同步机制将单例模式中的懒汉式 改写为线程安全的
 *
 * @author shkstart @create 2021-03-20 15:06
 */
public class BankTest {
}

class Bank {

    private Bank() {
    }

    private static Bank Instance = null;

    public static Bank getInstance() {
        //方式一: 效率稍差
        /*synchronized (Bank.class) {
            if (Instance == null) {
                Instance = new Bank();
            }
            return Instance;
        }*/
        //方法二  效率稍高
        if (Instance == null) {
            synchronized (Bank.class) {
                if (Instance == null) {
                    Instance = new Bank();
                }
            }
        }
        return Instance;
    }
}