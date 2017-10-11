package SuperClassDemo;

public class SuperDemo {

        String name = "sharyu";

}
class  demo extends SuperDemo
{
    void setdata()
    {
        String name="hii sharyu";
        System.out.println(name);
        System.out.println(super.name);//super variable
    }


    public static void main(String[] args) {
        demo d=new demo();
        d.setdata();

}
}
