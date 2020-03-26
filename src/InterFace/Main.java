package InterFace;

public class Main {
    public static void main(String[] args) {
        /*
         *抽象类是对于一类事物的高度抽象  其中既有属性也有方法
         * 接口是对方法的抽象 也就是一系列动作的抽象
         * 当需要对一类事物抽象类 好形成一个父类
         *
         * 当需要对一系列的动作抽象  就使用接口
         * 需要使用这些动作的类去实现相应的接口即可
         *
         * */
            SCTeacher scTeacher =new SCTeacher();
            scTeacher.showInfo();
            scTeacher.cooking();
            scTeacher.singing();

    }

}
