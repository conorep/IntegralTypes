package primitives;

public class IntegerClasses
{
    public static void main(String[] args)
    {
        assignBinary();

    }

    public static void assignBinary()
    {
        // integral types
        // byte can only hold 8 bits
        byte byteOne = 0b0101_1111; // can use underscore to separate
        System.out.println(byteOne);

        // 16 bits in a short
        short shortOne = 0b0111_0000_1111_1010;
        System.out.println(shortOne);

        // 32 bits in an int
        int intOne = 0b0101;
        System.out.println(intOne);

        // 64 bits in a long
        long longOne = 0b1000_000_000_0000L;
        System.out.println(longOne);

        // how many bits are in a Long?
        System.out.println("Num bits in Long: " + Long.SIZE);
        System.out.println("Min: " + Long.MIN_VALUE);
        System.out.println("Max: " + Long.MAX_VALUE);

    }

    public static void assignHex()
    {

    }
}
