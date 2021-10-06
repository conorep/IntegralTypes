package primitives;

public class IntegerClasses
{
    public static void main(String[] args)
    {
        //assignBinary();
        //assignHex();

        // check our answers

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
        // integral types
        // byte holds 8 bits
        byte byteOne = 0x2A;
        // 2 x 16^1 + 10 x 16 ^ 0 = 42
        System.out.println("Decimal value: " + byteOne);

        // short, int, long have a toBinaryString() static method in their classes
        // declare a short and assign a hex value to it
        short shortOne = 0x2FFF;
        // 2 x 16^3 + 15 x 16^2 + 15 x 16^1 + 15 x 16^0 = 33616127
        System.out.println("Decimal value: " + shortOne);

        // int is 32 bits. every 4 bits represents one hex digit (0 - F)
        int num2 = 0x206A_FFFF;
        System.out.println("Decimal value: " + num2);
        System.out.println("Binary value: " + Integer.toBinaryString(num2));

    }
}
