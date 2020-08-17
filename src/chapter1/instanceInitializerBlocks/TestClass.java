package chapter1.instanceInitializerBlocks;
public class TestClass {
  public static void main(String[] args) {
    {System.out.println("Feathers");}
    TestClass testClass = new TestClass();
  }
  {System.out.println("Snowy");}
}
