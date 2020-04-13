package chapter5.ReviewQuestions19;
public class SnakeHandler {
  private Snake snake;
  public void setSnake(Snake snake) {this.snake = snake;}
  public static void main(String[] args) {
    new SnakeHandler().setSnake(new Animal());
  }
}
