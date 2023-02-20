import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<String>();
        hs.add("Yo");
        hs.add("Wassup");
        hs.add("Punk");

        System.out.println(hs);
        System.out.println(hs.size());

        Iterator i = hs.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }

    }
}
