package TryCatch;

public class Main {

//    扑抓异常
    public static void main(String[] args) {

        try {
            test();
        }catch (Exception ex)
        {
            System.out.println(ex);
        }finally {
            System.out.println("我一定被执行!");
        }
    }


    public static  void test()
    {
        String[] arg=new String[]{"1","2","3"};

        for (int i=0;i<4;i++)
        {
            System.out.println(arg[i]);
        }

    }


}
