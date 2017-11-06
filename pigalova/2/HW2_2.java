public class HW2_2 {
    public static void main(String args[])
    {
        int boundary = 19;

        for (int i=0; i< boundary; i++)
        {
            System.out.print(" " + i );
        }

        System.out.print("\n");

        for (int i = 0; i< boundary; i++)
        {
            System.out.print( i+ "+"+ boundary + "=");
            System.out.print(i+boundary+"  ");
        }

        System.out.print("\n");
    }
}
