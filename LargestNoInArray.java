import java.util.Arrays;

public class LargestNoInArray {
    public static void main(String[] args) {
        int[] numbers = {4, 2, 5, 1, 9, 4, 0};
        Arrays.sort(numbers);
        System.out.println(numbers[(numbers.length)-1]);
    }
}
