
public class Main {

    public static void main(String[] args) {
        // test method here
        int[] array = {5, 1, 3, 9, 17};
        printElegantly(array);
    }

    public static void printElegantly(int[] array) {
        // Write code here
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                System.out.print(array[i]);
            } else {
                System.out.print(array[i] + ", ");
            }
        }
        System.out.println("");
    }
}
