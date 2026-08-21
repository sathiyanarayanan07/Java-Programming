import  java.util.Scanner;
public class rectangle {

    public static void main (String[] args){

        // Calculate area of a rectangle

        double width = 0;
        double height = 0;
        double area = 0;

        Scanner sc = new Scanner(System.in);

        System.out.print(" Enter the width:  ");
        width = sc.nextDouble();

        System.out.print(" Enter the heigth:  ");
        height = sc.nextDouble();


        area = width * height;

        System.out.println(area);




        sc.close();

    }
}
