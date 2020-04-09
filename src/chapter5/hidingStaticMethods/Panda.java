package chapter5.hidingStaticMethods;
public class Panda extends Bear {
  public void eat() {
    System.out.println("Panda bear is chewing");
  }
  public static void main(String[] args) {
    new Panda().eat();
  }
}
