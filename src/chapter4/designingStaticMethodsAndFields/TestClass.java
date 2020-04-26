package chapter4.designingStaticMethodsAndFields;
public class TestClass {
  private int count1 = 0;
  private static int count2 = 0;
  public void print() {
    System.out.println(count1++);
    System.out.println(count2++);
  }
}
