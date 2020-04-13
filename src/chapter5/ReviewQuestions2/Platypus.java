package chapter5.ReviewQuestions2;
class Mammal {
  public Mammal(int age) {
    System.out.println("Mammal");
  }
}
public class Platypus extends Mammal {
  public Platypus() {
    System.out.print("Platypus");
  }
  public static void main(String[] args) {
    new Mammal(5);
  }
}
