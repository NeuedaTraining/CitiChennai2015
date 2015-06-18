import java.util.*;

public class ArrayListExample {
    public static void main(String [] args) {
        ArrayList<String> list = new ArrayList<String>();

        list.add("Fee");
        list.add("Fi");
        list.add("Fo");
        list.add("Fum");
//        System.out.println("The Arraylist contains the following elements: " + list);
        for ( String s: list) {
            System.out.println("s = " + s);
        }

        Iterator itr = list.iterator();

        while (itr.hasNext()) {
          System.out.println(itr.next());
        }
    }
}
