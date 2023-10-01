import java.util.Scanner;
public class factorial
{
    int factorials(int a)
    {
        int f = 1;
        for(int i = a;i>=f;i++)
        {
            f = f*a;
        }
        return f;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = sc.nextInt();
        factorial obj = new factorial();
        int f = factorials(a);
    }
}