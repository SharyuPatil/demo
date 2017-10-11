package IfElseDemo;

import java.util.Scanner;

//import static javafx.application.Platform.exit;

public class SwitchDemo {
    Scanner sc=new Scanner(System.in);
    void add(){

               System.out.println("Addition is");
    }

    void sub(){
        System.out.println("Enter first no");
        int one=sc.nextInt();
        System.out.println("Enter second no");
        int two=sc.nextInt();
        System.out.println("Substraction is"+(one-two));
    }



    public static void main(String[] args) {
        SwitchDemo sd=new SwitchDemo();


        System.out.println("Enter Your Choice");
        System.out.println("2.Add\n3.Substract");



        Scanner s=new Scanner(System.in);
        int ch=s.nextInt();

        switch (ch){
            case 2:
                sd.add();
                break;

            case 3:
                sd.sub();
                break;

            default:
                break;
        }



    }
}
