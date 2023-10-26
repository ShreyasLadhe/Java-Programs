package HomeworkProblems;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array");
        int size = sc.nextInt();

        int arr[] = new int[size];
        int rev[] = new int[arr.length];

        //Input loop
        System.out.println("Enter the array elements: ");
        for (int i = 0; i < size; i++) {
            System.out.print("Enter the value for index " + i + ": ");
            arr[i] = sc.nextInt();
        }

        //Reverse the array
        for (int i = 0; i < arr.length; i++) {
            rev[i] = arr[size - 1 - i];
        }

        //Output Loop
        System.out.println("The output array is: ");
        for (int i = 0; i < size; i++) {
            System.out.print(rev[i] + " ");
        }
    }
}
