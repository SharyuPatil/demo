package StringDemo;

import java.util.Scanner;

public class UserData {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter words for count");
        String s1 = s.nextLine();

        int count = 1;
        for (int i = 0; i < (s1.length() - 1); i++) {
            if ((s1.charAt(i) == ' ')) {
                System.out.println(count);


            }
        }

    }
}
