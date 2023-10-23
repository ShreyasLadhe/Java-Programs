import java.util.Scanner;

public class LargestOfN_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size, i;
        int Max_val = Integer.MIN_VALUE;

        System.out.println("Enter the amount of numbers you want to compare for: ");
        size = sc.nextInt();

        for (i = 1; i <= size; i++) {
            int num = sc.nextInt();
            Max_val = Math.max(Max_val, num); //using Math function to compare as soon as we take input from the user
        }

        System.out.println("The Maximum value among the numbers is: " + Max_val);
    }
}
