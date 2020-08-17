package chapter5.overridingVsHidingMethods.case1;
public class Animal {
  public boolean isBiped() {
    return false;
  }
  public void showAnimal() {
    System.out.println("Animal can Bipe:" + isBiped());
  }
}
