public class Main {
  public static void main(String[] args) {
    Rabbit rabbit = new Rabbit();
    Fox fox = new Fox();

    Food apple = new Apple();
    Food grape = new Grape();

    rabbit.eat(apple);
    fox.eat(grape);
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
    System.out.println("Rabbit eats and feels " + food.getTaste());
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

class Grape implements Food {
  private String taste;

  {
    this.taste = "juicy grape flavor";
  }

  @Override
  public String getTaste() {
    return this.taste;
  }
}
