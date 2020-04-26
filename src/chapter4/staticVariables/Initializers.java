package chapter4.staticVariables;
import java.util.*;
public class Initializers {
  private static final ArrayList<String> values = new ArrayList<>();
  public static void main(String[] args) {
    values.add("changed");
    ArrayList<String> values2 = new ArrayList<>();
    values = values2;
  }
}
