package Abstraction;

public abstract class AbstractClass
{
    abstract void call();
    abstract void msg();
    void games()
    {
        System.out.println("in games");
    }

}
class mobile extends AbstractClass
{
    void call()
    {
        System.out.println("calll");
    }

    void msg() {
        System.out.println("msg");
    }

    public static void main(String[] args) {
        AbstractClass a=new mobile();//u can creat obj of regular class with get ref from abstract class.
        a.call();
        a.games();
        a.msg();
    }
}