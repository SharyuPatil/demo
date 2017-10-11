package ThisKeyDemo;

public class Demo {
    int eid;
    String emp_nm;
    String post;
    Demo(int eid,String emp_nm,String post)
    {
        this.eid=eid;
        this.emp_nm=emp_nm;
        this.post=post;
    }//current class instance variables.
    void display()
    {
        System.out.println("empid: "+eid+"emp_nm: "+emp_nm+"post: "+post);
    }
    void a()
    {
        System.out.println("hii ur in a");
    }
    void b()
    {
        this.a();//invoke curent class method
        System.out.println("ur in b");
    }

    public static void main(String[] args) {
        Demo d=new Demo(4,"xyz","Developer");
        Demo d2=new Demo(5,"pqr","Developer");
        d.display();
        d2.display();
        d2.b();
    }
}
