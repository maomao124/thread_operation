/**
 * Project name(项目名称)：线程操作
 * Package(包名): PACKAGE_NAME
 * Class(类名): test
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2021/11/28
 * Time(创建时间)： 22:34
 * Version(版本): 1.0
 * Description(描述)： 取得和设置线程的名称
 */

class MyThread implements Runnable
{
    @Override
    public void run()
    {
        for (int i = 0; i < 3; i++)
        {
            System.out.println(Thread.currentThread().getName() + "运行, i=" + i);
        }
    }
}

public class test
{
    public static void main(String[] args)
    {
        MyThread my = new MyThread();  //定义Runnable子类对象
        new Thread(my).start();    //系统自动设置线程名称
        new Thread(my, "线程1").start();  //手工设置线程名称

    }
}
