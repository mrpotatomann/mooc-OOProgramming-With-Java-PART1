
public class PrintingLikeBoss {

    // copy or rewrite the method of Assignment 39.1 here
    public static void printStars(int amount) {
        int i = 0;
        while (i < amount) {
            i++;
            System.out.print("*");
        }
        System.out.println();
    }

    public static void printWhitespaces(int amount) {
        // 40.1
        int i = 0;
        while (i < amount) {
            i++;
            System.out.print(" ");
        }
    }

    public static void printTriangle(int size) {
        // 40.2
        int i = 0;
        int whiteSpace = size;
        while (i < size) {
            printWhitespaces(--whiteSpace);
            i++;
            printStars(i);

        }
    }

    public static void xmasTree(int height) {
        // 40.3
        int i = 0;
        int star = 1;
        int whiteSpace = height;
        while (i < height) {
            printWhitespaces(--whiteSpace);
            i++;
            printStars(star);
            star += 2;
        }
        int x = 0;
        while (x < 2) {
            printWhitespaces(height - 2);
            printStars(3);
            x++;
        }

    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!

        printTriangle(5);
        System.out.println("---");
        xmasTree(4);
        System.out.println("---");
        xmasTree(10);
    }
}
