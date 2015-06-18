import java.util.Scanner;

public class MultiplyExample {

    public static void main(String [] args) {
        final int THRESHOLD=100;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter some two integers: ");
        int i = scanner.nextInt();
        int j = scanner.nextInt();
        int result = i * j;
//        System.out.println("output = " + result);
        if (result > THRESHOLD) {
            System.out.println("It's greater than " + THRESHOLD);
        } else if (result == THRESHOLD ) {
            System.out.println("It's equal to " + THRESHOLD);
        } else {
            System.out.println("It's less than " + THRESHOLD);
        }
    }
}



    
