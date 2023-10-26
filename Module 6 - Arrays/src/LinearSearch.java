import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter the array elements: ");
        //Input loop
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the value for " + i + ": ");
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the element you want to search: ");
        int key = sc.nextInt();

        int ans = -1;

        // Iterator over the array and update if the answer is found
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key){
                ans = i;
                break;
            }
        }

        System.out.println("The element is at the position: " + ans);
    }
}
