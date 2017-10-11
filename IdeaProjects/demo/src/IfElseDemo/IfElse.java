//even odd numbers

package IfElseDemo;

import java.util.Scanner;

public class IfElse {
    void show()
    {
        System.out.println("enter number: ");
        Scanner s=new Scanner(System.in);
        int a= s.nextInt();
        if (a%2==0)
        {
            System.out.println("even number");
        }else
        {
            System.out.println("odd number");
        }
    }
    public static void main(String[] args) {
        IfElse i=new IfElse();
        i.show();
    }
}
