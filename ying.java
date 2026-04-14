public class ying {
    public static void main(String[] args) {

        int[] arr = {100, 2000, 3000};

        int result = sum(arr);

        System.out.println("totle: " + result);
    }

    public static int sum(int[] arr) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        return sum;
    }
}