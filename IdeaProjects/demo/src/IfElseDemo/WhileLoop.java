package IfElseDemo;

public class WhileLoop {
    void showdemo()
    {
        int i=0;
        while( i<5)
        {
            System.out.println("sharyu");
            i++;
        }
    }
    void showinfinte()
    {
        int j=0;
        while(true)
        {
            System.out.println("codekul");
        }
    }//also uses one for infinte loop

    public static void main(String[] args) {
        WhileLoop w=new WhileLoop();
        w.showdemo();
        w.showinfinte();
    }
}
