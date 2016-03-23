import java.util.Scanner;

/**
 Написать программу для решения квадратных уравнений
 */
public class TaskSeven {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Example: a*x^2 + b*x + c = 0. 'a' must not be equal to 0");
        System.out.print("State the 'a': ");
        int vala = scan.nextInt();
        System.out.print("State the 'b': ");
        int valb = scan.nextInt();
        System.out.print("State the 'c': ");
        int valc = scan.nextInt();
        System.out.println("Your equation: " + vala + "*x^2 + " + valb + "*x + " + valc + " = 0");

        int discriminant = (int) Math.pow(valb, 2) - 4 * vala * valc;

        if (discriminant > 0){
            double root1 = ( -valb + Math.sqrt(Math.pow(valb, 2) - 4 * vala * valc) ) / (2 * vala);
            double root2 = ( -valb - Math.sqrt(Math.pow(valb, 2) - 4 * vala * valc) ) / (2 * vala);
            System.out.print("The first root is '" + root1 + "' and the second root is '" + root2 + "'");
            System.exit(1);
        } else if (discriminant == 0){
            double root = - ( valb / (2 * vala) );
            System.out.print("The root is '" + root + "'");
            System.exit(1);
        } else {
            System.out.print("There's no roots in this equation");
        }

    }
}
