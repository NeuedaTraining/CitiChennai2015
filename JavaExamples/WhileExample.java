public class WhileExample {
  public static void main(String [] args) {

    int x = 10;

    while (x-- > 0) {
      if (x == 5) {
        System.exit(0);
      }
      System.out.println("x = " + x);
    }
  }
}
