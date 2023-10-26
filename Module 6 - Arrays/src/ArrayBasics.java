public class ArrayBasics {
    public static void main(String[] args) {
            int[] marks = new int[10];

            marks[0] = 10;
            marks[1] = 20;

            System.out.println(marks[0]);
            System.out.println(marks[1]);

            float[] percent = new float[10]; // array of floating numbers.
            System.out.println(percent[1]);

            String[] names = {"Shreyas", "Srijan", "Yuvraj"}; // array of strings
            System.out.println(names[0]);

            System.out.println(names.length); // no of elements in an array
    }
}