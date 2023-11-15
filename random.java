import java.util.Scanner
class random
{
    int[] array = { 1, 2, 3, 4, 5, 6, 7 };

random rand = new random();

for (int i = 0; i < array.length; i++) {
	int randomIndexToSwap = rand.nextInt(array.length);
	int temp = array[randomIndexToSwap];
	array[randomIndexToSwap] = array[i];
	array[i] = temp;
}

System.out.println(Arrays.toString(array));
}