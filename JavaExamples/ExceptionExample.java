import java.util.*;


public class ExceptionExample {

    public static void main(String [] args) {
        int i=0;
        while (true) {
            System.out.print("Please enter some data: ");
            Scanner scanner = new Scanner(System.in);
            try {
                i = scanner.nextInt();
                break;
            } catch  (InputMismatchException e ) {
                System.err.println("This isn't an integer");
            }
        }
        System.out.println("i = " + i); 
    }
}



    
