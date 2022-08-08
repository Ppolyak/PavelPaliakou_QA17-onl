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
        System.out.println("Enter list");
        String alpha = scanner.next();
        char[] rus_symbols = {'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж', 'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о', 'п',
                'р', 'с', 'т', 'у', 'ф', 'х', 'ц', 'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я'};

        int[] count = new int[rus_symbols.length];

        for (int i = 0; i < rus_symbols.length; i++){
            for (int j = 0; j < alpha.length(); j++){
                if (rus_symbols[i] == alpha.charAt(j)){
                    count[i]++;
                }
            }
        }
//?
        for (int i = 0; i < count.length; i++){
            if (count[i] >= 0){
                System.out.println(rus_symbols[i] + " - " +  count[i] + " раз" + ((count[i] > 1 && count[i] < 5) ? "а" : "" ));
            }
        }
    }
}
