package chapter6.reviewQuestions13;
public class Test {
  Exception call() throws Error {
    return new Exception();
  }
  public static void main(String[] args) {
    new Test().call();
  }
}
