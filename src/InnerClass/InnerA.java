package InnerClass;

public class InnerA {

    /*
    *
    * 可以使用内部类来变相实现多重继承
    *
    * */


    public static void main(String[] args) {
        A a=new A();
        a.testB();
        a.testC();
    }

}


class A{

    public void  testB()
    {
        new InnerB().testB();
    }
    public void  testC()
    {
        new InnerC().testC();
    }

    private class InnerB extends B
        {
            @Override
            public void testB() {
                System.out.println("这是重写之后的testB方法");
            }
        }

    private class InnerC extends C
    {
        @Override
        public void testC() {
            System.out.println("这是重写之后的testC方法");
        }
    }

}


class B {
    public void testB()
    {

    }
}

class  C {
    public void testC()
    {

    }

}