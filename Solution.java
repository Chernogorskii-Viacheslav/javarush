package com.javarush.test.level09.lesson11.home05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Гласные и согласные буквы
Написать программу, которая вводит с клавиатуры строку текста.
Программа должна вывести на экран две строки:
1. первая строка содержит только гласные буквы
2. вторая - только согласные буквы и знаки препинания из введённой строки.
Буквы соединять пробелом, каждая строка должна заканчиваться пробелом.

Пример ввода:
Мама мыла раму.
Пример вывода:
а а ы а а у
М м м л р м .
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine(); // вводим строку
        char[] charArray = line.toCharArray(); //разбиваем строку на элементы
        String vowel = "";
        String consonant = "";
        sort(charArray, vowel, consonant);

    }


    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    //метод проверяет, гласная ли буква
    public static boolean isVowel(char c)
    {
        c = Character.toLowerCase(c);  //приводим символ в нижний регистр - от заглавных к строчным буквам

        for (char d : vowels)   //ищем среди массива гласных
        {
            if (c == d)
                return true;
        }
        return false;
    }

    public static void sort(char[] charArray, String str1, String str2)
    {
        for (int i = 0; i < charArray.length; i++)
        {
            if (charArray[i] == (' ')) continue; //пропускаем пустые элементы
            else
            {
                if (isVowel(charArray[i])) str1 = str1 + charArray[i] + " ";
                else str2 = str2 + charArray[i] + " ";
            }
        }
        System.out.println(str1);
        System.out.println(str2);

    }



}
