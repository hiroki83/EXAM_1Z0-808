package chapter5.overridingVsHidingMethods.case3;
public class Animal {
  public static boolean isBiped() {
    return false;
  }
  public void showAnimal() {
    System.out.println("Animal can Bipe:" + isBiped());
  }
}
