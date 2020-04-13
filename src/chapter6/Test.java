package chapter6;
class Hopper {
  public void hop() { }
}
class Bunny extends Hopper {
  public void hop() throws IllegalStateException { }
}
