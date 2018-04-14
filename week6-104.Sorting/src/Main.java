
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write testcode here
        int[] values = {-1, 3, 1, 7, 4, 5, 2, 4, 3};
        System.out.println("smallest: " + smallest(values));
        System.out.println("Index of the smallest: " + indexOfTheSmallest(values));
        System.out.println("Index of the smallest starting from 0: " + indexOfTheSmallestStartingFrom(values, 0));
        System.out.println("Index of the smallest starting from 1: " + indexOfTheSmallestStartingFrom(values, 1));
        System.out.println("Index of the smallest starting from 2: " + indexOfTheSmallestStartingFrom(values, 2));
        System.out.println("Index of the smallest starting from 3: " + indexOfTheSmallestStartingFrom(values, 3));

//        the method indexOfTheSmallestStartingFrom did not work with the input -1, 3, 1, 2 startingIndex 1 expected:<2> but was:<1>
//        the method indexOfTheSmallestStartingFrom did not work with the input -1, 3, 1, 7, 4, 5, 2, 4, 3 startingIndex 1 expected:<2> but was:<1>
        swap(values, 1, 2);
        System.out.println(Arrays.toString(values));
        swap(values, 3, 4);
        System.out.println(Arrays.toString(values));
        
        sort(values);
    }

    public static int smallest(int[] array) {
        int smallest = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
            }

        }

        return smallest;
    }

    public static int indexOfTheSmallest(int[] array) {
        int indexOfTheSmallest = 0;

        int smallest = array[0];
        for (int i = 0; i < array.length; i++) {

            if (array[i] < smallest) {
                smallest = array[i];
                indexOfTheSmallest = i;
            }
        }

        return indexOfTheSmallest;
    }

    public static int indexOfTheSmallestStartingFrom(int[] array, int index) {
        int indexOfTheSmallestStartingFrom = 0;

        int smallest = array[index];
        for (int i = index; i < array.length; i++) {
            if (array[i] <= smallest) {
                smallest = array[i];
                indexOfTheSmallestStartingFrom = i;
            }
        }

        return indexOfTheSmallestStartingFrom;
    }

    public static void swap(int[] array, int index1, int index2) {
        int firstvalue = 0;
        int secondvalue = 0;
        firstvalue = array[index1];
        secondvalue = array[index2];
        for (int i = 0; i < array.length; i++) {
            array[index1] = secondvalue;
            array[index2] = firstvalue;
        }
    }

    public static void sort(int[] array) {
        int startingFrom = 0;

        while (startingFrom <= array.length - 1) {

            int indexOfSmallest = startingFrom;
            int smallest = array[startingFrom];

            for (int i = startingFrom; i < array.length; i++) {
                if (array[i] < smallest) {
                    smallest = array[i];
                    indexOfSmallest = i;
                }
            }

            int firstvalue = array[startingFrom];
            int secondvalue = array[indexOfSmallest];
            for (int i = 0; i < array.length; i++) {
                array[startingFrom] = secondvalue;
                array[indexOfSmallest] = firstvalue;
            }

            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }

            System.out.println("");

            startingFrom++;

        }
    }
}
