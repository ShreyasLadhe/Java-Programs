import java.util.Scanner;

public class SimpleInterestCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Principal amount:");
        int P = sc.nextInt();

        System.out.println("Enter the Rate amount:");
        float R = sc.nextFloat();

        System.out.println("Enter the amount of Time:");
        int T = sc.nextInt();

        float Simple_Int;
        Simple_Int = (P * R * T)/100;

        System.out.println("The simple interest is: " + Simple_Int);

    }
}
