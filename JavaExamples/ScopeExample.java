public class ScopeExample {

    public static void main(String [] args) {

      Integer a = 10;

      System.out.println("a = " + a);
      a = myfunc(a);
      System.out.println("a = " + a);
    }



    public static Integer  myfunc(Integer a) {
        Integer b;
        b = a + 10;
        return(b);
    }
}


