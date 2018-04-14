
public class Main {

    public static void main(String[] args) {
        // write testcode here
        Person bence = new Person("Bence","000-34543535");
        
        System.out.println(bence.getName());
        System.out.println(bence.getNumber());
        bence.changeNumber("656546-6546");
        System.out.println(bence);
        System.out.println("");
        
        Phonebook phonebook=new Phonebook();
        phonebook.add("Bea", "34421321");
        phonebook.add("Kenny", "76867867");
        phonebook.printAll();
        System.out.println("");
        System.out.println("");
        String number = phonebook.searchNumber("Bea");
        System.out.println(number);
        
        number = phonebook.searchNumber("Kenny");
        System.out.println(number);
        
    }
}
