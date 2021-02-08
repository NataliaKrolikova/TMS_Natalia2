//Найти в строке не только запятые, но и другие знаки препинания. Подсчитать
////        общее их количество.

public class Metod18 {

    public static void main(String[] args) {

            String str = " Найти в строке не только запятые, но и другие знаки препинания. Подсчитать общее их количество.";
            int n = 0;
            char symbol;
            for (int i = 0; i < str.length(); i++) {
                symbol = str.charAt(i);
                if (symbol == ',' || symbol == '.' || symbol == '-') {
                    n++;
                }
            }
            System.out.println("У нас есть " + n + " знака препинания");

    }

}
