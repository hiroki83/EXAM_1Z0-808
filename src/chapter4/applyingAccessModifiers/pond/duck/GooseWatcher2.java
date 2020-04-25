package chapter4.applyingAccessModifiers.pond.duck;
import chapter4.applyingAccessModifiers.pond.goose.Goose;
public class GooseWatcher2 extends Goose{
  public void watch() {
    Goose goose = new Goose();
    goose.floatInWater();
    GooseWatcher2 gooseWatcher = new GooseWatcher2();
    gooseWatcher.floatInWater();
    floatInWater();
  }
}
