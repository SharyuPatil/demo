package Abstraction;

public interface InterfaceDemo
{
    void call();
    void msg();
    default void games()//u can define in interface by using default in java 8,default is access specifier
    {
        System.out.println("games");
    }
}
class mobiledemo implements InterfaceDemo
{
    @Override
    public void call() {
        System.out.println("calling...");
    }

    @Override
    public void msg() {
        System.out.println("typing...");
    }

    public static void main(String[] args) {
        InterfaceDemo m=new mobiledemo();
        m.call();
        m.msg();
        m.games();
    }
}
