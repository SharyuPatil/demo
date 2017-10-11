package Recursion;

public class Exp {
    int count = 0;
    void getdata() {

        if (count <= 5) {
            System.out.println("sharyu");
            count++;
            getdata();
        }
    }

    public static void main(String[] args) {
        Exp e= new Exp();
        e.getdata();
    }
}
