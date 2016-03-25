import java.util.Scanner;

/**
 Проверить баланс круглых скобок в выражении. Пример: “((x – 8)+a(y – 1))”
 */
public class TaskTwo {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String[] examples = {"((x – 8)+a(y – 1))", "((x – 8))+a(y – 1))", "((x – 8)+a((y – 1))",
                             "((x – 8)+a(y – 1))(", "(()(()))"};  // good bad bad bad good

        for (int i = 0; i < examples.length; i++){
            System.out.println("Example " + (i + 1) + ": " + examples[i]);
        }

        System.out.print("State the number of example: ");
        int choise = scan.nextInt();
        while ( !((choise > 0) && (choise <= examples.length)) ){
            System.out.print("Wrong! Try again: ");
            choise = scan.nextInt();
        }

        String example = examples[choise - 1];
        int leftpos = 0;
        int rightpos = 0;

        while (true){                                             // checking algorithm
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