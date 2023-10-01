import java.util.Scanner;
public class selection
{

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements");
        int min = 0;
        int a[] = new int[10];
        int pos = 0;
        for(int i =0;i<10;i++)
        {
            a[i] = sc.nextInt();
        }
        for(int i = 1;i<10;i++)
        {
            for(int j = i ;j<10;j++)
            {
                if(a[j] > a[i])
                {
                    min = a[j];
                    pos = j; 
                }
            }
            int t = a[i];
            a[i] = a[pos];
            a[pos] = t;
        }
        //swapping
        for(int i = 0; i<10;i++)
        {
            System.out.println("\t"+a[i]);
        }
        
    }
}