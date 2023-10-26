package HomeworkProblems;
import java.util.Scanner;

public class SquareAllIndices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        // Input Loop
        System.out.println("Enter the array elements: ");
        for (int i = 0; i < size; i++) {
            System.out.print("Enter the value for index " + i + ": ");
            arr[i] = sc.nextInt();
        }

        // Output Loop
        System.out.println("The output array is: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] * arr[i] + " ");
        }


    }
}
