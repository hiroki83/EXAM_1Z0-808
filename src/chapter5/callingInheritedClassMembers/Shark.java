package chapter5.callingInheritedClassMembers;
class Fish {
  protected int size;
  private int age;

  public Fish(int age) {
    this.age = age;
  }
  public int getAge() {
    return age;
  }
}

public class Shark extends Fish {
  protected int size;
  private int numberOfFins = 8;

  public Shark(int age) {
    super(age);
    this.size = 4;
  }
  public void displaySharkDetails() {
    System.out.print("Shark with age: "+getAge());
    System.out.print(" and "+this.size+" meters long");
    System.out.println(" with "+numberOfFins+" fins");
    System.out.print("Shark with age: "+getAge());
    System.out.print(" and "+super.size+" meters long");
    System.out.println(" with "+numberOfFins+" fins");
  }
  public static void main(String[] args) {
    Shark shark = new Shark(Integer.parseInt(args[0]));
    shark.displaySharkDetails();
  }
}
