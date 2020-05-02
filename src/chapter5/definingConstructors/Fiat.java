package chapter5.definingConstructors;
public class Fiat extends Car{
  public Fiat() {
    this(50);
  }
  public Fiat(int age) {
    System.out.println(age);
  }
}
