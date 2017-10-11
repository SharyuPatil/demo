package PolymorphismDemo;

public class OverridingDemo
{
    int rateOfInterest()
    {
        return 2;
    }
}
    class  sbi extends OverridingDemo
    {
    int rateOfInterest()
    {
        return  3;
    }
    }
    class  boi extends OverridingDemo
    {
        int rateOfInterest()
        {
            return 4;
        }
    }
    class  bob extends  OverridingDemo
    {
        int rateOfInterest()
        {
            return  5;
        }
    }
    class Test
    {
        public static void main(String[] args) {

            OverridingDemo o=new OverridingDemo();
            sbi s=new sbi();
            bob b=new bob();
            boi i=new boi();
            System.out.println("rate of ineterest of boi: "+i.rateOfInterest());
            System.out.println("rate of ineterest of bob: "+b.rateOfInterest());
            System.out.println("rate of ineterest of sbi: "+s.rateOfInterest());
            System.out.println("rate of ineterest of OverridingDemo: "+o.rateOfInterest());


        }
    }

