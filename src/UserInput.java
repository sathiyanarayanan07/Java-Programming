import java.util.Scanner;

public class UserInput {

    public static void main(String[]  args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your number: ");
        int number = sc.nextInt();

        System.out.print("What is your gpa: ");
        double gpa = sc.nextDouble();

        System.out.print("Are You as student? true/false: ");
        boolean isStudent = sc.nextBoolean();

        System.out.println("Name:" + name);
        System.out.println("Number: " + number);
        System.out.println("Your gpa is: " + gpa);

        if(isStudent){
            System.out.println("You are enrolled as a student");
        }
        else {
            System.out.println("You are not enrolled as a student");
        }

        sc.close();

    }
}
