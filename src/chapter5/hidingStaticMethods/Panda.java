package chapter5.hidingStaticMethods;
public class Panda extends Bear {
  public static void eat() {
    System.out.println("Panda bear is chewing");
  }
  public static void main(String[] args) {
    new Panda().eat();
    Bear bearPanda = new Panda();
    bearPanda.eat();
    Bear bear = new Bear();
    bear.eat();
  }
}
