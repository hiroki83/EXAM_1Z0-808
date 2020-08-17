package chapter5.overridingVsHidingMethods.case2;
public class Kangaroo extends Animal {
  public boolean isBiped() {
    return true;
  }
  public void showKangaroo() {
    System.out.println("Kangaroo can Bipe:" + isBiped());
  }
  public static void main(String[] args) {
    Animal animal = new Kangaroo();
    animal.showAnimal();
    Kangaroo kangaroo = new Kangaroo();
    kangaroo.showAnimal();
    kangaroo.showKangaroo();
  }
}
