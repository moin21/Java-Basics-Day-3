import java.util.Arrays;
public class FrequencyOfElements {
    public static void main(String[] args) {
    int[] numbers = {1, 2, 1, 4, 3, 1, 3, 2, 5};
        int n = numbers.length;
        countFreq(numbers, n);
    }
    public static void countFreq(int arr[], int n) {
        boolean visited[] = new boolean[n];

        Arrays.fill(visited, false);

        for (int i = 0; i < n; i++) {

            if (visited[i] == true)
                continue;

            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    visited[j] = true;
                    count++;
                }
            }
            System.out.println(arr[i] + " " + count);
        }
    }
}
