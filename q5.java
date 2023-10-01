import java.util.Scanner;
class q5
{
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter tow numbers");
        int a =sc.nextInt();
        int b =sc.nextInt();
        int min = (a<b)?a:b;
        int hcf = 0;
        for(int i = min;i>=1;i--)
        {
            if(a%i == 0 && b %i == 0)
            {
                hcf = i;
                break;
            }
        }
        System.out.println("hcf is :"+hcf);
        

    }
}