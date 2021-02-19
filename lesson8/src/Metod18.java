//Найти в строке не только запятые, но и другие знаки препинания. Подсчитать
////        общее их количество.

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Metod18 {

    public static void main(String[] args) {

            String str = " Найти в строке не только запятые, но и другие знаки препинания. Подсчитать общее их количество.";
            int n = 0;
        Pattern pattern = Pattern.compile("[.,—:;!?()]");
        Matcher m = pattern.matcher(str);
        while (m.find()) {
            n++;
        }
            System.out.println("У нас есть " + n + " знака препинания");

    }

}
