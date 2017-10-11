package ConstructorDemo;

public class ConstructorDemo {
    ConstructorDemo()
    {
        System.out.println("hiiii ur in default constructor");
    }
    ConstructorDemo(int i)
    {
        int n=i;
        System.out.println("print "+n);
    }

    public static void main(String[] args) {
        ConstructorDemo cd =new ConstructorDemo(9);
        ConstructorDemo c=new ConstructorDemo();


    }

}

