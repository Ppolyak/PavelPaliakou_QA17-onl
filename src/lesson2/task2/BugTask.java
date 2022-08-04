package lesson2.task2;

/**
 * задача выводит на экран минимальное число из 4 {14, 11, 10, 15}
 * getMinFromFour - из 4 чисел
 * getMinFromTwo - из 2 чисел
 * int secondPairResult = getMinFromTwo(d, b) - ошибка была в этой строке, не те переменные во второй паре;
 * нужно int secondPairResult = getMinFromTwo(c, d);
 **/
public class BugTask {
    public static void main(String[] args) {
        int minFromFour = getMinFromFour(14, 11, 10, 15);
        System.out.println(minFromFour);
    }

    public static int getMinFromFour(int a, int b, int c, int d) {
        int firstPairResult = getMinFromTwo(a, b);
        int secondPairResult = getMinFromTwo(c, d);

        return getMinFromTwo(firstPairResult, secondPairResult);
    }

    public static int getMinFromTwo(int a, int b) {
        if (a > b) {
            return b;
        } else {
            return a;
        }
    }
}
