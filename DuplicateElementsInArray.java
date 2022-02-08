import java.util.Arrays;

public class DuplicateElementsInArray {
    public static void main(String[] args) {
        int[] numbers = {4, 2, 0, 5, 1, 9, 4, 0, -2};
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j])
                    System.out.println(numbers[j]);
            }
        }
    }
}