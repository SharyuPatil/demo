package StringDemo;

public class StringMethods {
    void charAtExp()
    {
        String s2="sharyu";
        char ch=s2.charAt(4);
        System.out.println(ch);

    }
    void lengthExp()
    {
        String nm="sharyu";
        int count=nm.length();
        System.out.println(count);
    }



    public static void main(String[] args) {
        StringMethods s= new StringMethods();
        s.charAtExp();
        s.lengthExp();
    }
}
