package chapter5.creatingAbstractClasses;
public abstract class Animal {
  public abstract String name = "Undefined";
  protected int age;
  public void eat() {
    System.out.println("Animal is eating");
  }
  public abstract String getName();
}
