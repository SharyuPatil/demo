package SuperClassDemo;

public class SuperMethod {
    String name="hiiii";
    void show()
    {
        System.out.println(name);
    }
    SuperMethod()
    {
        System.out.println("ur in parent class");
    }
}
class Demo extends  SuperMethod
{
    String name="hello";

    @Override
    void show() {
        System.out.println(name);
        super.show();//if u dont use super here so its recursion goto infinte loop.
        //call super class method
    }
    Demo()
    {
        System.out.println("in second class");
    }

    public static void main(String[] args) {
        Demo d=new Demo();
        d.show();
    }
}
