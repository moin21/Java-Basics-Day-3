import java.util.Arrays;

public class PrintElementsAtEvenPlaces {
    public static void main(String[] args) {
        int[] numbers = {4, 2, 5, 1, 9, 4, 0, -2};
        for (int i = 1; i < numbers.length; i = i + 2) {
            System.out.println(numbers[i]);
        }
    }
}