import java.util.Scanner;
class pal
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string");
        String s = sc.nextLine();
        int l = s.length();
        String t = "";
        for(int i = l-1;i>=0;i--)
        {
            char ch = s.charAt(i);
            t = t+ch;

        }
        System.out.println(t);
    }
}