package linkedin;

import java.util.HashMap;

public class HashMapTest {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap();
        map.put("apples", 3);
        map.put("oranges", 5);
        int apples = map.get("apples");
        map.put("apples", apples+5);
        System.out.println(map.get("apples"));
    }
}
