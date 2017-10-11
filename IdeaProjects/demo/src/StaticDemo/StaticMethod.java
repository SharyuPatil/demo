package StaticDemo;

public class StaticMethod {
    int id;
    String name;
    static String clg="engg";
    StaticMethod(int i,String  n)
    {
        id=i;
        name=n;
    }
    static void display()
    {
      clg="SETI";
    }
    void change()
    {
        System.out.println(id+" "+name+" "+clg);
    }
    public static void main(String[] args) {
        StaticMethod.display();
        StaticMethod s2=new StaticMethod(2,"abc");
        StaticMethod s3=new StaticMethod(3,"pqr");
s2.change();
s3.change();

    }
}
