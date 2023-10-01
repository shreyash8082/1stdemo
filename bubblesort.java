import java.util.Scanner;
public class bubblesort
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements");
        int a[] = new int[10];
        for(int i = 0 ;i< 10 ;i++)
        {
            a[i] = sc.nextInt();
        }
        for(int i = 0;i< 10-1;i++)
        {
            for(int j = 0 ;j<10-i-1;j++)
            {
                if(a[j] < a[j+1])
                {
                    int t = a[j];
                    a[j] = a[j+1];
                    a[j+1] = t;
                }
            }
        }
        for(int i = 0;i<10;i++)
        {
            System.out.println("\t"+a[i]);
        }
    }
}