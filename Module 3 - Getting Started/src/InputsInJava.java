import java.util.Scanner;

public class InputsInJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*System.out.println("Enter your marks:");
        int marks = sc.nextInt();
        System.out.println("Your Marks are doubled to: " + marks * 2); */

        /* System.out.println("Enter the string you want to input: ");
        String str = sc.next(); // only reads till a white space character.
        System.out.println(str); */

        /*System.out.println("Enter the string you want to input: ");
        String str = sc.nextLine(); // reads the whole line.
        System.out.println(str); */

        char c = sc.next().charAt(2); // char input will take string input just use char at to specify address for a specific character you want to input
        System.out.println("The character you entered is: " + c);

    }
}
