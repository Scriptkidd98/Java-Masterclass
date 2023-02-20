import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String, Integer> hs = new HashMap<String, Integer>();
        hs.put("Key1", 100);
        hs.put("Key2", 140);

        System.out.println(hs);
        System.out.println(hs.size());
    }
}
