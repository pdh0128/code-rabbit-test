import org.openjdk.jol.info.ClassLayout;

import java.awt.*;

public class Main {
  static class PPoint {
    int x;
    int y;
    int c;
    int a;
    int q;
  }
  public static void main(String[] args) {
    Rabbit rabbit = new Rabbit();
    Food food = new Apple();
    rabbit.eat(food);
  }
}

class Rabbit {
  static {
    System.out.println("Rabbit static block");
  }
  public Rabbit() {
    System.out.println("Rabbit constructor");
  }
  public void eat(Food food) {
    System.out.println("Rabbit eat and feel" + food.getTaste());
  }
}

interface Food {
  String getTaste();
}

class Apple implements Food {
  private String taste;
  {
    this.taste = "apple taste";
  }
  @Override
  public String getTaste() {
    return this.taste;
  }
}