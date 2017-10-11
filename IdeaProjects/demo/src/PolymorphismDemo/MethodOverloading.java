package PolymorphismDemo;

public class MethodOverloading {
    void  show()
    {
        System.out.println("default");
    }
    void show(int i)
    {
        System.out.println("i para"+i);

    }
    void show(int i,int j)
    {
        System.out.println("2 para"+i +j);
    }

    public static void main(String[] args) {
        MethodOverloading m=new MethodOverloading();
        m.show();
        m.show(2);
        m.show(3,4);
    }
}
