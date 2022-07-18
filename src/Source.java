import java.util.Arrays;

public class Source {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15};
        System.out.println(Arrays.equals(countPositivesSumNegatives(arr), new int[]{10, -65}));
    }
    public static int[] countPositivesSumNegatives(int[] input) {
        int pos = 0;
        int neg = 0;
        if (input!= null && input.length > 0) {
            for (int i = 0; i < input.length; i++) {
                if (input[i] > 0) {
                    pos++;
                } else {
                    neg += input[i];
                }
            }
            return new int[]{pos, neg};
        } else return new int[0];
    }
}
