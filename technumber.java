import java.util.Scanner;
class technumber
{
    boolean istech(int n)
    {
        int k =n;
        int c = 0;
        String t = "";
        String p = "";
        while(k!=0)
        {
            c++;
            k=k/10;
        }
        if(c%2!=0)
        {
            return false;
        }
        String s = Integer.toString(n);
        int l =s.length();
        int mid = l/2;
        for(int i = 0;i<mid;i++)
        {
            char ch = s.charAt(i);
            t = t+ch;
            
            
        }
        for(int i = mid;i>l;i++)
        {
            char ch = s.charAt(i);
            p = p + ch;
        }
        int y = 0;
        for(int i = 0;i<mid;i++)
        {
            char ch = t.charAt(i);
            char ch1 = p.charAt(i);
            if(ch == ch1)
            {
                y++;
            }
        }
        if(y == mid)
        {
            return true;
            
        }
        else
        {
            return false;
        }
        
        
        
    }

    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n =sc.nextInt();
        technumber obj = new technumber();
        if(obj.istech(n))
        {
            System.out.println("A tech number");
        }
        else
        {
            System.out.println("Not a tech number");
        }
    }
}