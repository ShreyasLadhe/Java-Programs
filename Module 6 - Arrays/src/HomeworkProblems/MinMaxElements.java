package HomeworkProblems;
import java.util.Scanner;

public class MinMaxElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        //Input Loop
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            System.out.print("Enter value for the index " + i + ": ");
            arr[i] = sc.nextInt();
        }

        //Min Max check
        int min = 0;
        int max = 0;

        for (int i = 0; i < size; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        for (int i = 0; i < size; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        //Output
        System.out.println("The minimum element is: " + min);
        System.out.println("The maximum element is: " + max);

    }
}
