package chapter3.arraySorting;

import java.util.Arrays;

public class TestClass {
    public static void main(String[] args) {
        int[] numbers = {6, 9, 1};
        Arrays.sort(numbers);
        for (int i = 0; i < numbers.length; i++)
            System.out.print(numbers[i] + "");
        System.out.print(numbers);
    }
}
