import java.util.Scanner;
class textpalin1
{
    String str = "";
    String palstr = "";
    textpalin1(String s)
    {
        str = s;
    }
    public static String reverse(String s)
    {
        int l = s.length();
        String temp = "";
        for(int i = 0; i<l;i++)
        {
            char ch = s.charAt(i);
            temp  = temp + ch;

        }
        return temp;
    }
    void palindrome()
    {
        String reversedStr = reverse(str);
        String t = "";
        int l = str.length();
        for(int i = l-1;i>0;i--)
        {
            char ch = str.charAt(i);
            t = t+ch;
        }
        palstr = reversedStr+t;
        
    }
    void display()
    {
        System.out.println("Original str:"+str);
        System.out.println("Reversed str:"+palstr);
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string");
        String s =sc.nextLine();
        textpalin1 obj = new textpalin1(s);
        obj.display();
        obj.palindrome();
        reverse(s);

    }
}