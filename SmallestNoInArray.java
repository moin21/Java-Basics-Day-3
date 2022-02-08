import java.util.Arrays;

public class SmallestNoInArray {
    public static void main(String[] args) {
        int[] numbers = {4, 2, 5, 1, 9, 4, 0, -2};
        Arrays.sort(numbers);
        System.out.println(numbers[0]);
    }
}
