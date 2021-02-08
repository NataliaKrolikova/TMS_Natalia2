//Имеется строка с текстом. Вывести текст, составленный из последних букв всех слов.

public class Metod20 {

    public static void main(String[] args) {

        String str = "Имеется строка с текстом. Вывести текст, составленный из последних букв всех слов.";
        StringBuilder res = new StringBuilder();
        str = str.replaceAll("[!.,:;-]", "");

        String [] words = str.split(" ");
        for ( String word : words )
            res.append(word.toCharArray()[word.length() - 1]);

        System.out.println("Строка: " + str);
        System.out.println("Новая строка: " + res.toString());

    }
}
