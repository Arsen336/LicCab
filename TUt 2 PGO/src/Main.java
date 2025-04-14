import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {3, 4, 7, 10, 5, 8, 9};
        int[] filtered = filterEvenIndexOddValue(numbers);

        // результат
        for (int num : filtered) {
            System.out.print(num + " ");
    }
}
    public static int[] filterEvenIndexOddValue(int[] input) {
        ArrayList<Integer> resultList = new ArrayList<>();

        for (int i = 0; i < input.length; i += 2) { // только чётные индексы
            if (input[i] % 2 != 0) { // только нечётные значения
                resultList.add(input[i]);
            }
        }

        // Перевод ArrayList в обычный массив
        int[] resultArray = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            resultArray[i] = resultList.get(i);
        }

        return resultArray;
    }
}