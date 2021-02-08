//Напишите три цикла выполняющих многократное сложение строк, один с
//        помощью оператора сложения и String, другой с помощью StringBuilder и метода
//        append, а также аналогино для StringBuffer. Сравните скорость их выполнения.


public class Metod21 {

    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();
        long startTime1 = System.currentTimeMillis();
        String str1 = " ";
        for (int i = 1; i <= 50; i++) {

            str1 += "День сегодня морозный и солнечный!";
            System.out.println(str1);

        }

        Long endTime = System.currentTimeMillis();
        long timeSpent1 = endTime - startTime1;
        System.out.println("Цикл String выполнялся " + timeSpent1 + " миллисекунд");

        long startTime2 = System.currentTimeMillis();
        StringBuffer sb1 = new StringBuffer("");
        for (int a = 1; a <= 100; a++) {
            sb1.append("Всё самое лучшее случается неожиданно");
            System.out.println(sb1);

        }
        long end2 = System.currentTimeMillis();
        long timeSpent2 = end2 - startTime2;

        System.out.println("Цикл StringBuffer выполнялся " + timeSpent2 + " миллисекунд");

        long startTime3 = System.currentTimeMillis();
        StringBuilder sb2 = new StringBuilder();
        for (int b = 1; b <= 100; b++) {
            sb2.append("Сердце можно лечить только сердцем.");
            System.out.println(sb2);

        }
        long end3 = System.currentTimeMillis();
        long timeSpent3 = end3 - startTime3;
        System.out.println("Цикл StringBuilder выполнялся " + timeSpent3 + " миллисекунд");

        long end = System.currentTimeMillis();
        long timeSpent = end - startTime;

        System.out.println("Вся программа выполнялась " + timeSpent + " миллисекунд");

        if (timeSpent1>timeSpent2 & timeSpent1>timeSpent3){
            System.out.println("У цикла String самая большая скорость выполнения");
        } else if (timeSpent2>timeSpent1 & timeSpent2>timeSpent3) {
            System.out.println("У цикла StringBuffer самая большая скорость выполнения");
        } else {
            System.out.println("У цикла StringBuilder самая большая скорость выполнения");

        }

    }
}
