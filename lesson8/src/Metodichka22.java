//Написать программу, выполняющую поиск в строке шестнадцатеричных чисел,
//        записаных по правилам Java, с помощью регулярных выражений и вывести их на
//        страницу.

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Metodichka22 {

    public static void main(String[] args) {

        String text = "Добрые слова 0x45AfF несложно, но 0X1B эхо долго живет 0x88CD человеческих сердцах.";
        Pattern pat = Pattern.compile(".*0[Xx]?[0-9]?[a-fA-F]?[0-9].*");
        Matcher match = pat.matcher(text);

        while (match.find()) {
            System.out.print(match.group() + " ");

        }
    }
}
