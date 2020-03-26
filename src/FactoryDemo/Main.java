package FactoryDemo;

public class Main {

    public static void main(String[] args) {
/*
* 通过工厂把 new 对象隔离  通过产品的接口可以接受不同实际的实现 隔离   完成
*
* 不被修改接口方法被影响
*
* */

        BWM b3=new BWM3Factor().productBWM();
        b3.showInfo();

        BWM b4=new BWM4Factor().productBWM();
        b4.showInfo();

        BWM b5=new BWM5Factor().productBWM();
        b5.showInfo();
    }
}
