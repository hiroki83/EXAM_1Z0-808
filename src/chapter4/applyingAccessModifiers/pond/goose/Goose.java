package chapter4.applyingAccessModifiers.pond.goose;
import chapter4.applyingAccessModifiers.pond.shore.Bird;
public class Goose extends Bird {
  public void helpGooseSwim() {
    Goose other = new Goose();
    other.floatInWater();
    System.out.println(other.text);
  }
} 
