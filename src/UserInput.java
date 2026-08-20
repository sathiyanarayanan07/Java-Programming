import java.util.Scanner;

public class UserInput {

    public static void main(String[]  args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your number: ");
        int number = sc.nextInt();

        System.out.println("Name:" + name);
        System.out.println("Number: " + number);

        sc.close();

    }
}
