import java.util.Scanner;
class insertionsort
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements");
        int a[] = new int[10];
        for(int i = 0; i <10;i++)
        {
            a[i] = sc.nextInt();
        }
        for(int i = 0 ; i <10;i++)
        {
            int c = a[i];
            int j = i-1;
            while( j >= 0 && a[j] > c)
            {
                a[j+1] = a[j];
                --j;
            }
            a[j+1] = c;

        }
        for(int i = 0 ;i<10;i++)
        {
            System.out.println("\t"+a[i]);
        }
    }
}