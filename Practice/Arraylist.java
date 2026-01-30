import java.util.ArrayList;

public class Arraylist {

    public static void main(String[] args) {
        
        ArrayList<String> a = new ArrayList<>();
        
        a.add("A");
        a.add("B");
        a.add("C");

        a.remove("A");

        a.add(1, "Z");

        System.out.println(a);
    }
}