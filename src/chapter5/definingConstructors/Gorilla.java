package chapter5.definingConstructors;
public class Gorilla extends Animal {
  public Gorilla(int age) {
    super(age, "Gorilla");
  }
  public Gorilla() {
    super(5);
  }
}
