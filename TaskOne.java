/**
 Вывести на экран все буквы английского алфавита
 */
public class TaskOne {
    public static void main(String[] args){
        System.out.print("English alphabet: ");
        for (int i = 65; i < 91; i++){
            System.out.print((char)i + "" + (char)(i + 32) + " ");
        }
    }
}
