import org.openjdk.jol.info.ClassLayout;

public class Main {
  static class Point {
    int x;
    int y;
  }
  static class PPoint {
    int x;
    int y;
    int c;
    int a;
    int q;
  }
  public static void main(String[] args) {
    Point p = new Point();
    System.out.println(ClassLayout.parseInstance(p).toPrintable());
    PPoint pp = new PPoint();
    System.out.println(ClassLayout.parseInstance(pp).toPrintable());

  }
}
