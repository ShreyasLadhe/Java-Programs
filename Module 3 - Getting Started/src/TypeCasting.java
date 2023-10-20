public class TypeCasting {
    public static void main(String[] args) {

        //Widening Type Casting : small to large
        int x = 1000;
        long y = x;
        System.out.println(y);

        //Explicit Type Casting : large to small
        long a = 1000000;
        int b = (int) a; // specify the data type
        System.out.println(b);

        // Lossy Conversion
        int f = 2000;
        byte v = (byte) f;
        System.out.println(v);

    }
}
