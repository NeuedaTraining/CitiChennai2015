public class ArrayExample {

  public static void main(String [] args)  {

    int argc;
    System.err.println("I have " + args.length + " arguments passed to me");
    for (argc=0;argc< args.length;argc++) {
      System.out.println(args[argc]);
    }
  }
}

