package chapter4.simpleLambdas;
import java.util.*;
public class Test {
  public static void main(String[] args) {
    List<String> bunnies = new ArrayList<>();
    bunnies.add("Long ear");
    bunnies.add("floppy");
    bunnies.add("hoppy");
    System.out.println(bunnies);
    bunnies.removeIf(s -> s.charAt(0) != 'h');
    System.out.println(bunnies);
  }
}
