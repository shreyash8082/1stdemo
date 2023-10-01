import java.util.Scanner;
class palprime
{
    int start;
    int end;
    palprime(int a,int b)
    {
        start = a;
        end = b;
    }
    public int isPrime(int i)
    {
        int c =0;
        for(int j = 1;j<=i;j++)
        {
            
            if(i%j == 0)
            c++;

        }
        if(c==2)
        return 1;
        else
        return 0;

    }
    public int isPalin(int i)
    {
        int s = 0;
        int t = i;
        while(t!=0)
        {
            int r = t%10;
            s = s*10+r;
            t = t/10;
        }
        if(s == i)
        return 1;
        else
        return 0;
    }
    public void generate()
    {
        for(int i = start;i<=end;i++)
        {
            if(isPrime(i) == 1 && isPalin(i) == 1)
            {
                System.out.println(i);
            }
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter start");
        int start = sc.nextInt();
        System.out.println("Enter end");
        int end = sc.nextInt();
        palprime obj = new palprime(start, end);
        obj.generate();
        


    }
}