package GitCowls;

public class LinearSearch {
    public static void main(String[] args) {
    int[] arr = {14, 11, 23, 45, 76, 5, 6, 89, 76, -11};             // For eg.
    int target = 76;
    int ans = LinearSearchFn(arr, target);
        System.out.println(ans);

    }

    static int LinearSearchFn(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;                                            // if item not found --> return -1
        }

        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }

        return -1;
    }
}
