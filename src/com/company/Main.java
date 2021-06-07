package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {


    public static void main(String[] args) {


        /**Task26 введите с клавиатуры строку.Найти в строке не только запятые ,но и другие знаки препинания.
         Подсчитать общее их количество.**/

        String str = "We recommend % every! repository? include $a README, LICENSE, and .gitignore.";
        int numberOfPunctuationMarks = 0;
        char symbol;
        for (int i = 0; i < str.length(); i++) {
            symbol = str.charAt(i);
            if (symbol == ',' || symbol == '!' || symbol == '%' || symbol == '$' || symbol == '?' || symbol == '.') {
                numberOfPunctuationMarks++;
            }
        }
        System.out.println(numberOfPunctuationMarks);


        String str1 = "We recommend  every repository ? include a README, LICENSE, and .gitignore.";
        int points = 0;
        int pointCau = 0;
        int commas = 0;
        int commasCau = 0;
        int questionMark = 0;
        int quesCau = 0;
        while (points != -1 && commas != -1 && questionMark != -1) {
            points = str1.indexOf('.', points);
            commas = str1.indexOf(',', commas);
            questionMark = str1.indexOf('?', questionMark);
            if (points != -1) {
                points++;
                pointCau++;
            }
            if (commas != -1) {
                commas++;
                commasCau++;
            }
            if (questionMark != -1) {
                questionMark++;
                quesCau++;
            }

        }
        System.out.println("There are " + pointCau + " points , " + commasCau + " comas and " + quesCau + " question mark in a line");


        /**Task 27 введите с клавиатуры текст.Подсчитать количество слов в тексте.Учесть,что слова
         * могут разделяться несколькими пробелами ,в начале и в конце текста также могут быть пробелы ,но
         * могут и отсутствовать.**/

        String stroke = " Unicode value before and after the string, if it exists then removes the spaces and" +
                " returns the omitted string . ";
        String[] worldCount = stroke.split("[^ ?+$ ?+] +");
        for (int y = 0; y < worldCount.length; y++) {
        }
        System.out.println(worldCount.length);


        /**Task 28 введите с клавиатуры текст .Выведите на экран текст,составленный из последних букв всех слов из исходного текста.**/

        String text = " Supersonic flight is when an aircraft travels faster than the speed of sound.Overture is expected to " +
                "reach speeds of 1805 km/h. ";
        Pattern pattern = Pattern.compile("([a-z])\\b");//от a до z и только границу слова
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {//метод ищет соответствие заданному рег.выр..true если найденоодно соответ.,потом опять ищет другое соотв. true если еще одно найдено
            System.out.print(matcher.group());//String group -возвращает символы предыдущего найденного совпадения.
        }


        /**   Task 31 напишите два цикла выполняющих милион сложений строк,один с помощью оператора String,а
         * другой с помощью StringBuilder and metod append.Сравните скорость их выполнения и выведете на экран */

        long start = System.currentTimeMillis();
        String additionString = "aaabbbccc";
        int countAdditional = 0;
        String j = "";
        while (countAdditional < 100000) {
            countAdditional++;
            j += additionString;
        }
        System.out.println("Время выполнения в милисекундах,с помощью String=" + System.currentTimeMillis() + start);


        long start1 = System.currentTimeMillis();
        StringBuilder additionString1 = new StringBuilder("aaabbbccc");
        int n = 0;
        while (n <= 100000) {
            additionString1.append("aaabbbccc");
            n++;
        }
        System.out.println("Время выполнения в милисекундах,с помощью объекта StringBuilder=" + System.currentTimeMillis() + start1);
        long difference = 0;
        System.out.println("на " + (difference = start1 - start) + " милисекунд дольше считает через объект String");


        StringBuilder compare = new StringBuilder("abc");
        StringBuilder compare1 = new StringBuilder("abc");

        System.out.println("compare " + compare1.equals(compare));//false


        String a = "b";
        String b = "b";
        String c = "b";
        String e = new String("b");
        String d = new String("b");
        // System.out.println(e == d);//false
        //System.out.println(a == d);//felse
        // System.out.println("equals result " + e.equals(d));//true
        // System.out.println("equals result " + a.equals(e));//true;
        //System.out.println("a d equals result " + e.equals(d));//true
        int nb = 1;
        int bn = 2;
        //System.out.println( (--bn * nb++) / (--bn +nb++));
    }
}
