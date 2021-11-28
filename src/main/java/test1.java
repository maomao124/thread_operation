/**
 * Project name(项目名称)：线程操作
 * Package(包名): PACKAGE_NAME
 * Class(类名): test1
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2021/11/28
 * Time(创建时间)： 22:40
 * Version(版本): 1.0
 * Description(描述)：
 * 在线程操作中，可以使用 join() 方法让一个线程强制运行，线程强制运行期间，其他线程无法运行，必须等待此线程完成之后才可以继续执行。
 */

class MyThread1 implements Runnable
{
    public void run()
    {
        for (int i = 0; i < 50; i++)
        {
            System.out.println(Thread.currentThread().getName() + "运行，i = " + i);
        }
    }
}

public class test1
{
    public static void main(String[] args)
    {
        MyThread1 mt = new MyThread1();  // 实例化Runnable子类对象
        Thread t = new Thread(mt, "线程");     // 实例化Thread对象
        t.start(); // 启动线程
        try
        {
            Thread.sleep(6);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        for (int i = 0; i < 200; i++)
        {
            if (i > 30)
            {
                try
                {
                    t.join();  // 线程强制运行
                }
                catch (InterruptedException e)
                {

                }
            }
            System.out.println("Main线程运行 --> " + i);
        }
    }
}
