import java.util.Scanner;

class TextPalin {
    String str = "";

    TextPalin(String s) {
        str = s;
    }

    String generatePalindrome() {
        String reversedStr = reverse(str);
        return str + reversedStr;
    }

    String reverse(String input) {
        String reversed = "";
        int length = input.length();

        for (int i = length - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }

        return reversed;
    }

    void display() {
        System.out.println("Original string: " + str);
        String palindrome = generatePalindrome();
        System.out.println("Generated palindrome: " + palindrome);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string");
        String s = sc.nextLine();

        TextPalin obj = new TextPalin(s);
        obj.display();
    }
}