import java.util.Scanner;

class PrimeFactor {
    int size;
    int arr[];

    PrimeFactor(int lim) {
        size = lim;
        arr = new int[size]; // Initialize the array with the specified size.
    }

    void fillArray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
    }

    void showPrimeFacts() {
        for (int i = 0; i < size; i++) {
            System.out.println("Prime factors of " + arr[i] + ":");
            for (int j = 2; j <= arr[i]; j++) {
                while (arr[i] % j == 0) {
                    System.out.println(j);
                    arr[i] /= j;
                }
            }
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size");
        int lim = sc.nextInt();
        PrimeFactor obj = new PrimeFactor(lim);
        obj.fillArray();
        obj.showPrimeFacts();
    }
}
