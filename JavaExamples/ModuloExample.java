import java.util.Scanner;

public class ModuloExample {

    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter some two integers: ");
        int i = scanner.nextInt();
        int j = scanner.nextInt();
        int result = i % j;
        System.out.println("output = " + result);
    }
}



    
