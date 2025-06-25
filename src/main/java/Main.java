public class Main {
  public static void main(String[] args) {
    Rabbit rabbit = new Rabbit();
    Fox fox = new Fox();

    Food apple = new Apple();

    rabbit.eat(apple);
    fox.eat(rabbit);
  }
}

class Rabbit implements Food{
  static {
    System.out.println("Rabbit static block");
  }

  public Rabbit() {
    System.out.println("Rabbit constructor");
  }

  public void eat(Food food) {
    System.out.println("Rabbit eats and feels " + food.getTaste());
  }

  @Override
  public String getTaste() {
    return "rabbit taste";
  }
}

class Fox {
  static {
    System.out.println("Fox static block");
  }

  public Fox() {
    System.out.println("Fox constructor");
  }

  public void eat(Food food) {
    System.out.println("Fox eats sneakily and tastes " + food.getTaste());
  }
}

interface Food {
  String getTaste();
}

class Apple implements Food {
  private String taste;

  {
    this.taste = "sweet apple flavor";
  }

  @Override
  public String getTaste() {
    return this.taste;
  }
}
