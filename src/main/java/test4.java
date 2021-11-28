/**
 * Project name(项目名称)：线程操作
 * Package(包名): PACKAGE_NAME
 * Class(类名): test4
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2021/11/28
 * Time(创建时间)： 22:53
 * Version(版本): 1.0
 * Description(描述)： 后台线程
 * 在 Java 程序中，只要前台有一个线程在运行，则整个 Java 进程都不会消失，所以此时可以设置一个后台线程，
 * 这样即使 Java 线程结束了，此后台线程依然会继续执行，要想实现这样的操作，直接使用 setDaemon() 方法即可。
 */


class MyThread3 implements Runnable
{
    public void run()
    {
        while (true)
        {
            System.out.println(Thread.currentThread().getName() + "在运行。");
        }
    }
};

public class test4
{
    public static void main(String[] args)
    {
        MyThread3 mt = new MyThread3();
        Thread t = new Thread(mt, "线程1");
        System.out.println("id:"+t.getId());
        t.setDaemon(true); //此线程在后台运行
        t.start(); // 启动线程
        try
        {
            Thread.sleep(1);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}
