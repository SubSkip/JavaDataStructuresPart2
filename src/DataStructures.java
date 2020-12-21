import java.util.*;
import java.lang.Math;

public class DataStructures {

    private int sum = 0;

    public void getSum() {

        int[] numbers = { 1, 2, 3, 4, 5 };
        for (int i = 0; i < 5; ++i) {
            sum += numbers[i];
        }
        System.out.println("The sum of the array is " + sum);
    }

    public void getOutput() {

        double[] exampleArray = { 1, 5, 6, 5, 4, 1 };
        double maximum = exampleArray[0]; // Variable name was misspelled in the instructions
        int index = 0;
        for (int i = 1; i < exampleArray.length; i++) {
            if (exampleArray[i] > maximum) {
                maximum = exampleArray[i];
                index = i;
            }
        }
        System.out.println("The answer is " + index + " but I have no idea why.");
        // The output is 2 but I have no idea why.
    }

    public void toPower() {
        int size; // Size of the array
        float power; // Index raised to power (ie power 2 = [0, 1, 4, 9, ....] index^2)

        Scanner input = new Scanner(System.in);
        System.out.println("Let's create an array!");
        System.out.println("Enter a number for the size of the array: ");
        size = input.nextInt();
        double[] numbers = new double[size];
        System.out.println("Enter a number the power to iterate the index values: ");
        power = input.nextFloat();
        for (int i = 0; i < size; i++) {
            numbers[i] = Math.pow(i, power);
        }

        System.out.println(Arrays.toString(numbers));
        input.close();
    }

    public static void main(String[] args) throws Exception {
        DataStructures nums = new DataStructures();
        // Part 1
        nums.getSum();
        System.out.println("**********");
        // Part 2
        nums.getOutput();
        System.out.println("**********");
        // Part 3
        nums.toPower();
    }
}
