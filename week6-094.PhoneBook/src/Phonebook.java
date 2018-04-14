
import java.util.ArrayList;


public class Phonebook {
    private ArrayList<Person> members;
    
    public Phonebook(){     
        this.members=new ArrayList<Person>();
    }
    
    public void add(String name, String number){
        Person person = new Person(name,number);
        
        this.members.add(person);
    }
    
    public void printAll(){
        for (Person member : members) {
            System.out.println(member);
        }
    }
    
    public String searchNumber(String name){
        String number = "";
        
        for (Person member : members) {
            if(member.getName().equals(name)){
                return number += member.getNumber();
            }
        }
        return  "number not known";
    }

}
