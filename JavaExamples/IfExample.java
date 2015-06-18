public class IfExample {
  public static void main(String[] args) {

    int a = 10;
    int y;

    if (a == 10) {
      System.out.println("a is 10");
    } else {
      System.out.println("a is not 10");
    }


    y = (a==10)?2:3;
    System.out.println("y = " + y);
    if (a == 10) {
      y=2;
    } else {
      y = 3;
    }
  }
}

