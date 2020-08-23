package chapter3.convertingBwtweenArrayAndList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListIntoArray {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("hawk");
        list.add("robin");
        Object[] objectArray = list.toArray();
        System.out.println(objectArray.length);
        String[] stringArray = list.toArray(new String[10]);
        System.out.println(stringArray.length);
    }
}
