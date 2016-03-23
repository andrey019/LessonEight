import java.util.Scanner;

/**
 Вычислить x^n
 */
public class TaskFive {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("State the number: ");
        int number = scan.nextInt();
        System.out.print("State the power of number: ");
        int power = scan.nextInt();

        int result = (int) Math.pow(number, power);

        System.out.print(result);
    }
}
