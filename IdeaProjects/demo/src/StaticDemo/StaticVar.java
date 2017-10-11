package StaticDemo;

public class StaticVar {
    int id;
    String name;
    static String clg_nm= "SETI";
    StaticVar(int i,String n)
    {
        id=i;
        name=n;
    }
    void display()
    {
        System.out.println(id+" "+name+" "+clg_nm);
    }

    public static void main(String[] args) {
        StaticVar sv=new StaticVar(2,"sharyu");
        StaticVar sv2=new StaticVar(3,"abc");
        sv.display();
        sv2.display();


    }

}