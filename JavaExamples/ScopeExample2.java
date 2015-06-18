import java.util.concurrent.atomic.AtomicInteger;

public class ScopeExample2 {

    public static void main(String [] args) {

      AtomicInteger a =  new AtomicInteger(10);

      System.out.println("a = " + a);
      myfunc(a);
      System.out.println("a = " + a);
    }



    public static AtomicInteger  myfunc(AtomicInteger a) {
         a.set(a.get() + 10) ;
        return(a);
    }
}


