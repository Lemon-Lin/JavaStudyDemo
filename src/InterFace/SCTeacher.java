package InterFace;

public class SCTeacher extends Person implements Cook,Sing {

    @Override
    public void cooking() {
        System.out.println("会做饭!");
    }

    @Override
    void showInfo() {
        System.out.println("我是人!");
    }

    @Override
    public void singing() {
        System.out.println("会唱歌!");
    }
}
