//switch case demo arithmatic
package IfElseDemo;



import java.util.Scanner;

public class Switchcasedemo {
    void display(){
        System.out.println("2.add");
        System.out.println("3.sub");
        System.out.println("4.mul");
        System.out.println("5.div");
        System.out.println("6.mod");
        System.out.println("enter choice");


    Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();

        System.out.println("enter num"  );
        int b=sc.nextInt();
        System.out.println("enter num" );
        int c=sc.nextInt();


        switch (a)
        {
            case 2:
                int d=b+c;
                System.out.println("add " +d);
                break;
            case 3:
                d=b-c;
                System.out.println("sub "+d);
                break;
            case 4:
                d=b*c;
                System.out.println("mul "+d);
                break;
            case 5:
                d=b/c;
                System.out.println("div "+d);
                break;
            case 6:
                d=b%c;
                System.out.println("mod "+d);
                break;
                default:
                    System.out.println("invalid");
                    break;
        }
    }
    public static void main(String[] args) {
        Switchcasedemo s=new Switchcasedemo();
        s.display();

    }
}
