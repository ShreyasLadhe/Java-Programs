import java.util.Scanner;

public class CheckOddOrEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number you want to check for");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("The number is even");
        } else if ((num % 2) != 0) {
            System.out.println("The number is odd");
        } else {
            System.out.println("Invalid input");
        }
    }
}
