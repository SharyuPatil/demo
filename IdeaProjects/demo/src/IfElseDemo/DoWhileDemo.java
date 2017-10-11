package IfElseDemo;

public class DoWhileDemo
{
    void getdata()
    { int i=1;
        do {
            System.out.println("i m in doWhile");
            i++;
        }while(i<=4);

    }

    public static void main(String[] args) {
        DoWhileDemo d=new DoWhileDemo();
        d.getdata();
    }
}
