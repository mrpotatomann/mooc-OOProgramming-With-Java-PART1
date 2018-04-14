
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write testcode here
        int[] original = {1, 2, 3, 4};
        int[] copied = copy(original);

        System.out.println("Original: " + Arrays.toString(original));
        System.out.println("Copied: " + Arrays.toString(copied));

        copied[0] = 99;

        System.out.println("Copied: " + Arrays.toString(copied));

        int[] reversed = reverseCopy(original);
        System.out.println("Reversed: " + Arrays.toString(reversed));
        System.out.println();

    }

    public static int[] copy(int[] array) {
        int[] copiedOne = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            copiedOne[i] = array[i];
        }
        return copiedOne;
    }

    public static int[] reverseCopy(int[] array) {
        int[] reversedOne = new int[array.length];
        for (int i = 0; i < reversedOne.length; i++) {
            reversedOne[i] = array[array.length - i - 1];
        }
        return reversedOne;
    }

}
