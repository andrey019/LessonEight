import java.util.Scanner;

/**
 Проверить баланс круглых скобок в выражении. Пример: “((x – 8)+a(y – 1))”
 */
public class TaskTwo {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Input the test sequence: ");
        String example = scan.nextLine();
        int leftpos = 0;
        int rightpos = 0;

        while (true){
            leftpos = example.indexOf("(", leftpos);
            rightpos = example.indexOf(")", rightpos);
            if ( (leftpos == -1) || (rightpos == -1) ){
                System.out.print("Balance is not right");
                System.exit(1);
            }
            if (leftpos > rightpos){
                System.out.print("Balance is not right");
                System.exit(1);
            } else if ( rightpos != (example.length() - 1) ){
                leftpos++;
                rightpos++;
            } else if ( example.indexOf("(", leftpos + 1) != -1) {
                System.out.print("Balance is not right");
                System.exit(1);
            } else {
                System.out.print("Balance is ok");
                System.exit(1);
            }
        }
    }
}