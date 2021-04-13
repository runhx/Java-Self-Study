package otherClass;

import org.junit.Test;

/**
 * @author shkstart @create 2021-04-13 17:08
 */
public class SystemTest {
    /*
        System类
     */
    @Test
    public void test01(){
        String javaVersion = System.getProperty("java.version");
        System.out.println("java的version: "+javaVersion);

        String javaHome = System.getProperty("java.home");
        System.out.println("java的version: "+javaHome);

        String osname = System.getProperty("os.name");
        System.out.println("os的name: "+osname);

        String osversion = System.getProperty("os.version");
        System.out.println("os的version: "+osversion);

        String username = System.getProperty("user.name");
        System.out.println("user的name: "+username);

        String userHome = System.getProperty("user.home");
        System.out.println("user的Home: "+userHome);

        String userdir = System.getProperty("user.dir");
        System.out.println("user的dir: "+userdir);
    }

    /*
        Math类
     */
    @Test
    public void test02(){
        System.out.println(Math.abs(-10));//取绝对值
        System.out.println(Math.sqrt(9));//取平方根
    }
    /*
    BigInteger BigDecimal
     */
}
