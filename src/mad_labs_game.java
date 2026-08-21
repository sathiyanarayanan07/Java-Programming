import javax.sql.rowset.serial.SQLOutputImpl;
import java.sql.SQLOutput;
import  java.util.Scanner;

public class mad_labs_game {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String adjective1;
        String none1;
        String adjective2;
        String verb1;
        String adjective3;

        System.out.print("Enter an adjective (description): ");
        adjective1 = sc.nextLine();
        System.out.print("Enter a noun (animal or person): ");
        none1 = sc.nextLine();
        System.out.print("Enter an adjective (description): ");
        adjective2 = sc.nextLine();
        System.out.print("Enter a verb end with -ing (action): ");
        verb1 = sc.nextLine();
        System.out.print("Enter an adjective (description): ");
        adjective3 = sc.nextLine();



        System.out.println("Today I went to a " +  adjective1 + " zoo.");
        System.out.println(" In a exhibit, I saw a " + none1 + ".");
        System.out.println(none1 + " was " + adjective2 + " and " + verb1 + "!");
        System.out.println(" I was " + adjective3 + "!");

        sc.close();

    }
}
