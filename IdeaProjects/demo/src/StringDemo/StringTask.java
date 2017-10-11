package StringDemo;
//String Buffer
public class StringTask
    {
      static double str2;
       static long str3;
       static long str4;
       static  void  usingString()
       {
           String s="sharyu";
           for (int i=0;i<2000;i++)
           {
               s.concat("institute");
           }
       }
       static  void usingStringBuffer() {
           StringBuffer b = new StringBuffer("broo");
           for (int i = 0; i < 2000; i++) {
               b.append("maja");
           }
       }
       static  void usingStringBuilder()
       {
           StringBuilder sb=new StringBuilder("hi");
           for (int i=0;i<2000;i++)
           {
               sb.append("hello");
           }

       }

        public static void main(String[] args) {
           str2=System.currentTimeMillis();
            StringTask.usingString();//class name method
            System.out.println("time for string: "+(System.currentTimeMillis()-str2)+"ms");

            str3=System.currentTimeMillis();
            StringTask.usingStringBuffer();
            System.out.println("time for stringBuffer: "+(System.currentTimeMillis()-str3)+"ms");

            str4=System.currentTimeMillis();
            StringTask.usingStringBuffer();
            System.out.println("time for stringBuilder: "+(System.currentTimeMillis()-str4)+"ms");
        }

}
