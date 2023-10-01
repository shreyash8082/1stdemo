import java.util.Scanner;
class q3
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius");
        double r = sc.nextInt();
        if(r >= 0)
        {
            ra(r);
        }
        else
        {
            System.out.println("Enter again");
        }
    }
    public static void ra(double r)
    {
        System.out.println("Circumference is :"+(2*3.14*r));
    }
}