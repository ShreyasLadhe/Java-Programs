import java.util.Scanner;

public class ArraysIO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] marks = new int[5];

        // taking input through loop

        for (int i = 0; i < marks.length; i++) {
            marks[i] = sc.nextInt();
        };

        // output through loop

        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + " ");
        }
    }
}
