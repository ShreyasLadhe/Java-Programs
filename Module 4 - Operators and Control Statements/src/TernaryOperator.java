import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number you want to check for");
        int num = sc.nextInt();

        String ans = num % 2 == 0 ? "Even" : "Odd"; // Condition ? true : false

        System.out.println(ans);
    }
}
