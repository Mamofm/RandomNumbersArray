import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class RandomNumbersArray {
    public static void main(String args[]) {
        int numbers[], origNumbs[], sz;
        Scanner keybd = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("How many number would you like to generate? ");
        sz = keybd.nextInt();

        numbers = new int[sz];

        for (int i = 0; i < sz; i++) {
            numbers[i] = rand.nextInt(11) + 30; // 0 to 10 + 30 = range 30 to 40
        }

        origNumbs = Arrays.copyOf (numbers, numbers.length);
        Arrays.sort(numbers);

        System.out.println("Original Numbers:");
        System.out.println(Arrays.toString(origNumbs));

        System.out.println("Sorted Numbers:");
        System.out.println(Arrays.toString(numbers));


    }
}