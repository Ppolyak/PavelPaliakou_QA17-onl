package lesson3.task2;

import java.util.Scanner;

/**
 * Постройте частотный словарь букв русского (или английского) алфавита.
 * Т.е. Сколько раз каждая бука алфавита повторяется в введенной строке.
 * Alphabet.put(“A”, 0)
 */

public class AlphabetTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter list ");
        String alpha = scanner.next();
        char[] rus_symbols = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q',
                'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

        int[] count = new int[rus_symbols.length];

        for (int i = 0; i < rus_symbols.length; i++){
            for (int j = 0; j < alpha.length(); j++){
                if (rus_symbols[i] == alpha.charAt(j)){
                    count[i]++;
                }
            }
        }

        for (int i = 0; i < count.length; i++){
                System.out.println(rus_symbols[i] + " → " +  count[i]);
        }
    }
}
