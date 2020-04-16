package chapter6.reviewQuestions19;
import java.io.IOException;
class Test {
  public static void main(String[] args) {
    try {
      System.out.println("work real hard");
    } catch (StackOverflowError e) {
    } catch (IOException e) {
    } catch (RuntimeException e) {
    }
  }
}
