package TryCatch;

public class ThrowEX {

    public static void main(String[] args) {

    }

    // 抛出异常  在调用出捕获处理
//      父子继承抛出异常  子类的异常不能比父级的大
    public void A() throws Exception
    {

    }

    //手动抛出异常
    public void  B(int age) throws Exception {
        if (age<100)
        {
            System.out.println("年龄正常！");
        }else
        {
            throw new Exception("年龄异常！");
        }

    }

    //定义自己的异常类
    class MyException  extends  Exception
    {


    }

}
