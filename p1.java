import java.util.Scanner;

class p1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter word");
        String a = sc.next();
        printAnagrams(a);
    }

    // Function to print all anagrams of a given word
    private static void printAnagrams(String word) {
        char[] chars = word.toCharArray();
        int n = chars.length;

        // Generate all possible permutations of the characters
        generateAnagrams(chars, n);
    }

    // Function to generate and print anagrams recursively
    private static void generateAnagrams(char[] chars, int n) {
        if (n <= 1) {
            // Base case: when there's only one character, print the permutation
            System.out.println(String.valueOf(chars));
        } else {
            for (int i = 0; i < n; i++) {
                // Swap the current character with the first character
                char temp = chars[i];
                chars[i] = chars[0];
                chars[0] = temp;
                // Recursively generate anagrams for the remaining characters
                generateAnagrams(chars, n - 1);

                // Swap the characters back to their original positions
                temp = chars[i];
                chars[i] = chars[0];
                chars[0] = temp;
            }
        }
    }
}
