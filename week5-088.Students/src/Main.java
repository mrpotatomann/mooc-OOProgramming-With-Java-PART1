
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write here the main program
        /*    Student bence = new Student("Frankl Bence","015133252");
        System.out.println("name: "+bence.getName());
        System.out.println("student number: "+bence.getStudentNumber());
        System.out.println(bence);
         */

        ArrayList<Student> list = new ArrayList<Student>();
        Scanner reader = new Scanner(System.in);
        while (true) {
            System.out.println("name:");
            String name = reader.nextLine();
            if (name.length() == 0) {
                break;
            }
            System.out.println("studentnumber:");
            String studentNumber = reader.nextLine();
            list.add(new Student(name, studentNumber));
        }

        for (Student student : list) {
            System.out.println(student);
        }
        System.out.println("");
        System.out.print("Give search term: ");
        String searchTerm = reader.nextLine();
        System.out.println("Result: ");
        for (Student student : list) {
            if(student.getName().contains(searchTerm)){
                System.out.println(student);
            }
        }

    }

}
