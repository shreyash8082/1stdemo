import java.util.Scanner;
class q1
{
    public static void avg(int a,int b,int c)
    {
        int avg = (a+b+c)/3;
        System.out.println(avg);
        return;

    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        avg(a,b,c);
    }
}