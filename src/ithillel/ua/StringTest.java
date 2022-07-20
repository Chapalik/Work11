package ithillel.ua;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class StringTest {
    public static void main(String[] args) {
        //2
        char[] chArr = {'c', 'h', 'a', 'r', ' ', 'a', 'r', 'r', 'a', 'y'};
        byte[] byteArr = "byte array".getBytes(StandardCharsets.UTF_8);

        String s1 = "literal";
        String s2 = new String("new String");
        String s3 = new String(chArr);
        String s4 = new String(byteArr, StandardCharsets.UTF_8);
        String s5 = new StringBuilder("StringBuilder").toString();

        //3
        String s31 = "Апельсин,Яблоко,Гранат,Груша";
        String[] strings = s31.split(",");

        String maxString = strings[0];
        int maxLength = maxString.length();

        for (String s :
                strings) {
            if (s.length() > maxLength) {
                maxString = s;
                maxLength = s.length();
            }
        }

        System.out.println("Longest string is " + maxString.toLowerCase());

        String substr = maxString.substring(0, 3);
        System.out.println("Substring of this string " + substr);

        String s35 = "   Я_новая_строка      ";
        s35 = s35.trim();
        s35 = s35.replace("_", " ");
        System.out.println("Changed string " + s35);

        Scanner sc = new Scanner(System.in);
        String s91 = sc.nextLine();
        sc.close();
        if (s91.startsWith("Запуск")) {
            System.out.println("Запускаем процесс");
        }
        if (s91.endsWith("завершен")) {
            System.out.println("Процесс завершен");
        }
        if (s91.toLowerCase().contains("ошибка")) {
            System.out.println("Произошла ошибка");
        }

        //4
        StringBuilder stringBuilder = new StringBuilder();
        String[] strings1 = new String[]{
                s1, s2, s3, s4, s5, s31, maxString, substr, s91
        };
        for (int i = 0; i < strings1.length; i++) {
            stringBuilder.append(strings1[i]);
            if (i % 3 == 0) {
                stringBuilder.append("\n");
            }
        }

        stringBuilder.reverse();
        String sbResult = stringBuilder.toString();
        System.out.println("StringBuilder string:");
        System.out.println(sbResult);

    }
}
