public class RandomNumberGame {
    public static void main(String[] args) {
        while (true) {
            int num = (int) (Math.random() * 10 + 1); // sung random function generate till 10 with 1 increment
            if (num == 5)
                break;
            if (num % 4 == 0)
                break;
            System.out.print(num + " ");
        }
    }
}
