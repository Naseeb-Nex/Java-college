import java.util.*;

public class dll {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<String>();
        ll.add("Naseeb");
        ll.add("Nex");
        ll.add("nas");
        ll.add("rex");

        System.out.println("List Before removing: ");
        Iterator<String> itr = ll.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }

        ll.remove("Naseeb");
        ll.remove(2);
        
        System.out.println("List After removing: ");
        Iterator<String> tr = ll.iterator();

        while(tr.hasNext()){
            System.out.println(tr.next());
        }
    }
}
