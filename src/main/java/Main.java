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

  }
}

class Rabbit {
  static {
    System.out.println("Rabbit static block");
  }
  public Rabbit() {
    System.out.println("Rabbit constructor");
  }
}
