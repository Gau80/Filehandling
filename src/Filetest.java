import java.util.Scanner;
public class Filetest {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        try
        {
            System.out.println("Enter the number of elements");
            int n = s.nextInt();
            int[] arr = new int[n];
            System.out.println("Enter the elements");
            for(int i=0;i<n;i++)
            {
                int ele = s.nextInt();
                arr[i]=ele;
                ele=0;

            }
            System.out.println("Enter the index");
            int index =s.nextInt();
            System.out.println("the array element at index" + ' ' + index + ' '+ "=" + arr[index]);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
