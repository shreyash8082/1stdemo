import java.util.Scanner;

class Unique {
    String str = "";
    String newstr = "";

    Unique() {
    }

    void readstring() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentence");
        str = sc.nextLine();
    }

    String MakeUnique(String wrd) {
        int l = wrd.length();
        String s[] = wrd.split("");
        String t = "";
        for (int i = 0; i < s.length; i++) {
            char ch = s[i].charAt(0); // Use charAt(0) to get the character at the current index.
            boolean isUnique = true;
            for (int j = 0; j < s.length; j++) {
                char ch1 = s[j].charAt(0);
                if (i != j && ch == ch1) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                t = t + ch;
            }
        }
        return t;
    }

    void change() {
        newstr = MakeUnique(str); // Call MakeUnique method and store the result in newstr.
    }

    void display() {
        System.out.println(str);
        System.out.println(newstr);
    }

    public static void main(String args[]) {
        Unique obj = new Unique();
        obj.readstring();
        obj.change();
        obj.display();
    }
}
