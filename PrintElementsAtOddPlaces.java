import java.util.Arrays;

public class PrintElementsAtOddPlaces {
    public static void main(String[] args) {
        int[] numbers = {4, 2, 5, 1, 9, 4, 0, -2};
        for (int i = 0; i < numbers.length; i = i + 2) {
            System.out.println(numbers[i]);
        }
    }
}