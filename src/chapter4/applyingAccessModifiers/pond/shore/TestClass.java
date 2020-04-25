package chapter4.applyingAccessModifiers.pond.shore;
import chapter4.applyingAccessModifiers.pond.goose.Goose;
public class TestClass extends Goose{
  public void watch() {
    Goose goose = new Goose();
    goose.floatInWater();
    TestClass gooseWatcher = new TestClass();
    gooseWatcher.floatInWater();
    floatInWater();
  }
}
