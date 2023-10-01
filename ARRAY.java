import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class ARRAY {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the input sequence of numbers
        System.out.print("Enter a sequence of numbers separated by spaces: ");
        String input = scanner.nextLine();
        String[] numbers = input.split(" ");

        // Create a HashMap to store the frequency of each number
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for (String numStr : numbers) {
            int num = Integer.parseInt(numStr);
            // Update the frequency in the map
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        int maxFrequency = 0;
        int result = Integer.MAX_VALUE; // Initialize result with the highest possible value

        for (Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            int number = entry.getKey();
            int frequency = entry.getValue();

            if (frequency > maxFrequency || (frequency == maxFrequency && number < result)) {
                maxFrequency = frequency;
                result = number;
            }
        }

        System.out.println("Number with the highest frequency: " + result);
    }
}
