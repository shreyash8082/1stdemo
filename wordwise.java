import java.util.Scanner;
class wordwise
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String s = sc.nextLine();
        s = s.trim();
        int vowel = 0;
        char b[]= {'a','i','e','o','u','A','E','I','O','U'};
        int k = b.length;
        
        String a[] = s.split(" ");
        int l = a.length;
        for(int i = 0 ;i<l;i++)
        {
            String t = a[i];
            for(int j = 0;j<t.length();j++)
            {
                char ch = t.charAt(i);
                for(int o = 0;o<k;o++)
                {
                    if(ch == b[o])
                    {
                        vowel++;

                    }
                }
                System.out.println(a[i]);
                System.out.println(vowel);
                vowel = 0;
                
            }
            
            
            

        }
    }
}