import java.util.Arrays;

public class PrintElementsInReverse {
    public static void main(String[] args) {
        int[] numbers = {4, 2, 5, 1, 9, 4, 0, -2};
        for (int i = numbers.length-1;  i >= 0; i--) {
            System.out.println(numbers[i]);
        }
    }
}