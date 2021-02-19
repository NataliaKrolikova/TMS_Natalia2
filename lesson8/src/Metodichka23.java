//Написать программу, выполняющую поиск в строке всех тегов абзацев, в т.ч. тех, у
//        которых есть параметры, например <p id=”p1”>, и замену их на простые теги
//        абзацев <p>.

public class Metodichka23 {

    public static void main(String[] args) {

        String str = "abc <p id=”p1”> jjj <p id p1 123 ert <p id=”p1”> wery cty id 35 rt5 <p id=”p1”>";
        str = str.replaceAll("<((p(\\s(id)?\\s?=\\s?\\W\\S+\\W)?)|(p.+?))>", "<p>");

        System.out.print(str);

    }
}
