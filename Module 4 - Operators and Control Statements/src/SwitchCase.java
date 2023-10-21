import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the month you want to check for ");
        int month = sc.nextInt();

        //Enhanced Switch Case
        switch (month) {
            case 1 -> {
                System.out.println("The month is January");
                System.out.println("There are 31 days");
            }
            case 2 -> {
                System.out.println("The month is February");
                System.out.println("There are 28 / 29 days");
            }
            case 3 -> {
                System.out.println("The month is March");
                System.out.println("There are 31 days");
            }
            case 4 -> {
                System.out.println("The month is April");
                System.out.println("There are 30 days");
            }
            case 5 -> {
                System.out.println("The month is May");
                System.out.println("There are 31 days");
            }
            case 6 -> {
                System.out.println("The month is June");
                System.out.println("There are 30 days");
            }
            case 7 -> {
                System.out.println("The month is July");
                System.out.println("There are 31 days");
            }
            case 8 -> {
                System.out.println("The month is August");
                System.out.println("There are 31 days");
            }
            case 9 -> {
                System.out.println("The month is September");
                System.out.println("There are 30 days");
            }
            case 10 -> {
                System.out.println("The month is October");
                System.out.println("There are 31 days");
            }
            case 11 -> {
                System.out.println("The month is November");
                System.out.println("There are 30 days");
            }
            case 12 -> {
                System.out.println("The month is December");
                System.out.println("There are 31 days");
            }
            default -> System.out.println("Invalid month number");
        }
    }
}
