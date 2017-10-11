package EncapsulationDemo;

public class EncapDemo
{
    int id;
    String name;
    String city;
    public int getId()
    {
        return id;
    }
    public void setid(int id)
    {
        this.id=id;
    }
    public String getname()
    {
        return name;
    }
    public void setname(String name)
    {
        this.name=name;
    }
    public String getCity()
    {
        return city;
    }
    public void setcity(String city)
    {
        this.city=city;
    }
    public static void main(String[] args) {
        EncapDemo e=new EncapDemo();
        e.setid(3);
        e.setcity("kop");
        e.setname("sharyu");

    }


}

