import java.util.Scanner;

/**
 Дан словарь в виде «англ. слово=русское слово, англ.
 слово=русское слово,…». Написать программу переводчик
 на основе словаря
 */
public class TaskThree {
    private static String translate(String database, String word){
        String result;
        int index = database.indexOf(word);

        if (index == -1){
            System.out.print("Not in database");
            System.exit(1);
        }

        if ( (int) database.charAt(index) > 123 ){
            result = rusToEng(database, word, index);
            return result;
        } else {
            result = engToRus(database, word, index);
            return result;
        }
    }

    private static String rusToEng(String database, String word, int index){
        char tempchar = '1';
        int start = index;
        int end = index - 1;
        while ( !( (tempchar == ' ') || (start == 0) ) ){
            start--;
            tempchar = database.charAt(start);
        }
        if (start != 0){
            start++;
        }
        return database.substring(start, end);
    }

    private static String engToRus(String database, String word, int index){
        char tempchar = '1';
        int start = index + word.length() + 1;
        int end = start;
        while ( !( (tempchar == ',') || (end == database.length() - 1) ) ){
            end++;
            tempchar = database.charAt(end);
        }
        if (end == database.length() - 1){
            end++;
        }
        return database.substring(start, end);
    }

    public static void main(String[] args){
        String database = "dog=собака, cat=кот, mouse=мыша, arm=рука, head=голова";
        Scanner scan = new Scanner(System.in);
        System.out.print("State the word to translate: ");
        String word = scan.nextLine();
        word = word.toLowerCase();

        System.out.print("Translation: " + translate(database, word));
    }
}
