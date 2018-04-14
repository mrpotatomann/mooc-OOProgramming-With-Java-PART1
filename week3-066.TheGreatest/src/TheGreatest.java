import java.util.*;

public class TheGreatest {
    public static int greatest(ArrayList<Integer> lista) {
        // write code here
        Collections.sort(lista);

        int greatest = lista.get(lista.size()-1);
        return greatest;
    }

    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<Integer>();
        lista.add(3);
        lista.add(2);
        lista.add(7);
        lista.add(2);
        
        System.out.println("The greatest number is: " + greatest(lista));
    }
}
