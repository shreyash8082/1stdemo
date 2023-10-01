import java.util.Scanner;
class binary
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array");
        int a[] = new int[10];
        for(int i = 0;i<10;i++)
        {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter element to be searched");
        int s = sc.nextInt();
        int Flag = 0,l,u,m;
        l = 0;
        u = 9;
        m = (l+u)/2;
        
        while(l<=u)
        {
            
            if(s>a[m])
            {
                l = m+1;
            }
            else if(s<a[m])
            {
                u = m-1;
            }
            else
            {
                Flag = 1;
                break;

            }
            

        }
        if(Flag == 1)
        {
            System.out.println("Element found at:"+(m+1));
        }
        else{
            System.out.println("Element not found");
        }
        
        }
}