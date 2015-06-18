public class AssertException {

    public static int add(int a, int b) {
         return(0);
    }

    public static void main (String [] args) {

      int x = 3;
      int y = 4;

      int result = add(x,y);
//      assert (result == 7);
      assert result == 7: "Value should be 7!";
    }
}



