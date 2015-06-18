import java.util.Scanner;

public class ScannerExample {

    public static void main(String [] args) {
        System.out.print("Please enter some data: ");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int i = scanner.nextInt();
        double d = scanner.nextDouble();
        System.out.println("s = " + s + " d = " + d + " i = " + i + "\n");
    }
}



    
