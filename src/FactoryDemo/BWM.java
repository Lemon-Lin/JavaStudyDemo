package FactoryDemo;
/*
* 宝马车的产品接口
*
* */
public interface BWM {
    void showInfo();
}

class BWM3  implements BWM{
    @Override
    public void showInfo() {
        System.out.println("我是宝马3系");
    }
}
class BWM4i  implements BWM{
    @Override
    public void showInfo() {
        System.out.println("我是宝马4i系");
    }
}
class BWM5  implements BWM{
    @Override
    public void showInfo() {
        System.out.println("我是宝马5系");
    }

}