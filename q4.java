import java.util.Scanner;
class q4
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age");
        int a =sc.nextInt();
        if(iseligible(a))
        {
            System.out.println("Person is eligible");
        }
        else{
            System.out.println("Person is not eligible");
        }

    }
     public static boolean iseligible(int a)
    {
        if(a>=18)
        {
            return true;
        }
        else{
            return false;
        }
    }
}