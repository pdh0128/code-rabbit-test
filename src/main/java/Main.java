public class Main {
  public static void main(String[] args) {
    Rabbit rabbit = new Rabbit();
    Fox fox = new Fox();
    Bear bear = new Bear();

    Food apple = new Apple();

    rabbit.eat(apple);
    fox.eat(rabbit);
    bear.eat(fox);
    bear.eat(apple);
  }
}

class Rabbit implements Food {
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

  @Override
  public int getWeight() {
    return 3;
  }
}

class Fox implements Food {
  static {
    System.out.println("Fox static block");
  }

  public Fox() {
    System.out.println("Fox constructor");
  }

  public void eat(Food food) {
    System.out.println("Fox eats sneakily and tastes " + food.getTaste());
  }

  @Override
  public String getTaste() {
    return "foxy flavor";
  }

  @Override
  public int getWeight() {
    return 5;
  }
}

class Bear {
  static {
    System.out.println("Bear static block");
  }

  public Bear() {
    System.out.println("Bear constructor");
  }

  public void eat(Edible edible) {
    System.out.println("Bear chomps and says: this weighs " + edible.getWeight() + "kg!");
  }
}

interface Edible {
  int getWeight();
}

interface Food extends Edible {
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

  @Override
  public int getWeight() {
    return 1;
  }
}
