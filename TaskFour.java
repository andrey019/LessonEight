import java.util.Scanner;

/**
 Вывести на экран сумму цифр заданного числа
 */
public class TaskFour {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("State the number: ");
        Integer number = scan.nextInt();
        String strnum = number.toString();
        int result = 0;

        for (int i = 0; i < strnum.length(); i++){
            String temp = strnum.substring(i,i+1);
            result += Integer.parseInt(temp);
        }

        System.out.print(result);
    }
}
