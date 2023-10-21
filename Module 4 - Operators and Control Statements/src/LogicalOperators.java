import java.util.Scanner;

public class LogicalOperators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String citizenship = "Indian";

        System.out.println("Enter your age ");
        int age = sc.nextInt();

        // Logical AND Operator
        if (age >= 18 && citizenship.equals("Indian")) {
            System.out.println("The person may vote");
        }
        else {
            System.out.println("The person may not vote");
        }

        // Same cases for the other two logical operators

        // Logical OR Operator - ||
        // Logical NOT Operator - !
    }
}
