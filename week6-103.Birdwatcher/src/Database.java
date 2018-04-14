
import java.util.ArrayList;
import java.util.Scanner;

public class Database {

    private ArrayList<Bird> birds;

    public Database() {
        this.birds = new ArrayList<Bird>();
    }

    public void menu(Scanner reader) {
        while (true) {
            System.out.print("? ");
            String input = reader.nextLine();
            if (input.equals("Quit")) {
                break;
            }
            if (input.equals("Add")) {
                this.addBird(reader);
            }
            if (input.equals("Statistics")) {
                this.statistics();
            }
            if (input.equals("Observation")) {
                this.observedBird(reader);
            }
            if (input.equals("Show")) {
                this.show(reader);
            }
        }
    }

    public void addBird(Scanner reader) {
        System.out.print("Name: ");
        String name = reader.nextLine();
        System.out.print("Latin name: ");
        String latinname = reader.nextLine();
        birds.add(new Bird(name, latinname));
    }

    public void observedBird(Scanner reader) {
        System.out.print("What was observed:? ");
        String observedBird = reader.nextLine();
        for (Bird bird : birds) {
            if (bird.name().equals(observedBird)) {
                bird.incrementObserved();
            } else {
                System.out.println("Is not a bird!");
            }
        }

    }

    public void statistics() {
        for (Bird bird : birds) {
            System.out.println(bird);
        }
    }

    public void show(Scanner reader) {
        System.out.print("What? ");
        String showBird = reader.nextLine();
        for (Bird bird : birds) {
            if (bird.name().equals(showBird)) {
                System.out.println(bird);
            }
        }
    }
}
