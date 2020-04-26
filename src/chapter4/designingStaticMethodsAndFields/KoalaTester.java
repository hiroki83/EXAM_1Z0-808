package chapter4.designingStaticMethodsAndFields;
import chapter4.designingStaticMethodsAndFields.TestClass;
public class KoalaTester {
  public static void main(String[] args) {
    System.out.println("Start Koala");
    Koala.main(new String[0]);
    Koala.main(new String[0]);
    Koala.main(new String[0]);
    Koala.main(new String[0]);
    Koala.main(new String[0]);
    Koala.main(new String[0]);
    Koala.main(new String[0]);
    System.out.println("Start TestClass");
    TestClass testClass = new TestClass();
    testClass.print();
    testClass.print();
    testClass.print();
    testClass.print();
    testClass.print();
    testClass.print();
    testClass.print();
    System.out.println("Start TestClass");
    TestClass testClass1 = new TestClass();
    testClass1.print();
    testClass1.print();
    testClass1.print();
    testClass1.print();
    testClass1.print();
    testClass1.print();
    testClass1.print();
  }
}
