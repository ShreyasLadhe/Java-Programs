package HomeworkProblems;
import java.util.Scanner;

public class CommanElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size1, size2;

        System.out.print("Enter the size for array 1: ");
        size1 = sc.nextInt();

        System.out.print("Enter the size for array 2: ");
        size2 = sc.nextInt();

        int[] arr1 = new int[size1];
        int[] arr2 = new int[size2];

        int big_size = Math.max(size1, size2);

        int ans[] = new int[big_size]; // worst case all are same

        //Input Loops
        System.out.println("Enter the elements for array 1: ");
        for (int i = 0; i < size1; i++) {
            System.out.print("Enter the value for index " + i + ": ");
            arr1[i] = sc.nextInt();
        }

        System.out.println("Enter the elements for array 2: ");
        for (int i = 0; i < size1; i++) {
            System.out.print("Enter the value for index " + i + ": ");
            arr2[i] = sc.nextInt();
        }

        // Common element check
        for (int i = 0; i < size1; i++) {
            for (int j = 0; j < size2; j++) {
                if (arr1[i] == arr2[j]) {
                    ans[i] = arr1[i];
                    break;
                }
            }
        }

        // Output Loop
        System.out.println("The output array is: ");
        for (int i = 0; i < big_size; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
