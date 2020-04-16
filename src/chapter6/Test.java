package chapter6;
public class Test {
  public static void main(String[] args) {
    try {
      hop();
    } catch (Exception e) {
      System.out.println(e);
      System.out.println(e.getMessage());
      e.printStackTrace();
    }
  }
  private static void hop() {
    throw new RuntimeException("cannot hop");
  }
}
class Hopper {
  public void hop() { }
}
class Bunny extends Hopper {
  public void hop() throws IllegalStateException { }
}
