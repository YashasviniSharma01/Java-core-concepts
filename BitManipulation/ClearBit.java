package BitManipulation;

public class ClearBit {
    public static void main(String[] args) {
        int n=5;
        int pos=2;
        int bitMask= 1<<pos;
        int newBitMask= ~bitMask;

        int newNumber= n & newBitMask;
        System.out.println(newNumber);
    }

}
