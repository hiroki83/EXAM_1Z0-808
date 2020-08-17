package chapter5.overridingVsHidingMethods.case1;
public class Kangaroo extends Animal{
  public boolean isBiped() {
    return true;
  }
  public void showKangaroo() {
    System.out.println("Kangaroo can bipe:"+isBiped());
  }
  public static void main(String[] args) {
    Kangaroo kangaroo = new Kangaroo();
    kangaroo.showAnimal();
    kangaroo.showKangaroo();
  }
}
