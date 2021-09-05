import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int value = input.nextInt();

        System.out.println("Enter your name: ");
        String name = input.next();

        System.out.println("Name: " + name + " Value: " + value);

        input.close();
    }
}
