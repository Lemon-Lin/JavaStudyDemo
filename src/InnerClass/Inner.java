package InnerClass;

public class Inner {

    /*
    *
    * 内部类的用法
    *
    * 内部类的用途:   内部类主要是解决java不能多重继承的问题
    *
    *
    * */

    int i;
    public int z;
    private int k;

    class A{
        int i;
        public void  setTestFiled()
        {
            Inner.this.i=1;
            Inner.this.k=2;
            Inner.this.z=3;
        }

        public void  set()
        {
            this.i=10;
        }
    }

    public void setInfo()
    {
        new A().setTestFiled();
    }

    public void showInfo()
    {
        System.out.println(this.i);
        System.out.println(this.k);
        System.out.println(this.z);

    }

    public static void main(String[] args) {
        Inner inner=new Inner();
        inner.setInfo();
        inner.showInfo();
    }

}
