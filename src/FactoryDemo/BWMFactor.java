package FactoryDemo;

public interface BWMFactor {
    BWM  productBWM();
}

class  BWM3Factor  implements   BWMFactor
{
    @Override
    public BWM productBWM() {
        System.out.println("生产宝马3系");
        return new BWM3();
    }
}

class  BWM4Factor  implements   BWMFactor
{
    @Override
    public BWM productBWM() {
        System.out.println("生产宝马4系");
        System.out.println("改造宝马4系");
        return new BWM4i();
    }
}

class  BWM5Factor  implements   BWMFactor
{
    @Override
    public BWM productBWM() {
        System.out.println("生产宝马5系");
        return new BWM5();
    }
}