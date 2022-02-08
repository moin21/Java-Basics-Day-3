import java.util.Arrays;

public class SortArrayAscendingOrder {
    public static void main(String[] args) {
        int[] numbers = {4, 2, 5, 1, 9, 4, 0, -2};
        Arrays.sort(numbers);
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}