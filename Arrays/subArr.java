public class subArr {

    public static void find(int arr[]) {
        int ts = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {

            int start = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;
                int sum = 0;
                for (int k = start; k <= end; k++) {
                    // System.out.print(arr[k] + " ");
                    sum = sum + arr[k];

                }
                ts = ts + 1;
                System.out.println("sum = " + sum);
                if (maxSum < sum) {
                    maxSum = sum;
                }
                System.out.println();

            }
            System.out.println();
        }
        // System.out.print("ts = " + ts);
        System.out.println(maxSum);
    }

    public static void main(String[] args) {
        int arr[] = { 1, -2, 6, -1, 3 };
        find(arr);
    }
}
