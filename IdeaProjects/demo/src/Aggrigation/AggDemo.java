package Aggrigation;

import com.sun.jndi.cosnaming.IiopUrl;

public class AggDemo {
    int id;
    String name;
    AggDemo(int id,String name)
    {
        this.id=id;
        this.name=name;
    }
    void display()
    {
        System.out.println(id);
        System.out.println(name);
    }
}
class Student
{
    int DOB;
    String Address;
    Student(int DOB,String Address)
    {
        this.DOB=DOB;
        this.Address=Address;
    }
    void setdata()
    {
        System.out.println(DOB);
        System.out.println(Address);
    }
}
class Demo
{
    String State;
    AggDemo aggDemo;
    Student student;
    Demo(String State,AggDemo aggDemo,Student student)
    {
        this.State=State;
        this.aggDemo=aggDemo;
        this.student=student;
    }
    void displayData()
    {
        System.out.println("id: "+aggDemo.id+"\n"+"name: "+aggDemo.name+"\n"+"DOB: "+student.DOB+"\n"+"Address: "+student.Address+"\n"+"State: "+State);
    }

    public static void main(String[] args) {
        AggDemo a=new AggDemo(2,"abc");
        Student s= new Student(3,"Katraj");
        Demo d=new Demo("Maharastra",a,s);
        d.displayData();
    }
}
