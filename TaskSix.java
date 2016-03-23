import java.util.Scanner;

/**
 Вывести на экран все простые числа, которые меньше
 заданного N
 */
public class TaskSix {
    private static boolean primeNumber(int number){
        for (int i = 2; i < number; i++){
            if ( (number % i) == 0 ){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("State the number: ");
        int number = scan.nextInt();
        int count = 0;
        StringBuilder result = new StringBuilder();

        for (int i = 2; i < number; i++){
            if (primeNumber(i)){
                result.append(i);
                result.append(' ');
                count++;
            }
        }

        System.out.print(count + " prime numbers found: " + result);
    }
}
