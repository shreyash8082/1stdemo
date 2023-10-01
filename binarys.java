import java.util.Scanner;
public class binarys
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements");
        int a[] = new int[10];
        for(int i = 0;i<10;i++)
        {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter the element to be searched");
        int b = sc.nextInt();
        int flag = 0,l,u,m=0;
        l=0;
        u=9;
        while(l<=u)
        {
            m = (l+u)/2;
            
            if(b>a[m])
            {
                l = m+1;
            }
            
            else if( b > a[m])
            {
                l = m-1;
            }
            else
            {
                flag = 1;
                break;
            }


        }
        if(flag == 1)
        {
            System.out.println("Element found at:"+(m+1));
        }
        else{
            System.out.println("Element not found");
        }
    }
}