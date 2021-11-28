/**
 * Project name(项目名称)：线程操作
 * Package(包名): PACKAGE_NAME
 * Class(类名): test3
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2021/11/28
 * Time(创建时间)： 22:46
 * Version(版本): 1.0
 * Description(描述)： 当一个线程运行时，另外一个线程可以直接通过interrupt()方法中断其运行状态。
 */

class MyThread2 implements Runnable
{
    public void run()
    {
        System.out.println("1、进入run()方法");
        try
        {
            Thread.sleep(10000);
            System.out.println("2、已经完成了休眠");
        }
        catch (InterruptedException e)
        {
            System.out.println("3、休眠被终止");
            return;
        }
        System.out.println("4、run()方法正常结束");
    }
};

public class test3
{
    public static void main(String[] args)
    {
        MyThread2 mt = new MyThread2();
        Thread t = new Thread(mt, "线程");
        t.start(); // 启动线程
        try
        {
            Thread.sleep(2000);
        }
        catch (InterruptedException e)
        {
            System.out.println("3、休眠被终止");
        }
        t.interrupt(); // 中断线程执行
    }
}
