package chapter3_20200821;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestClass2 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 5, 2, -1);
        Collections.sort(list);
        Integer[] array = list.toArray(new Integer[4]);
        System.out.println(array.length);
        for (Integer num : array) {
            System.out.println(num);
        }
    }
}
