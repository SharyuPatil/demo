package ArrayDemo;

public class Demo {
    public static void main(String[] args) {
        int array[][]={{2,3,4},{5,6,7},{8,9,0}};
        for(int i=0;i<3; i++)
        {
            for (int j=0;j<3;j++) {
                System.out.print("\t"+array[i][j]);
            }
            System.out.println();
        }

    }

}
